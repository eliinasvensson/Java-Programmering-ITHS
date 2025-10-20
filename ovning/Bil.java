package ovning;
public class Bil extends Fordon implements Driveable{
    double pris = 10;
    double vikt = 67;
    private int km = 0;

    @Override
    public void drive(int kms){
        km += kms;

    }

    @Override
    public int getKm(){
        return km;
    }
}
