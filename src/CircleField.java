import java.util.Scanner;

public class CircleField implements Worker {
    public void doWork(){
        System.out.println("Podaj r");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();


        System.out.println("Pole koła o promieniu r= "+r +  " wynosi: " + (r*r*Math.PI));
    }
}

