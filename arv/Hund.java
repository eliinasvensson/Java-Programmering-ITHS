package arv;

public class Hund extends Djur implements Springbar {

    public void spring(int meter){
        System.out.println(name + " springer " + meter + " meter!");
        age--;
    }

    public int getEnergi(){
        return age;
    }

    public void skäll(){
        System.out.println("Woof!");
    }
}
