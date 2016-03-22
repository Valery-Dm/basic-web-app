package tutorial.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tutorial.core.models.entities.Blog;
import tutorial.core.models.entities.BlogEntry;
import tutorial.core.repositories.IBlogEntryRepo;
import tutorial.core.repositories.IBlogRepo;
import tutorial.core.services.IBlogService;
import tutorial.core.services.exceptions.BlogNotFoundException;
import tutorial.core.services.util.BlogEntryList;
import tutorial.core.services.util.BlogList;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/22/16.</p>
 */
@Service
@Transactional
public class BlogServiceImpl implements IBlogService {

    @Autowired
    private IBlogRepo blogRepo;

    @Autowired
    private IBlogEntryRepo entryRepo;

    @Override
    public BlogEntry createBlogEntry(Long blogId, BlogEntry data) {
        Blog blog = blogRepo.findBlog(blogId);
        if(blog == null)
            throw new BlogNotFoundException();
        BlogEntry entry = entryRepo.createBlogEntry(data);
        entry.setBlog(blog);
        return entry;
    }

    @Override
    public BlogList findAllBlogs() {
        return new BlogList(blogRepo.findAllBlogs());
    }

    @Override
    public BlogEntryList findAllBlogEntries(Long blogId) {
        Blog blog = blogRepo.findBlog(blogId);
        if(blog == null)
            throw new BlogNotFoundException();
        return new BlogEntryList(blogId, entryRepo.findByBlogId(blogId));
    }

    @Override
    public Blog findBlog(Long id) {
        return blogRepo.findBlog(id);
    }
}
