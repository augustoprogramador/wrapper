import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double val = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um valor:");
        val = scan.nextDouble();
        Double val2 = val;
        System.out.println((String.format("Esse é o valor de val %.2f", val)));
        System.out.println((String.format("Esse é o valor de val2 %.2f", val2)));
        System.out.println("Comparando os valoes de val e val2, usando o método equals do val2");
        boolean iguais = val2.equals(val);
        System.out.println((String.format("Eles são: %b", iguais)));
    }
}
