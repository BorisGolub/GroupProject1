package GroupProject1;

public class Task10 {
    public static void main(String[] args) {

        String[] cars = {"BMW", "Mercedes", "Toyota", "Honda", "GMC", "Chevrolet", "BMW"};

        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].equals(cars[j])) {

                    System.out.println("Duplicate car is " + cars[j]);
                }
            }
            }
        }
    }