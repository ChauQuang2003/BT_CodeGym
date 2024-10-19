package view;

import java.util.Scanner;

public class MainMenu {
    private CustomerMenu customerMenu = new CustomerMenu();
    private ProductMenu productMenu = new ProductMenu();
    Scanner scanner = new Scanner(System.in);

    public void selectMenu() {
        int choice;
        do {
            System.out.println("=======Menu======");
            System.out.println("1.Quản lý khách hàng ");
            System.out.println("2.Quản lý sản phẩm ");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn nhập lựa chọn ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2: productMenu.showMainMenu();
                    break;
                case 0:
                    System.out.println("Thoát");
                    break;
            }
        } while (choice != 0);
    }
}
