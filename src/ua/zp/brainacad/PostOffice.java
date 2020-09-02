package ua.zp.brainacad;

public class PostOffice {
    public int parcel;
    public static final String CONSTANTA = "УкрПошта";

    public void parcelLists(int i) {
        System.out.println("Списки посылок ... " + i);
    }
    public void packingShipping(int i, long b) {
        System.out.println("Упаковать посылки ... " + i + "Количество = " + b);
    }


    public static void post(int height, int length, int weight) {
        int mail =+ height * length + weight;
        System.out.println("Объемный вес: " + mail);
    }
    }
