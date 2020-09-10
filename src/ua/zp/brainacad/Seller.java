package ua.zp.brainacad;

public class Seller {
    private String technics;
    private String nameProduct;
    private int price;

    public String getTechnics() {
        return technics;
    }

    public void setTechnics(String technics) {
        this.technics = technics;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static final String CONSTANTA = "Яблоки";




    public void remainder(int rem) {
        System.out.println("Сумма к оплате в долларах: " + rem * price + "$");

    }
}
