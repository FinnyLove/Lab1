
import java.util.Scanner;
public class Vehicle {
    Scanner sc = new Scanner(System.in);
    private String tenChuXe;
    private String loaiXe;
    private int DungTich;
    private double TriGia;
    private double thuePhaiNop;

    public Vehicle(String tenChuXe, String loaiXe, int DungTich, double TriGia, double thuePhaiNop) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.DungTich = DungTich;
        this.TriGia = TriGia;
        this.thuePhaiNop = thuePhaiNop;
    }
   

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }
    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }

    public double getTriGia() {
        return TriGia;
    }

    public void setTriGia(double TriGia) {
        this.TriGia = TriGia;
    }

    
    public double thuePhaiNop(){
        thuePhaiNop = 0; 
        if(DungTich < 100){
            thuePhaiNop = (0.01*TriGia);
        }
        if(DungTich >= 100 && DungTich < 200){
            thuePhaiNop = (0.03*TriGia);
        }
        if(DungTich > 200){
            thuePhaiNop = (0.05*TriGia);
        }
        return thuePhaiNop;
    }
    
    public void nhap(){
        System.out.println("Ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.printf("\nLoai xe:");
        loaiXe = sc.nextLine();
        System.out.printf("\nDung tich:");
        DungTich = sc.nextInt();
        System.out.printf("\nTri Gia:");
        TriGia = sc.nextDouble();    
    }
    public void xuat(){
        System.out.printf("%-25s %-20s %-15s %-15.0f %-15.0f%n", this.tenChuXe, this.loaiXe, this.DungTich, this.TriGia, thuePhaiNop);
	System.out.println("\n");
	}
    }

    

    


    
    

    
