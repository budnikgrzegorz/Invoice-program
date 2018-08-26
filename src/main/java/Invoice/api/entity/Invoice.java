package Invoice.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Invoice {

    @Id
    private String id;

    @Indexed(unique = true)
    private int invoiceNumber;

    private Dealer dealer;

    private Buyer buyer;

    private List<Product> products;


}
