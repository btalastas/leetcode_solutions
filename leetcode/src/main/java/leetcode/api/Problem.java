package leetcode.api;

import java.util.List;

public class Problem {
    private String id;
    private String title;
    private String difficulty;
    private List<String> tags;
    private String summary;
    private List<ProblemMethod> methods;

    public Problem() {
    }

    public Problem(String id, String title, String difficulty, List<String> tags, String summary,
            List<ProblemMethod> methods) {
        this.id = id;
        this.title = title;
        this.difficulty = difficulty;
        this.tags = tags;
        this.summary = summary;
        this.methods = methods;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<ProblemMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<ProblemMethod> methods) {
        this.methods = methods;
    }
}
