package leetcode.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/problems")
public class ProblemController {

    private final List<Problem> problems;

    public ProblemController() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream is = getClass().getResourceAsStream("/problems.json")) {
            if (is == null) {
                throw new IOException("problems.json resource not found");
            }
            Map<String, List<Problem>> root = objectMapper.readValue(is, new TypeReference<>() {});
            this.problems = root.getOrDefault("problems", List.of());
        }
    }

    @GetMapping
    public ResponseEntity<List<Problem>> listProblems() {
        return ResponseEntity.ok(problems);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Problem> getProblem(@PathVariable String id) {
        return problems.stream()
                .filter(p -> p.getId().equalsIgnoreCase(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/summary")
    public ResponseEntity<Map<String, Long>> summary() {
        Map<String, Long> stats = problems.stream().collect(Collectors.groupingBy(Problem::getDifficulty, Collectors.counting()));
        return ResponseEntity.ok(stats);
    }
}
