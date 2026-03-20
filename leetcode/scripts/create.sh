#!/usr/bin/env bash

set -euo pipefail

directory_name="${1:-}"
difficulty="${2:-}"

if [ -z "$directory_name" ] || [ -z "$difficulty" ]; then
    echo "Usage: $0 <directory_name> <difficulty>"
    exit 1
fi

case "$difficulty" in
    easy|medium|hard)
        ;;
    *)
        echo "Error: difficulty must be one of: easy, medium, hard"
        exit 1
        ;;
esac

class_name="${directory_name^}"
test_class_name="${class_name}Test"

main_dir="src/main/java/leetcode/$difficulty/$directory_name"
test_dir="src/test/java/leetcode/$difficulty/$directory_name"
main_file="$main_dir/$class_name.java"
readme_file="$main_dir/README.md"
test_file="$test_dir/$test_class_name.java"
package_name="leetcode.$difficulty.$directory_name"

if [ -d "$main_dir" ] || [ -d "$test_dir" ]; then
    echo "Error: target directory already exists for '$difficulty/$directory_name'"
    exit 1
fi

mkdir -p "$main_dir" || {
    echo "Error: failed to create directory '$main_dir'"
    exit 1
}

mkdir -p "$test_dir" || {
    echo "Error: failed to create directory '$test_dir'"
    exit 1
}

cat <<EOF > "$main_file"
package $package_name;

public class $class_name {

}
EOF

touch "$readme_file" || {
    echo "Error: failed to create file '$readme_file'"
    exit 1
}

cat <<EOF > "$test_file"
package $package_name;

import org.junit.jupiter.api.Test;

class $test_class_name {

    @Test
    void placeholder() {

    }
}
EOF

echo "Created:"
echo "  $main_dir"
echo "  $main_file"
echo "  $readme_file"
echo "  $test_dir"
echo "  $test_file"
