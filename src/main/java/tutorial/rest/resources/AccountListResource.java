package tutorial.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/22/16.</p>
 */
public class AccountListResource extends ResourceSupport {
    private List<AccountResource> accounts = new ArrayList<AccountResource>();

    public List<AccountResource> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountResource> accounts) {
        this.accounts = accounts;
    }
}
