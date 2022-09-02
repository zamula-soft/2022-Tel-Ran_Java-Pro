package lesson5.homework;

public class GetZipInfo {
    private String zip;
    private String country;
//    private String[] places;

    public GetZipInfo(String zip, String country, String[] places) {
        this.zip = zip;
        this.country = country;
//        this.places = places;
    }

    @Override
    public String toString() {
        return "GetZipInfo{" +
                "zip='" + zip + '\'' +
                ", country='" + country + '\'' +
//                ", places='" + places + '\'' +
                '}';
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }



    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}


