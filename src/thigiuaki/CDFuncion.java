package thigiuaki;

import java.util.Scanner;

public class CDFuncion {

    private CD cd[] = null ;
    private int n =0 ;

    Scanner input = new Scanner(System.in);
     
    void add(CD cd){
        System.out.print("-Enter the CD code: ");
        cd.setMaCD(input.nextInt());
        input.nextLine();
        System.out.print("-Enter CD name: ");
        cd.setNamCD(input.nextLine());
        System.out.print("-Enter the singer's name: ") ;
        cd.setSinger(input.nextLine());
        System.out.print("-Enter the number of songs: ");
        cd.setNumberTheSong(input.nextInt());
        System.out.print("-Enter price: ");
        cd.setPrice(input.nextDouble());
    }
    public void nhapThongTin(){
        System.out.print("-Enter the number CD : ");
        n = input.nextInt();
        cd = new CD[n];
        for (int i = 0; i < n; i++) {
            System.out.println("CD number " + (i + 1)+": ");
            cd[i] = new CD();
            add(cd[i]);
        }
    }

    public void inThongTin(){
        for (int i = 0; i < n; i++) {
            cd[i].inThongTin();
            System.out.println();
        }
    }

    public void tinhTongGiaThanh(){
        float total = 0;
        for (int i = 0; i < n; i++) {
            total += cd[i].getPrice();
        }
        System.out.println("Total price CD is : " + total);
    }

    public void tinhTongCD(){
        System.out.println("Total number CD is : " + n);
    }

    public void sortDown(){
        CD temp = cd[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cd[i].getPrice() < cd[j].getPrice()) {
                    temp = cd[j];
                    cd[j] = cd[i];
                    cd[i] = temp;
                }
            }
        }
       inThongTin();
    }

    public void sortUp(){
        CD temp = cd[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cd[i].getNameCD().compareTo(cd[j].getNameCD())>0) {
                    temp = cd[j];
                    cd[j] = cd[i];
                    cd[i] = temp;
                }
            }
        }
        inThongTin();
    }
}
