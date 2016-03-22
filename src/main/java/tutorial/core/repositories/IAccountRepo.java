package tutorial.core.repositories;

import tutorial.core.models.entities.Account;

import java.util.List;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/22/16.</p>
 */
public interface IAccountRepo {
    List<Account> findAllAccounts();
    Account findAccount(Long id);
    Account findAccountByName(String name);
    Account createAccount(Account data);
}
