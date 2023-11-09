import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Shop {

    static ArrayList<Bear> bears = new ArrayList<>();


    public static void createBear() {
        int random;
        random = new Random().nextInt((50 - 1) + 1) + 1;
        if (random % 2 == 0) {
            new SimpleBear();
        } else if (random % 5 == 0) {
            new CrankyBear();
        } else {
            new DrunkBear();
        }
    }

    public static void seeBears() {
        for (int i = 0; i < bears.size(); i++) {
            System.out.println((i + 1) + " 🧸 " + bears.get(i).name);
        }
    }

    public static void makeBearsTalk() throws InterruptedException {
        if (bears.size() > 0) {
            while (bears.get(bears.size() - 1).battery >= 0) {
                for (int i = 0; i < bears.size(); i++) {
                    System.out.println(bears.get(i).name + ": ");
                    bears.get(i).talk();
                    System.out.println();
                    Thread.sleep(500);
                }
                System.out.println("\u001B[41mNEXT ROUND\u001B[0m");
                Thread.sleep(1000);
            }
        } else {
            System.out.println("No bears.. But I can talk to you mate.");
        }
    }

    public static void chargeBears() {
        if (bears.size() > 0) {
            for (int i = 0; i < bears.size(); i++) {
                bears.get(i).battery = 100;
                if (bears.get(i).name.equals("Drunk Bear")) {
                    bears.get(i).words = "I LOVE YOU";
                }
            }
        } else {
            System.out.println("I got shocked man! There are no bears to charge!");
        }
    }
}
