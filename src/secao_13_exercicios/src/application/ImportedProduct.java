package application;
import entities.Product;

public class ImportedProduct extends Product {

    private Double customsFee;

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(double customsFee){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return String.format(toString(), getName() + " $" + getPrice() + " (Customs fee: $" + totalPrice(customsFee) +")");
    }
}
