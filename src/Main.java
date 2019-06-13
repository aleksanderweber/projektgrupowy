import java.util.Scanner;

public class Main {
    private static Worker workToDo;

    public static void main(String[] args) {
        printManual();
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                workToDo = new TriangleField();
                break;
            case 2:
                workToDo = new CircleField();
                break;
            case 3:
                workToDo = new SquareField();
                break;
            case 4:
                workToDo = new TrapezeField();
            break;
            default:
                throw new IllegalArgumentException("Operacja jest niedozwolona");
        }

        workToDo.doWork();
    }

    public static void printManual() {
        System.out.println("Wybierz opcje aby wykonać podprogram:");
        System.out.println("1. Liczenie pola trójkąta");
        System.out.println("2. Liczenie pola koła");
        System.out.println("3. Liczenie pola kwadratu");
        System.out.println("4. Liczenie pola trapezu");
        System.out.println("Twój wybór: ");
    }
}


