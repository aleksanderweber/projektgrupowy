import java.util.Scanner;

public class TrapezeField implements Worker {

    @Override
    public void doWork() {

        System.out.println("Podaj A");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Podaj B");
        int b = sc.nextInt();
        System.out.println("Podaj h");
        int h = sc.nextInt();

        System.out.println("Pole trapezu o podstawach a="+a +
                " i b=" +" oraz wysokosci h=" + h +
                " wynosi: " + ((a+b)/2.0*h));

    }
}
