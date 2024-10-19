package view;

import controller.ProductManager;
import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMenu {
    ProductManager productManager = new ProductManager();
    Scanner scanner = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("=========Menu=======");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Tìm kếm sản phẩm");
            System.out.println("5. Hiển thị danh sách sản phẩm");
            System.out.println("6. Tìm kiếm sản phẩm theo tên");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    showAdd();
                    break;
                case 2:
                    showRemove();
                    break;
                case 3:
                    showEdit();
                    break;
                case 4:
                    showshearch();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
                    showShearByName();
                    break;
                case 0:
                    System.out.println("---------Thoát-------");
                    break;
            }
        } while (choice != 0);
    }

    private void showProductMenu() {
        System.out.println("Nhập tên tìm kiếm: ");
        String name = scan.nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        productManager.findByName(name);
    }

    private void showShearByName() {
        ArrayList<Product> listProduct = new ArrayList<>();
        System.out.println("Nhập tên cần tìm: ");
        String name = scan.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(i + ". " + listProduct.get(i).getName());
        }
    }

    private void showshearch() {
        System.out.println("Nhập id cần tìm: ");
        int id = scanner.nextInt();
        productManager.findIndexByID(id);
    }

    private void showAll() {
        ArrayList<Product> listProduct = productManager.findAll();
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    private void showEdit() {
        System.out.println("Nhập id bạn muốn sửa: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        Product product = new Product(id, name, price);
        productManager.update(id, product);
        System.out.println("Sửa thành công ");
    }

    public void showAdd() {
        System.out.println("Nhập id Sản phẩm");
        int id = scanner.nextInt();
        System.out.println("Nhập tên sản phẩm");
        String name = scan.nextLine();
        System.out.println("Nhap gia cua san pham");
        double price = scanner.nextDouble();
        Product product = new Product(id, name, price);
        productManager.add(product);
    }

    private void showRemove() {
        System.out.println("Nhập id của sản phẩm bạn muốn xóa");
        int id = scanner.nextInt();
        productManager.remove(id);
        System.out.println("Xóa thành công");
    }
}