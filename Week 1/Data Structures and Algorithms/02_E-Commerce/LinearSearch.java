public class LinearSearch {

    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Phone", "Electronics")
        };

        Product result = linearSearch(products, 103);

        if (result != null)
            System.out.println("Product Found: " + result);
        else
            System.out.println("Product Not Found");
    }
}