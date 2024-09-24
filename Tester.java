package tugas;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner (System.in);
        System.out.println("Pilih 1, CD atau 2. DVD");
        int pilih = input.nextInt();
        if (pilih == 1) {
            CD cd1 = new CD();
            cd1.print();
        } else if (pilih == 2) {
            DVD dvd1 = new DVD();
            dvd1.println();
        } else {
            System.out.println("Pilih 1, CD atau 2. DVD");
        }
    }


}