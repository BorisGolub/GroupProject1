package GroupProject1;

public class Task01 {
    public static void main(String[] args) {

        double[] temperature = {65, 75.5, 70.5, 93.7, 106, 83};

        double highestTemp = temperature[0];
        double lowestTemp =temperature[0] ;

        for (int i = 0; i <temperature.length ; i++) {
            if (temperature[i]>highestTemp){
                highestTemp=temperature[i];
            }if (temperature[i]<lowestTemp){
                lowestTemp=temperature[i];
            }
        }
        System.out.println("Highest temperature is "+highestTemp);
        System.out.println("Lowest temperature is "+lowestTemp);
    }
}
