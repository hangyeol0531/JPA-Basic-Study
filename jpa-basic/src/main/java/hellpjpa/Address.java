package hellpjpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Address {
    public Address() {

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    private String city;
    private String street;
    private String zipcode;
}
