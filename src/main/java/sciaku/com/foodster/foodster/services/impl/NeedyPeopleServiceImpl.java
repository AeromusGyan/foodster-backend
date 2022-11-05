package sciaku.com.foodster.foodster.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sciaku.com.foodster.foodster.model.foodster.NeedyPeople;
import sciaku.com.foodster.foodster.repo.NeedyPeopleRepository;
import sciaku.com.foodster.foodster.services.NeedyPeopleService;

import java.util.List;

@Service
public class NeedyPeopleServiceImpl implements NeedyPeopleService {

    @Autowired
    private NeedyPeopleRepository needyPeopleRepository;

    @Override
    public NeedyPeople createNeedyPeople(NeedyPeople needyPeople) throws Exception {
        return this.needyPeopleRepository.save(needyPeople);
    }

    @Override
    public List<NeedyPeople> getPeople(String pincode) {
        return this.needyPeopleRepository.findByPincode(pincode);
    }

    @Override
    public List<NeedyPeople> getAllPeople() {
        return (List<NeedyPeople>) this.needyPeopleRepository.findAll();
    }

}
