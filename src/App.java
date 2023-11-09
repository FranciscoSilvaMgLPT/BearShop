import java.util.Scanner;

public class App {

    public static void start() throws InterruptedException {
        int option = -10;
        while (option != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("HELLO! Welcome to bear shop! 🧸\nBEARS: ");
            if (Shop.bears.size() > 0) {
                System.out.println();
                Shop.seeBears();
            } else {
                System.out.println("NO BEARS!");
            }
            System.out.print("\n\n What do you wish to do?\n1-See bears  2-Create bears  3-Make bears talk  4-Charge bears  0-Exit\nOPTION:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Shop.seeBears();
                    break;
                case 2:
                    Shop.createBear();
                    break;
                case 3:
                    Shop.makeBearsTalk();
                    break;
                case 4:
                    Shop.chargeBears();
                default:
                    System.out.println("Ahm?");
            }


        }
    }
}
