package Invoice.api.service;

import Invoice.api.entity.Buyer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BuyerRepository extends MongoRepository<Buyer, String>{

    void addBuyer (String name,String adreess,String city,String code,String country);
    void deleteBuyer(Buyer buyer);
    void editBuyer(Buyer buyer,String name,String adreess,String city,String code,String country);
    void getBuyer(Buyer buyer);

}
