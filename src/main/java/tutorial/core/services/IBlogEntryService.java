package tutorial.core.services;

import tutorial.core.models.entities.BlogEntry;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/19/16.</p>
 */
public interface IBlogEntryService {
    BlogEntry findBlogEntry(Long id);
    BlogEntry deleteBlogEntry(Long id);
    BlogEntry updateBlogEntry(Long id, BlogEntry data);
}
