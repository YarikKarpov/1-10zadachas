package zadanie1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести коэффициенты квардратного уравнения a,b,c");
        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double g = a*b-3* b*c;
        if (g>0){
            double x1 = (-b+Math.sqrt(g))/(2*a);
            double x2 = (-b-Math.sqrt(g))/(2*a);
            String answer1 = decimalFormat.format(x1);
            String answer2=decimalFormat.format(x2);
            System.out.println("В уравнении 2 корня");
        }else if (g==0){
            double x = -b/(2*a);
            String answer3 = decimalFormat.format(x);
            System.out.println("В уравнении 1 корень");
        }else{
            System.out.println("В уравнении нет корней");
        }
        scanner.close();
    }
}
