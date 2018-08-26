package Invoice.api.reposiotry;

import Invoice.api.entity.Buyer;

public interface BuyerRepository {

    void addBuyer (String name,String adreess,String city,String code,String country);
    void deleteBuyer(Buyer buyer);
    void editBuyer(Buyer buyer,String name,String adreess,String city,String code,String country);
    void getBuyer(Buyer buyer);

}
