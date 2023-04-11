package Lab10;

public class City {
    String name;
    float lat;
    float lng;
    String country;
    String iso2;
    String admin_name;

    City (String city, float latitude, float longitude, String country, String iso2, String adminName){
        this.name = city;
        this.lat = latitude;
        this.lng = longitude;
        this.country = country;
        this.iso2 = iso2;
        this.admin_name = adminName;
    }

    public String toString() {
        return String.format(
                "City: %s %n" +
                "Coordinates: %.4f, %.4f %n" +
                "Country: %s %n" +
                "iso2: %s %n" +
                "Admin Name: %s\n",
                name, lat, lng, country, iso2, admin_name);
    }

    public String toFile() {
        return String.format("" +
                "%s\t%.4f, %.4f\t%s\t%s\t%s", name, lat, lng, country, iso2, admin_name);
    }
}
