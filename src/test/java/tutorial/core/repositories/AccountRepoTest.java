package tutorial.core.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import tutorial.core.models.entities.Account;

import static org.junit.Assert.assertNotNull;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/22/16.</p>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/business-config.xml")
public class AccountRepoTest {
    private Account account;
    @Autowired
    private IAccountRepo repo;

    @Before
    @Transactional
    @Rollback(false)
    public void setup() {
        account = new Account("name", "password");
        repo.createAccount(account);
    }

    @Test
    @Transactional
    public void test() {
        assertNotNull(repo.findAccount(account.getId()));
    }
}
