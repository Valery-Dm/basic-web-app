package tutorial.core.services.util;

import tutorial.core.models.entities.Blog;

import java.util.ArrayList;
import java.util.List;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/20/16.</p>
 *
 * <p>Will be used by Resource Assembler to assemble a group of blogs</p>
 */
public class BlogList {
    private List<Blog> blogs = new ArrayList<Blog>();

    public BlogList(List resultList) {
        this.blogs = resultList;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
