package class_practice;


public class Address implements Comparable {
    private String houseNumber;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    public Address(String houseNum, String address1,
                   String address2,
                   String city, String state, String zip) {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }

    public Address(String houseNum, String address1,
                   String city, String state, String zip) {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = "";
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }


    @Override
    public String toString() {
        if(address2.equals("")) {
            return
                    "houseNumber='" + houseNumber + '\'' +
                    ", address1='" + address1 + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zipcode='" + zipcode + '\'';

        } else {
            return
                    "houseNumber='" + houseNumber + '\'' +
                    ", address1='" + address1 + '\'' +
                    ", address2='" + address2 + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zipcode='" + zipcode + '\'';

        }

      }

    @Override
    public int compareTo(Object T) {
        Address secondAddress = (Address) T;
        int zipcode1 = Integer.parseInt(this.zipcode);
        int zipcode2 = Integer.parseInt(secondAddress.zipcode);
        if (zipcode1 > zipcode2) {
            return 1;
        } else if (zipcode1 == zipcode2){
            return 0;
        } else {
            return -1;
        }
    }
}


