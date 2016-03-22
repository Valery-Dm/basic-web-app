package tutorial.core.models.entities;

import javax.persistence.*;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/19/16.</p>
 *
 * <p>Links blog entry to a particular blog</p>
 */
@Entity
public class BlogEntry {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    @ManyToOne
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
