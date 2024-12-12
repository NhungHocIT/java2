/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class lab1 {
    public static void main(String[] args) {
        System.out.println("BAI1");
          Scanner sc = new Scanner(System.in);
        //Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím. In ra màn hình với định dạng: <tên_sinh_viên> có điểm = <điểm> 
      
//        System.out.println("a.");
//        System.out.print("Nhap ten sinh vien: ");
//        String name = sc.nextLine();
//        System.out.print("Nhap diem trung binh: ");
//        float diem = sc.nextFloat(); sc.nextLine();
//        System.out.println(name +" co diem  = "+ diem);
        


        /* Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
Tính toán và in ra console:
- chu vi hình chữ nhật
- diện tích hình chữ nhật
- cạnh nhỏ nhất của hình chữ nhật */
//        System.out.println("b.");
//        System.out.print("Nhap chieu dai: ");
//        int cd = sc.nextInt();sc.nextLine();
//        System.out.print("Nhap chieu rong: ");
//        int cr = sc.nextInt();sc.nextLine();
//        int p = (cd+cr)*2;
//        int s= cd*cr;
//        int min= Math.min(cd,cr);
//        int n ;
//        do{
//             System.out.println("1.chu vi hinh chu nhat\n2. dien tich hinh chu nhat\n3.canh nho nhat cua hinh chu nhat");
//             n = sc.nextInt();
//              switch(n){
//            case 1:
//                System.out.println("chu vi hinh chu nhat la: "+ p);
//                break;
//            case 2: 
//                System.out.println("dien tich hinh chu nhat la: "+ s);
//                break;
//            case 3: 
//                System.out.println("canh nho nhat cua hinh chu nhat co gia tri la: "+ min);
//                break;
//            default:
//                System.exit(0);
//        }
//        }
//        while(n !=0 );
    
    /* Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
Tính và xuất ra thể tích của hình lập phương.*/
        System.out.println("Nhap cang cua khoi lap phuong: ");
    int x= sc.nextInt(); sc.nextLine();
    int thetich= (int) Math.pow(x,3 );
        System.out.println("the tich hinh lap phuong: "+ thetich);
        

    
    }
    
    
}
