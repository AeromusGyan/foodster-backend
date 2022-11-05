package sciaku.com.foodster.foodster.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sciaku.com.foodster.foodster.model.Role;

public interface RoleRepository extends JpaRepository <Role,Long> {

}
