package tutorial.core.repositories.jpa;

import org.springframework.stereotype.Repository;
import tutorial.core.models.entities.Account;
import tutorial.core.models.entities.Blog;
import tutorial.core.repositories.IAccountRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/22/16.</p>
 */
@Repository
public class JpaAccountRepo implements IAccountRepo {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Account findAccount(Long id) {
        return entityManager.find(Account.class, id);
    }

    @Override
    public Account createAccount(Account data) {
        entityManager.persist(data);
        return data;
    }

    @Override
    public Blog createBlog(Long accountId, Blog data) {
        return null;
    }
}
