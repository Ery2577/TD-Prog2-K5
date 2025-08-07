package Devoir;

public class Publication {
    private final User author;
    private final String content;
    private final LocalDateTime createdAt;
    private final List<Comment> comments = new ArrayList<>();

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.createdAt = LocalDateTime.now();

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public User getAuthor() { return author; }
    public String getContent() { return content; }
    public List<Comment> getComments() { return comments; }
}

}

