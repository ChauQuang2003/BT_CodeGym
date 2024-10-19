import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ReadAndWrite {
    private File file = new File("data/store.csv");

    public void writeData(List<Product> productList) {
        try {
            String data = "";
            for (Product product : productList) {
                data += product.getId() + "," + product.getName() + "\n";
            }
            FileWriter fileWriter = new FileWriter(this.file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public List<Product> readData() {
        List<Product> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(this.file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // 1,Keo
                String[] data = line.split(","); // ["1" , "Keo"]
                Product product = new Product(Integer.parseInt(data[0]), data[1]); // Product(1, "Keo")
                list.add(product);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}