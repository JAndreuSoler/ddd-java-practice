package tv.codely.mooc.user.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tv.codely.mooc.user.domain.User;
import tv.codely.mooc.user.domain.UserReposiory;

@Service
final public class UserCreator {

    private UserReposiory reposiory;

    @Autowired
    public UserCreator(UserReposiory reposiory) {
        this.reposiory = reposiory;
    }

    public void createUser(String id, String name, String email, String password){
        User user = new User(id, name, email, password);
        reposiory.save(user);
    }
}
