package ru.artem.PP_331.reposetories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.artem.PP_331.model.User;

@Repository
public interface UsersReposetories extends JpaRepository<User, Integer> {
}
