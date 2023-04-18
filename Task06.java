package GroupProject1;

public class Task06 {
    public static void main(String[] args) {

        int number=100;
        boolean prime=true;
        for (int i = 2; i <number ; i++){
            if(number%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("The number "+number+" is prime");
        }else{
            System.out.println("The number "+number+" is not prime");
        }
    }
}
