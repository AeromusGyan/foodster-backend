package sciaku.com.foodster.foodster.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sciaku.com.foodster.foodster.model.foodster.Donation;
import sciaku.com.foodster.foodster.repo.DonationRepository;
import sciaku.com.foodster.foodster.services.DonationService;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService {
    @Autowired
    private DonationRepository donationRepository;

    @Override
    public Donation addDonation(Donation donation) throws Exception {
        return this.donationRepository.save(donation);
    }

    @Override
    public List<Donation> getAllDonation() {
        return (List<Donation>) this.donationRepository.findAll();
    }
}
