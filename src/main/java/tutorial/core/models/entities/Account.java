package tutorial.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * For project <tt>basic-web-app</tt>
 * <p>Created by dmv on 3/20/16.</p>
 *
 * <p>This information will be used to access a database</p>
 */
@Entity
public class Account {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String password;

    public Account() {}

    public Account(String name, String password) {
        //TODO generate unique id for created account
        setName(name);
        setPassword(password);
    }

    public Account(Long id, String name, String password) {
        setId(id);
        setName(name);
        setPassword(password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
