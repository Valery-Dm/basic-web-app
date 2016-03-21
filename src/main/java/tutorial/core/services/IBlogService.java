package tutorial.core.services;

import tutorial.core.models.entities.Blog;
import tutorial.core.models.entities.BlogEntry;
import tutorial.core.services.util.BlogEntryList;
import tutorial.core.services.util.BlogList;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/20/16.</p>
 */
public interface IBlogService {
    BlogEntry createBlogEntry(Long BlogId, BlogEntry data);
    Blog findBlog(Long blogId);
    BlogEntryList findAllBlogEntries(Long blogId);
    BlogList findAllBlogs();
}
