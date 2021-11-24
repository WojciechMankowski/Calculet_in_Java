package pl.mankowskiwwojciech;

import java.util.Scanner;
import java.util.InputMismatchException;
public class UserInterface {

    private int choice;
    private boolean isExit;
    OperationHistory operationHistory = new OperationHistory(10);
    private void printout(){
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Historia operacji");
        System.out.println("6. Wyjście");
    }
    private void Choice_of_action(){
        System.out.println("Jaką obcje wybieracz: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

    }
    private double EnterNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        try {
            System.out.println("Wpisz liczbę np. 148.15");
            number1 = scanner.nextDouble();

        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        return number1;
    }
    private void SelectionMenu(){
        double number1, number2;
        String result = "Wynikiem działania jest: ";
        String no_str = " ";

        switch (choice){
            case 1:
                number1 = EnterNumbers();
                number2 = EnterNumbers();
                System.out.println(number2);
                Add_number add_number = new Add_number(number1, number2);
                double suma = add_number.calculation();
                String adding = number1 + " + " + number2;
                operationHistory.add(adding, suma);
                System.out.println(result + suma);
                System.out.println(no_str);
                break;
            case 2:
                number1 = EnterNumbers();
                number2 = EnterNumbers();
                Subtraction_numbers subtraction_numbers = new Subtraction_numbers(number1, number2);
                double suma_sub = subtraction_numbers.calculation();
                String inf = number1 + "-" + number2;
                operationHistory.add(inf, suma_sub);
                System.out.println(result + suma_sub);
                System.out.println(no_str);
                break;

            case 3:
                number1 = EnterNumbers();
                number2 = EnterNumbers();
                Multiplication multiplication = new Multiplication(number1, number2);
                double sum_mult = multiplication.calculation();
                String info = number1 + "*" + number2;
                operationHistory.add(info, sum_mult);
                System.out.println(result + sum_mult);
                System.out.println(no_str);
                break;
            case 4:
                number1 = EnterNumbers();
                number2 = EnterNumbers();
                Division division = new Division(number1, number2);
                boolean checking = division.checking_that_the_second_number_is_not_zero();
                if (checking){
                    double sum_div = division.calculation();
                    System.out.println(result + sum_div);
                    String info1 = number1 + "/" + number2;
                    operationHistory.add(info1, sum_div);
                    System.out.println(no_str);
                }
                else {
                    System.out.println("Błąd !! Nie można dzielić przez zero");
                }
                break;

            case 5:
                System.out.println("HISTORJA");
                operationHistory.PrintOut();
                System.out.println(no_str);
                break;
            case 6:
                number1=EnterNumbers();
                Strong strong = new Strong(number1);
                double calculation = strong.calculation();
                String info2 = number1 + "! ";
                operationHistory.add(info2, calculation);
                System.out.println(result + calculation);
                break;
            case 7:
                this.isExit = false;
        }
    }

    public void menu(){
        isExit = true;

        while (isExit){
            printout();
            Choice_of_action();
            SelectionMenu();
        }
    }
}

