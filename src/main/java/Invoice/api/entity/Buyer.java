package Invoice.api.entity;

import org.springframework.data.annotation.Id;

public class Buyer {
    @Id
    private int id;

    private String name;

    private String adreess;

    private String city;

    private String code;

    private String country;

    public Buyer(int id, String name, String adreess, String city, String code, String country) {
        this.id = id;
        this.name = name;
        this.adreess = adreess;
        this.city = city;
        this.code = code;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdreess() {
        return adreess;
    }

    public void setAdreess(String adreess) {
        this.adreess = adreess;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}


