package tutorial.rest.mvc;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tutorial.core.models.entities.Blog;
import tutorial.core.services.util.BlogEntryList;
import tutorial.core.models.entities.BlogEntry;
import tutorial.core.services.IBlogService;
import tutorial.core.services.exceptions.BlogNotFoundException;
import tutorial.core.services.util.BlogList;
import tutorial.rest.exceptions.NotFoundException;
import tutorial.rest.resources.BlogEntryListResource;
import tutorial.rest.resources.BlogEntryResource;
import tutorial.rest.resources.BlogListResource;
import tutorial.rest.resources.BlogResource;
import tutorial.rest.resources.asm.BlogEntryListResourceAsm;
import tutorial.rest.resources.asm.BlogEntryResourceAsm;
import tutorial.rest.resources.asm.BlogListResourceAsm;
import tutorial.rest.resources.asm.BlogResourceAsm;

import java.net.URI;
/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/20/16.</p>
 */
@Controller
@RequestMapping("/rest/blogs")
public class BlogController {
    private IBlogService blogService;

    public BlogController(IBlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<BlogListResource> findAllBlogs() {
        BlogList blogList = blogService.findAllBlogs();
        BlogListResource blogListRes = new BlogListResourceAsm().toResource(blogList);
        return new ResponseEntity<BlogListResource>(blogListRes, HttpStatus.OK);
    }

    @RequestMapping(value="/{blogId}", method = RequestMethod.GET)
    public ResponseEntity<BlogResource> getBlog(@PathVariable Long blogId) {
        Blog blog = blogService.findBlog(blogId);
        BlogResource res = new BlogResourceAsm().toResource(blog);
        return new ResponseEntity<BlogResource>(res, HttpStatus.OK);
    }

    @RequestMapping(value="/{blogId}/blog-entries", method = RequestMethod.POST)
    public ResponseEntity<BlogEntryResource> createBlogEntry(
            @PathVariable Long blogId, @RequestBody BlogEntryResource sentBlogEntry) {
        try {
            BlogEntry createdBlogEntry = blogService.createBlogEntry(blogId, sentBlogEntry.toBlogEntry());
            BlogEntryResource createdResource = new BlogEntryResourceAsm().toResource(createdBlogEntry);
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(URI.create(createdResource.getLink("self").getHref()));
            return new ResponseEntity<BlogEntryResource>(createdResource, headers, HttpStatus.CREATED);
        } catch (BlogNotFoundException e) {
            throw new NotFoundException(e);
        }
    }

    @RequestMapping(value="/{blogId}/blog-entries")
    public ResponseEntity<BlogEntryListResource> findAllBlogEntries(@PathVariable Long blogId) {
        try {
            BlogEntryList list = blogService.findAllBlogEntries(blogId);
            BlogEntryListResource res = new BlogEntryListResourceAsm().toResource(list);
            return new ResponseEntity<BlogEntryListResource>(res, HttpStatus.OK);
        } catch(BlogNotFoundException exception) {
            throw new NotFoundException(exception);
        }
    }

}
