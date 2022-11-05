package sciaku.com.foodster.foodster.repo;

import org.springframework.data.repository.CrudRepository;
import sciaku.com.foodster.foodster.model.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {

    public Member findByUsername(String username);

    public  Member findByEmail(String email);
}
