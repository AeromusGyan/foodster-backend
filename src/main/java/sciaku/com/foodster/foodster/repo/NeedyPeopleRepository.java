package sciaku.com.foodster.foodster.repo;

import org.springframework.data.repository.CrudRepository;
import sciaku.com.foodster.foodster.model.foodster.NeedyPeople;

import java.util.List;

public interface NeedyPeopleRepository extends CrudRepository<NeedyPeople, Long> {

    public List<NeedyPeople> findByPincode(String pincode);
}
