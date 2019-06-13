import java.util.Scanner;

public class TriangleField implements Worker {
    public void doWork(){
        System.out.println("Podaj A");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Podaj h");
        int h = sc.nextInt();

        System.out.println("Pole trójkąta o boku a="+a + " i wysokości h=" + h + " wynosi: " + (a*h/2.0));
    }
}
