package swiggy.model;

public class OrderIteams {
    Product product;
    private  int qty;
    private  int price;

    public OrderIteams(Product product, int qty, int price) {
        this.product = product;
        this.qty = qty;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price = qty * product.getPrice();
    }
}
