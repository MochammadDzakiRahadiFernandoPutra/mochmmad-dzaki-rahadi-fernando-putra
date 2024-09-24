

import java.util.Scanner;
public class Tes {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Pilih 1, CD atau 2. DVD");
        int pilih = in.nextInt();
        in.nextLine();
        if (pilih == 1) {
            System.out.println("Number : ");
            int number=in.nextInt();;
            System.out.println("name : ");
            String name;
            System.out.println("quantity : ");
            int quantity;
            System.out.println("price : ");
            double price;
            System.out.println("Artist : ");
            String artist;
            System.out.println("Number of Song : ");
            int numSong;
            System.out.println("Label : ");
            String label;
            System.out.println("name : ");
            name = in.nextLine();
            System.out.println("quantity : ");
            quantity = in.nextInt();
            in.nextLine();
            System.out.println("price : ");
            price = in.nextDouble();
            System.out.println("Artist : ");
            artist = in.nextLine();
            System.out.println("Number of Song : ");
            numSong = in.nextInt();
            in.nextLine();
            System.out.println("Label : ");
            label = in.nextLine();
            CD cd1 = new CD(number, name, quantity, price, artist, numSong, label);
            cd1.print();
        } else if (pilih == 2) {
            System.out.println("Number : ");
            int number;
            System.out.println("name : ");
            String name;
            System.out.println("quantity : ");
            int quantity;
            System.out.println("price : ");
            double price;
            System.out.println("Lenght : ");
            String leght;
            System.out.println("Rating : ");
            int rating;
            System.out.println("Studio : ");
            String studio;
            System.out.println("Number : ");
            number = in.nextInt();
            in.nextLine();
            System.out.println("name : ");
            name = in.nextLine();
            System.out.println("quantity : ");
            quantity = in.nextInt();
            in.nextLine();
            System.out.println("price : ");
            price = in.nextDouble();
            System.out.println("Lenght : ");
            leght = in.nextLine();
            System.out.println("Rating : ");
            rating = in.nextInt();
            in.nextLine();
            System.out.println("Studio : ");
            studio = in.nextLine();
            DVD dvd1 = new DVD(number, name, quantity, price, leght, rating, studio);
            dvd1.print();
        } else {
            System.out.println("Pilih 1, CD atau 2. DVD");
        }
    }

}