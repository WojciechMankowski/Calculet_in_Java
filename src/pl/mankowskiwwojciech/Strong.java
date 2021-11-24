package pl.mankowskiwwojciech;

public class Strong implements calculations{
    private double first_number;
    Strong(double first_number){
        this.first_number = first_number;
    }
   private double calculations_silnia(double n) {
       if (n <= 1){
           return 1;
       } else {
           return n * calculations_silnia(n - 1);
       }
    }
    @Override
    public double calculation() {
        return calculations_silnia(first_number);
    }
}
