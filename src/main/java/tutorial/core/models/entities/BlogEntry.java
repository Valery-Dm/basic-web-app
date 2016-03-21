package tutorial.core.models.entities;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/19/16.</p>
 *
 * <p>Links blog entry to a particular blog</p>
 */
public class BlogEntry {
    private Long id;
    private String title;
    private Blog blog;

    public BlogEntry() {}

    public BlogEntry(String title) {
        //TODO generate BlogEntry id
        setTitle(title);
        // don't belong to any blog in particular
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

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

}
