

public class DVD extends Product {

    public String getLenght() {
        return this.leght;
    }

    public void setLenght(String leght) {
        this.leght = leght;
    }

    public int getNRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    String leght;
    int rating;
    String studio;
    
    public DVD(){
        super();
        leght = "";
        rating = 0;
        studio = "";
    }
    public DVD(int number, String name, int quantity, double price, String leght, int rating, String studio){
        super(number, name, quantity, price);
        this.leght = leght;
        this.rating = rating;
        this.studio = studio;
    }
    public void println(){
        System.out.println("Lenght : " + leght);
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
    }
}