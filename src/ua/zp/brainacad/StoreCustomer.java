package ua.zp.brainacad;

public class StoreCustomer {
    public int product;
    public int bonus;
    public static final String CONSTANTA = "Вася";

    public void product(int i) {
        System.out.println("Товары в корзине ... " + i);
    }
    public void pbonus(int i, long b) {
        System.out.println("Бонусы " + i + "Гривны = " + b);
    }


}
