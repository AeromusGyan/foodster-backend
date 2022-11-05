package sciaku.com.foodster.foodster.services;

import sciaku.com.foodster.foodster.model.foodster.Donation;

import java.util.List;

public interface DonationService {

    public Donation addDonation(Donation donation) throws Exception;

    public List<Donation> getAllDonation ();
}
