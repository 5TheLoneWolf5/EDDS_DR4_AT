import java.util.List;

class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;
}

class User {
    private String name;
    private String email;
    private List<Address> addresses;

    public User(String name, String email, List<Address> addresses) {
        this.name = name;
        this.email = email;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addAdress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}