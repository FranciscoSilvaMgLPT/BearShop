public class SimpleBear extends Bear {
    public SimpleBear() {
        this.name = "Simple Bear";
        Shop.bears.add(this);
    }

    @Override
    public void talk() throws InterruptedException {
        if(battery>0){
            System.out.println(words);

        }else{
            System.out.println("OUT OF BATTERY");
        }
        super.talk();
    }

}
