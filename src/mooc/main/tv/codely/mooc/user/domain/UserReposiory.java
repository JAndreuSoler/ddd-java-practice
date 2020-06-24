package tv.codely.mooc.user.domain;

import java.util.Optional;

public interface UserReposiory {

    void save(User user);
    Optional<User> findById(String id);
}
