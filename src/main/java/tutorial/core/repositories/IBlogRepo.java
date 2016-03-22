package tutorial.core.repositories;

import tutorial.core.models.entities.Blog;

import java.util.List;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/22/16.</p>
 */
public interface IBlogRepo {
    Blog createBlog(Blog data);
    List<Blog> findAllBlogs();
    Blog findBlog(Long id);
    Blog findBlogByTitle(String title);
    List<Blog> findBlogsByAccount(Long accountId);
}
