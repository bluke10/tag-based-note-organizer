import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Note {
    private String content;
    private Set<String> tags;

    public Note(String content, Set<String> tags) {
        this.content = content;
        // Defensive copy to protect internal state
        this.tags = new HashSet<>(tags);
    }

    public String getContent() {
        return content;
    }

    public Set<String> getTags() {
        // Return a copy to prevent external modification
        return new HashSet<>(tags);
    }

    public void addTag(String tag) {
        tags.add(tag.toLowerCase());
    }

    public void removeTag(String tag) {
        tags.remove(tag.toLowerCase());
    }

    public boolean hasTag(String tag) {
        return tags.contains(tag.toLowerCase());
    }

    @Override
    public String toString() {
        return "Note{" +
                "content='" + content + '\'' +
                ", tags=" + tags +
                '}';
    }

    // Optional but good practice (useful for comparisons, sets, etc.)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;
        Note note = (Note) o;
        return Objects.equals(content, note.content) &&
                Objects.equals(tags, note.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, tags);
    }
}