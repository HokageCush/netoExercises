import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в руб.):");
        int weight = scanner.nextInt();
        System.out.print("Пошлина составит (в руб.):" + calculateCustoms(weight, price));

    }

    public static int calculateCustoms(int weight, int price) {

        double a = (double) price / 100;
        int customs = (int) (a + weight * 100);
        return customs;
    }


}

536