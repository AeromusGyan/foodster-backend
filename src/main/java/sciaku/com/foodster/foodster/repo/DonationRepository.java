package sciaku.com.foodster.foodster.repo;

import org.springframework.data.repository.CrudRepository;
import sciaku.com.foodster.foodster.model.foodster.Donation;

public interface DonationRepository extends CrudRepository<Donation, Long> {
}
