package sciaku.com.foodster.foodster.services;

import sciaku.com.foodster.foodster.model.foodster.NeedyPeople;

import java.util.List;

public interface NeedyPeopleService {

    public NeedyPeople createNeedyPeople(NeedyPeople needyPeople) throws Exception;

    public List<NeedyPeople> getPeople(String pincode);

    public List<NeedyPeople> getAllPeople();
}
