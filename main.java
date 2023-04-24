
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phamq
 */
public class main {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("------------------------------------");
            System.out.println("1. Nhap thong tin ");
            System.out.println("2. Xuat bang ke khai");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin xe:");
                    Vehicle vehicle = new Vehicle("", "", 0, 0, 0);
                    vehicle.nhap();
                    vehicleList.add(vehicle);
                    break;
                case 2:
            	    System.out.println("--------------------------------------------------------------------");
            	    System.out.printf("%-25s %-20s %-15s %-15s %-15s%n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
                    for (Vehicle v : vehicleList) {
                        v.thuePhaiNop();
                        v.xuat();
                    }
                    break;
                case 3:
                    System.out.println("Cam on ban da su dung chuong trinh!!");
                    break;
                default:
                    System.out.println("Ban da chon sai chuc nang. Moi chon lai.");
            }
        } while (choice != 3);
    }
}
