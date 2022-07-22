package org.itstep.helloworldspring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServes {
    List<User> users = new ArrayList<>(){{
        add(new User(1L,"admin","admin", "admin"));
        add(new User(1L,"admsin","admin", "admin"));
    }};

    public List<User> getUsers() {
        return users;
    }

    public User getUserById(Long id) {
        User user = users.stream()
                .filter(u->u.getId()==id)
                .findFirst().orElse(null);

        return user;
    }
}
