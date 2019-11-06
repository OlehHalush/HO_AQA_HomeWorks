package HW11;

public class Account {
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

    private Account() {
    }

    private Account(String gender, String customerFirstName, String customerLastName, String customerEmail, String customerPassword, String addressFirstName, String addressLastName, String address, String city, String zipCode, String mobilePhone, String alias) {
        this.gender = gender;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
        this.addressFirstName = addressFirstName;
        this.addressLastName = addressLastName;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.mobilePhone = mobilePhone;
        this.alias = alias;
    }

    public String getGender() {
        return gender;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public String getAddressFirstName() {
        return addressFirstName;
    }

    public String getAddressLastName() {
        return addressLastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAlias() {
        return alias;
    }

    public static class AccountBuilder {
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

        public AccountBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public AccountBuilder withCustomerFirstName(String customerFirstName) {
            this.customerFirstName = customerFirstName;
            return this;
        }

        public AccountBuilder withCustomerLastName(String customerLastName) {
            this.customerLastName = customerLastName;
            return this;
        }

        public AccountBuilder withCustomerEmail() {
            return this;
        }

        public AccountBuilder withCustomerPassword(String customerPassword) {
            this.customerPassword = customerPassword;
            return this;
        }

        public AccountBuilder withAddressFirstName(String addressFirstName) {
            this.addressFirstName = addressFirstName;
            return this;
        }

        public AccountBuilder withAddressLastName(String addressLastName) {
            this.addressLastName = addressLastName;
            return this;
        }

        public AccountBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public AccountBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public AccountBuilder withZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public AccountBuilder withMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public AccountBuilder withAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public Account build() {
            return new Account(gender, customerFirstName, customerLastName, customerEmail, customerPassword, addressFirstName, addressLastName, address, city, zipCode, mobilePhone, alias);
        }
    }
}