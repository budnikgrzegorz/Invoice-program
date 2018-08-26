package Invoice.api.reposiotry;

import Invoice.api.entity.Product;
import Invoice.api.enums.Counting;
import Invoice.api.enums.VatRate;

public interface ProductReposiotry {

    void addProduct(String name,Counting counting,VatRate vatRate);
    void deleteProduct(Product product);
    void editProduct (String name,Counting counting,VatRate vatRate);
    void getProduct(Product product);

}
