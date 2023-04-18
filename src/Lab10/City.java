package Lab10;

import java.awt.*;

public class City {
    String name;
    float lat;
    float lng;
    String country;
    String iso2;
    String admin_name;

    //  MAP INFO:
    public int x;
    public int y;
    private final int size = 7;
    Color color;
    final static Color SINDH  = Color.red;
    final static Color PUNJAB = Color.orange;
    final static Color KPK = Color.pink;
    final static Color BALOCHISTAN = Color.blue;
    final static Color GILGIT = Color.cyan;
    final static Color KASHMIR = Color.green;

    City (String city, float latitude, float longitude, String country, String iso2, String adminName){
        this.name = city;
        this.lat = latitude;
        this.lng = longitude;
        this.country = country;
        this.iso2 = iso2;
        this.admin_name = adminName;

        setMapInfo();
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

    private void setMapInfo() {
        x = (int) ((lat - 20) * 40);
        y = (int) ((lng - 61) * 50);

//        x = (int) (lat);
//        y = (int) ((lng) * 10);

        color = switch (admin_name) {
            case "Sindth":
                yield SINDH;
            case "Punjab":
                yield PUNJAB;
            case "Khyber Pakhtunkhwa":
                yield KPK;
            case "Balochistān":
                yield BALOCHISTAN;
            case "Gilgit-Baltistan":
                yield GILGIT;
            case "Azad Kashmir":
                yield KASHMIR;
            default:
                yield null;
        };
    }

    public void drawCity(Graphics g) {
        setMapInfo();
        g.setColor(color);
//        System.out.println(lat + ", " + lng);
//        System.out.println(x + ", " + y);
        g.fillOval(x - size/2, y - size/2, size, size);
    }
}
