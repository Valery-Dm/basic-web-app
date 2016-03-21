package tutorial.core.models.entities;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/20/16.</p>
 *
 * <p>Useful information to link a particular blog with its author</p>
 */
public class Blog {
    private Long id;
    private String title;
    private Account owner;

    public Blog() {}

    public Blog(String title) {
        //TODO generate id
        setTitle(title);
        // owner would be null
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }
}
