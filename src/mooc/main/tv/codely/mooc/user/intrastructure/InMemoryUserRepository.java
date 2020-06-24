package tv.codely.mooc.user.intrastructure;

import org.springframework.stereotype.Service;
import tv.codely.mooc.user.domain.User;
import tv.codely.mooc.user.domain.UserReposiory;

import java.util.HashMap;
import java.util.Optional;

@Service
final public class InMemoryUserRepository implements UserReposiory {

    HashMap<String, User> repository = new HashMap<>();

    @Override
    public void save(User user) {
        repository.put(user.getId(), user);
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(repository.get(id));
    }
}
