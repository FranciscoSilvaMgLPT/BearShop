import java.util.Random;

public class DrunkBear extends Bear {
    static boolean sleep = false;
    public DrunkBear() {
        this.name = "Drunk Bear";
        Shop.bears.add(this);
    }

    @Override
    public void talk() throws InterruptedException {
        if(!sleep) {
            System.out.println(words);
        }else {
            sleep();
        }
        int random = new Random().nextInt((10 - 1) + 1) + 1;
        if ((random == 1) ) {
            sleep();
        }
        super.talk();
    }

    public void sleep() throws InterruptedException {
        if (!sleep) {
            System.out.println("FALLING ASLEEP...........");
            sleep = true;
        } else {
            Thread.sleep(1000);
            words = "zzzzZZZZZZzzzzZZZZZZZzzzzz";
            System.out.println(words);
        }
    }

    public static boolean setSleep(boolean sleep) {
        return true;
    }
}
