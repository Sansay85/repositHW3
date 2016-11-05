/**
 * Created by Aleksandr on 27.10.2016.
 */
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть катет a = ");
        int a = in.nextInt();
        System.out.print("Введіть катет b = ");
        int b = in.nextInt();
        System.out.print("Площа прямокутного трикутника = ");
        System.out.println(ploscha (a, b));
    }
    static int ploscha (int a, int b) {
        int s = a * b / 2;
        return s;
    }
}
