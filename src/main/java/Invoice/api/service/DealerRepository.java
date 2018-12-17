package Invoice.api.service;

import Invoice.api.entity.Dealer;

public interface DealerRepository {

    void addBuyer (String name,String adreess,String city,String code,String country);
    void deleteBuyer(Dealer dealer);
    void editBuyer(Dealer dealer,String name,String adreess,String city,String code,String country);
    void getBuyer(Dealer dealer);
}
