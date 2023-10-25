import java.util.Random;

public class Nurellas {
    public static void main(String[] args) {
        int minValue = 100;
        int maxValue = 0;
        int i = 0;
        Random r = new Random();
        while (i < 10){
            int result = r.nextInt(99) + 1;
            if (result < minValue){
                minValue = result;
            }
            if (result > maxValue){
                maxValue = result;
            }
            i = i + 1;
        }
        System.out.println("MinValue " + minValue );
        System.out.println("MaxValue " + maxValue );
    }
}
