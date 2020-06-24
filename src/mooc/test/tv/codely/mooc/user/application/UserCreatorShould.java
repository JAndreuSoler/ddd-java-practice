package tv.codely.mooc.user.application;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.user.domain.User;
import tv.codely.mooc.user.domain.UserReposiory;

import static org.mockito.Mockito.*;

class UserCreatorShould {

    @Test
    public void save_a_valid_user(){
        UserReposiory reposiory =mock(UserReposiory.class);
        UserCreator creator = new UserCreator(reposiory);
        User user = new User("some-id", "some-name", "some-email", "some-password");

        creator.createUser(user.getId(), user.getName(), user.getEmail(), user.getPassword());
        verify(reposiory, atLeastOnce()).save(user);
    }
}
