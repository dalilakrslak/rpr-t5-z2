package ba.unsa.etf.rpr;

public class AutoFactory {
    public Factory fabrika(String gorivo){
        if(gorivo.equals("Dizel")) return new Peugeot();
        else if(gorivo.equals("Benzin")) return new BMW();
        else if(gorivo.equals("Struja")) return new Tesla();
        return null;
    }
}