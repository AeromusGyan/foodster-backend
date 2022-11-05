package sciaku.com.foodster.foodster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sciaku.com.foodster.foodster.model.foodster.NeedyPeople;
import sciaku.com.foodster.foodster.services.NeedyPeopleService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/people")
public class NeedyPeopleController {
    @Autowired
    private NeedyPeopleService needyPeopleService;

    @PostMapping("/")
    public ResponseEntity<NeedyPeople> createNeedyPeople(@RequestBody NeedyPeople needyPeople) throws Exception{

        return ResponseEntity.ok(this.needyPeopleService.createNeedyPeople(needyPeople));
    }

    @GetMapping("/{pincode}")
    public List<NeedyPeople> getMember(@PathVariable("pincode") String pincode)
    {
        return this.needyPeopleService.getPeople(pincode);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllMember()
    {
        return ResponseEntity.ok(this.needyPeopleService.getAllPeople());
    }
}
