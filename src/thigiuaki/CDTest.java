package thigiuaki;

import java.util.Scanner;

public class CDTest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CDFuncion cd = new CDFuncion();
        int key ;
        do {
            System.out.println("------------------MENU-------=----=----------");
            System.out.println(">>. 1 - Enter information CD.                |");
            System.out.println(">>. 2 - Total number CD.                     |");
            System.out.println(">>. 3 - Total price CD.                      |");
            System.out.println(">>. 4 - Sort descending by CD price.         |");
            System.out.println(">>. 5 - Sort ascending by CD title.          |") ;
            System.out.println(">>. 6 - Print list CD.                       |");
            System.out.println(">>. 0 - Exit program.                        |");
            System.out.println("----------------------------------------------");
            key = input.nextInt();
            switch (key) {
                case 1:
                    System.out.println("-Enter information CD ");
                    cd.nhapThongTin();
                    break;
                case 2:
                    System.out.println("-Total number CD ");
                    cd.tinhTongCD();
                    break;
                case 3:
                    System.out.println("-Total price CD");
                    cd.tinhTongGiaThanh();
                    break;
                case 4:
                    System.out.println("-Sort descending by CD price");
                    cd.sortDown();
                    break;
                case 5:
                    System.out.println("-Sort ascending by CD title");
                    cd.sortUp();
                    break;
                case 6:
                    System.out.println("-Print list CD.");
                    cd.inThongTin();
                    break;
                case 0 : 
                   break ;
                default:
                    System.out.println("You entered wrong. Please re-enter!!!");
                    break;
            }
        }while (key != 0 ) ; // bằng 0 thì thoát
    }
}
