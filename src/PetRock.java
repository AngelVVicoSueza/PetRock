public class PetRock {

    private String name;
    private boolean happy=false;


    public PetRock(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public boolean isHappy() {
        return this.happy;
    }

    public void play(){
        this.happy=true;
    }
}