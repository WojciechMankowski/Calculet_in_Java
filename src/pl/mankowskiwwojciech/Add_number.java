package pl.mankowskiwwojciech;


public class Add_number implements calculations {
    private double first_number;
    private double second_number;
    private double suma;

    public Add_number(double first_number, double second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
    }
    public  double calculation(){
        suma = first_number + second_number;
        return suma;
    }
}
