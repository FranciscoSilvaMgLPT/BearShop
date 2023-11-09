public abstract class Bear {

    int battery;
    String name;
    String words = "I LOVE YOU";


    public Bear() {
        this.battery = 100;
    }

    public void talk() throws InterruptedException {
        System.out.println("Battery: "+battery+"%");
        this.battery=battery-10;
  }

}
