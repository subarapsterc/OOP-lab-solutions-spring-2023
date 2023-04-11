package Lab10;

import java.util.ArrayList;

public class CityFactory {
    private ArrayList<City> sindh = new ArrayList<>();
    private ArrayList<City> punjab = new ArrayList<>();
    private ArrayList<City> kpk = new ArrayList<>();
    private ArrayList<City> balo = new ArrayList<>();
    private ArrayList<City> gilgit = new ArrayList<>();
    private ArrayList<City> kashmir = new ArrayList<>();

    final static int SINDH =        0;
    final static int PUNJAB =       1;
    final static int KPK =          2;
    final static int BALOCHISTAN =  3;
    final static int GILGIT =       4;
    final static int KASHMIR =      5;

    public CityFactory(ArrayList<City> sindh, ArrayList<City> punjab, ArrayList<City> kpk,
                       ArrayList<City> balochistan, ArrayList<City> gilgit, ArrayList<City> kashmir) {
        this.sindh = sindh;
        this.punjab = punjab;
        this.kpk = kpk;
        this.balo = balochistan;
        this.gilgit = gilgit;
        this.kashmir = kashmir;
    }

    public City getCityFrom(int cityNum) {
        ArrayList<City> admin = switch (cityNum) {
            case SINDH:
                yield sindh;
            case PUNJAB:
                yield punjab;
            case KPK:
                yield kpk;
            case BALOCHISTAN:
                yield balo;
            case GILGIT:
                yield gilgit;
            case KASHMIR:
                yield kashmir;
            default:
                yield null;
        };

        if (admin == null) return null;

        return admin.remove(0);
    }
}
