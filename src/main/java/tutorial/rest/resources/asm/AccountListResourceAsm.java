package tutorial.rest.resources.asm;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import tutorial.core.services.util.AccountList;
import tutorial.rest.mvc.AccountController;
import tutorial.rest.resources.AccountListResource;
import tutorial.rest.resources.AccountResource;

import java.util.List;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/22/16.</p>
 */
public class AccountListResourceAsm extends ResourceAssemblerSupport<AccountList, AccountListResource> {


    public AccountListResourceAsm() {
        super(AccountController.class, AccountListResource.class);
    }

    @Override
    public AccountListResource toResource(AccountList accountList) {
        List<AccountResource> resList = new AccountResourceAsm().toResources(accountList.getAccounts());
        AccountListResource finalRes = new AccountListResource();
        finalRes.setAccounts(resList);
        return finalRes;
    }
}
