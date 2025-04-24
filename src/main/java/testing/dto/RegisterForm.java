package testing.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {

    private String title, name, email, password;
    private int day, month, year;
    private boolean signUpNewsLetter, ReceiveSpecialOffers;
    private String firstname, lastname, company, phone;
    private String address1, address2, country, city, state, zip;


}
