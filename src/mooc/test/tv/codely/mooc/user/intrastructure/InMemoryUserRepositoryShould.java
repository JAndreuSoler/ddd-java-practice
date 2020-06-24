package tv.codely.mooc.user.intrastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.user.domain.User;
import tv.codely.mooc.user.domain.UserReposiory;

import java.util.Optional;

class InMemoryUserRepositoryShould {

    @Test
    void save_valid_not_existing_user(){
        UserReposiory reposiory = new InMemoryUserRepository();
        User user = new User("some-id", "some-name", "some-email", "some-password");

        reposiory.save(user);
    }

    @Test
    void fina_existing_user(){
        UserReposiory reposiory = new InMemoryUserRepository();
        User user = new User("some-id", "some-name", "some-email", "some-password");

        reposiory.save(user);
        Assert.assertEquals(Optional.of(user) ,reposiory.findById(user.getId()));
    }

    @Test
    void not_finding_no_existing_user(){
        UserReposiory reposiory = new InMemoryUserRepository();

        Assert.assertFalse(reposiory.findById("not-existing-id").isPresent());
    }
}
