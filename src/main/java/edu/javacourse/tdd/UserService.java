package edu.javacourse.tdd;

import edu.javacourse.tdd.dto.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService {

    private final List<User> users = new ArrayList<>();
    public List<User> getAll() {
        return users;
    }

    public boolean add(User user) {
        return users.add(user);
    }
}
