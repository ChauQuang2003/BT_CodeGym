import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;
    private ReadAndWrite readAndWriteData;

    public ProductManager() {
        this.readAndWriteData = new ReadAndWrite();
        this.productList = this.readAndWriteData.readData();
    }

    public void add(Product newProduct) {
        this.productList.add(newProduct);
        this.readAndWriteData.writeData(this.productList);
    }

    public List<Product> getProductList() {
        return this.productList;
    }
}