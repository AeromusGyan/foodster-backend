package sciaku.com.foodster.foodster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sciaku.com.foodster.foodster.model.foodster.Donation;
import sciaku.com.foodster.foodster.services.DonationService;

@RestController
@CrossOrigin
@RequestMapping("/donation")
public class DonationController {
    @Autowired
    private DonationService donationService;
    @PostMapping("/")
    public ResponseEntity<Donation> addDonation(@RequestBody Donation donation) throws Exception {
        return ResponseEntity.ok(this.donationService.addDonation(donation));
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllDonation()
    {
        return ResponseEntity.ok(this.donationService.getAllDonation());
    }
}
