package inheritance2;

public class Product {

    public Product(){}

    public Product(int id, String name, String despription,
                   double unitPrice,
                   int stockAmount, String kod) {
        this.id = id;
        this.name = name;
        this.despription = despription;
        this.unitPrice = unitPrice;
        this.stockAmount = stockAmount;
        this.kod = kod;
    }

    private int id;
    private String name;
    private  String despription;
    private double unitPrice;
    private int stockAmount;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDespription() {
        return despription;
    }

    public void setDespription(String despription) {
        this.despription = despription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }
}
