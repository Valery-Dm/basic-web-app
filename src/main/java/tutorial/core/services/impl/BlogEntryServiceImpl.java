package tutorial.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tutorial.core.models.entities.BlogEntry;
import tutorial.core.repositories.IBlogEntryRepo;
import tutorial.core.services.IBlogEntryService;


/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/22/16.</p>
 */
@Service
@Transactional
public class BlogEntryServiceImpl implements IBlogEntryService {

    @Autowired
    private IBlogEntryRepo entryRepo;

    @Override
    public BlogEntry findBlogEntry(Long id) {
        return entryRepo.findBlogEntry(id);
    }

    @Override
    public BlogEntry deleteBlogEntry(Long id) {
        return entryRepo.deleteBlogEntry(id);
    }

    @Override
    public BlogEntry updateBlogEntry(Long id, BlogEntry data) {
        return entryRepo.updateBlogEntry(id, data);
    }
}
