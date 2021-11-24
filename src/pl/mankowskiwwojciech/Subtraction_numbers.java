package pl.mankowskiwwojciech;

public class Subtraction_numbers implements calculations {
    private double first_number;
    private double second_number;
    private double suma;

    public Subtraction_numbers(double first_number, double second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
    }

    @Override
    public double calculation() {
        suma = first_number - second_number;
        return suma;
    }
}
