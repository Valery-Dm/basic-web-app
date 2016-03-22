package tutorial.core.services;

import tutorial.core.models.entities.Account;
import tutorial.core.models.entities.Blog;
import tutorial.core.services.util.AccountList;
import tutorial.core.services.util.BlogList;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/20/16.</p>
 *
 * <p>Will be used with AccountController class</p>
 */
public interface IAccountService {
    Account findAccount(Long id);
    Account createAccount(Account data);
    Blog createBlog(Long accountId, Blog data);
    BlogList findBlogsByAccount(Long accountId);
    AccountList findAllAccounts();
    Account findByAccountName(String name);
}
