package Invoice.api.reposiotry.impl;

import Invoice.api.entity.Buyer;
import Invoice.api.reposiotry.BuyerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultBuyerReposiotry implements BuyerRepository {

    @Override
    public void addBuyer(String name, String adreess, String city, String code, String country) {

    }

    @Override
    public void deleteBuyer(Buyer buyer) {

    }

    @Override
    public void editBuyer(Buyer buyer, String name, String adreess, String city, String code, String country) {

    }

    @Override
    public void getBuyer(Buyer buyer) {

    }
}
