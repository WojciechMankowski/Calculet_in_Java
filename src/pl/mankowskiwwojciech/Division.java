package pl.mankowskiwwojciech;

public class Division implements calculations{
    private double first_number;
    private double second_number;

    public Division(double first_number, double second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
    }
    public  boolean checking_that_the_second_number_is_not_zero(){
        return second_number != 0;
    }
    @Override
    public double calculation() {
        return first_number / second_number;
    }
}
