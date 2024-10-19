import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " : ");
            list[i] = scanner.nextInt();
        }
        System.out.println("Mang truoc khi sap xep");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        sapXep(list);
    }

    public static void sapXep(int[] a) {
        boolean needNextPass = true;
        for (int i = 1; i < a.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mang da duoc sap xep");
                break;
            }
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + "\t");
            }
            System.out.println();
        }
    }
}