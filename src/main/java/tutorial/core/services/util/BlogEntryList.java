package tutorial.core.services.util;

import tutorial.core.models.entities.BlogEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/20/16.</p>
 *
 * <p>Will be used by Resource Assembler to assemble a group of blog entries</p>
 */
public class BlogEntryList {
    private List<BlogEntry> entries = new ArrayList<BlogEntry>();
    private Long blogId;

    public BlogEntryList(Long blogId, List<BlogEntry> entries) {
        this.blogId = blogId;
        this.entries = entries;
    }

    public List<BlogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<BlogEntry> entries) {
        this.entries = entries;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }
}
