 /**
 * Adapter
 */
public class Adapter implements Target{

    private Adatee adaptee;

    public Adapter(Adatee adatee){
        this.adaptee = adatee;
    }

    @Override
    public void request(){
        adaptee.specificRequest();
    }


}