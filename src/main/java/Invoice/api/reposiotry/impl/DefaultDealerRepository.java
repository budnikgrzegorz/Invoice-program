package Invoice.api.reposiotry.impl;

import Invoice.api.entity.Dealer;
import Invoice.api.reposiotry.DealerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultDealerRepository implements DealerRepository {


    @Override
    public void addBuyer(String name, String adreess, String city, String code, String country) {

    }

    @Override
    public void deleteBuyer(Dealer dealer) {

    }

    @Override
    public void editBuyer(Dealer dealer, String name, String adreess, String city, String code, String country) {

    }

    @Override
    public void getBuyer(Dealer dealer) {

    }
}
