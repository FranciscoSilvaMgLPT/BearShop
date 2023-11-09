public class CrankyBear extends Bear{
    public CrankyBear() {
        this.name = "Cranky Bear";
        Shop.bears.add(this);
    }

    @Override
    public void talk() throws InterruptedException {
        if(battery>=50){
            System.out.println(words);
        }else{
            sing();
        }
        super.talk();
    }

    public void sing(){
        words="Blllll.. Im cranky! I SING I SING I SING!";
        this.battery=0;
        System.out.println(words);
    }
}
