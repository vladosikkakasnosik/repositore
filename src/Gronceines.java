public class Gronceines {
    Product[] products = new Product[10];

    private int spaceAvailable = products.length;
    public void  addProduct(Product product) {
        if (spaceAvailable <= 0){
            System.out.println("Немає стільки товара");
            return;
        }
        for (int i = 0; i< products.length; i++){
            if (products[i] == null)products[i] = product;

        }
        System.out.println("Продукт %s додано успішно!"
                .formatted(product.name));

    }
}
