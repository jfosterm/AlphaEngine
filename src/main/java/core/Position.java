package core;

public class Position {
    private Instrument instrument;
    private int quantity;
    private double averagePrice;
    private double marketPrice = 20;
    public Position(Instrument instrument, int quantity, double averagePrice){
        this.instrument = instrument;
        this.quantity = quantity;
        this.averagePrice = averagePrice;
    }

    public Instrument getInstrument(){
        return instrument;
    }

}
