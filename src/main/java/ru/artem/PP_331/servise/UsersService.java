package ru.artem.PP_331.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.artem.PP_331.model.User;
import ru.artem.PP_331.reposetories.UsersReposetories;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UsersService {

    private final UsersReposetories usersReposetories;

    @Autowired
    public UsersService(UsersReposetories usersReposetories) {
        this.usersReposetories = usersReposetories;
    }

    public List<User> findAll() {
        return usersReposetories.findAll();
    }

    public User showUser(int id) {
        return usersReposetories.findById(id).orElse(null);
    }

    @Transactional
    public void update(int id, User updateUser) {
        updateUser.setId(id);
        usersReposetories.save(updateUser);
    }

    @Transactional
    public void delete(int id) {
        usersReposetories.deleteById(id);
    }

    @Transactional
    public void save(User user) {
        usersReposetories.save(user);
    }
}
