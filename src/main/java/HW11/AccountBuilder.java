package HW11;

public class AccountBuilder {
    private String gender;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPassword;
    private String addressFirstName;
    private String addressLastName;
    private String address;
    private String city;
    private String zipCode;
    private String mobilePhone;
    private String alias;

    public AccountBuilder withGender(String gender){
        this.gender = gender;
        return this;
    }

    public AccountBuilder withCustomerFirstName(String customerFirstName){
        this.customerFirstName = customerFirstName;
        return this;
    }

    public AccountBuilder withCustomerLastName(String customerLastName){
        this.customerLastName = customerLastName;
        return this;
    }

    public AccountBuilder withCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
        return this;
    }

    public AccountBuilder withCustomerPassword(String customerPassword){
        this.customerPassword = customerPassword;
        return this;
    }

    public AccountBuilder withAddressFirstName(String addressFirstName){
        this.addressFirstName = addressFirstName;
        return this;
    }

    public AccountBuilder withAddressLastName(String addressLastName){
        this.addressLastName = addressLastName;
        return this;
    }

    public AccountBuilder withAddress(String address){
        this.address = address;
        return this;
    }

    public AccountBuilder withCity(String city){
        this.city = city;
        return this;
    }

    public AccountBuilder withZipCode(String zipCode){
        this.zipCode = zipCode;
        return this;
    }

    public AccountBuilder withMobilePhone(String mobilePhone){
        this.mobilePhone = mobilePhone;
        return this;
    }

    public AccountBuilder withAlias(String alias){
        this.alias = alias;
        return this;
    }

    public Account build(){
        return new Account(gender, customerFirstName, customerLastName, customerEmail, customerPassword, addressFirstName, addressLastName, address, city, zipCode, mobilePhone, alias);
    }
}