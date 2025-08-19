package KoknaevDanila.CRUD.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import KoknaevDanila.CRUD.App.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
