package Invoice.api.reposiotry.impl;

import Invoice.api.entity.Product;
import Invoice.api.enums.Counting;
import Invoice.api.enums.VatRate;
import Invoice.api.reposiotry.ProductReposiotry;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultProductRepository implements ProductReposiotry {

    @Override
    public void addProduct(String name, Counting counting, VatRate vatRate) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public void editProduct(String name, Counting counting, VatRate vatRate) {

    }

    @Override
    public void getProduct(Product product) {

    }
}
