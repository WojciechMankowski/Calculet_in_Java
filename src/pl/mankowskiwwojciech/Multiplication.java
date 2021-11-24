package pl.mankowskiwwojciech;

public class Multiplication implements calculations{

    private double first_number;
    private double second_number;

    public Multiplication(double first_number, double second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
    }

    @Override
    public double calculation() {
        return first_number * second_number;
    }
}
