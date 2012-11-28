
/**
 * Write a description of class HuffmanData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HuffmanData
{
    // instance variables - replace the example below with your own
    private String code;
    public static double EPSILON = 0.5;
    private double frq;
    private Character sym;

    /**
     * Constructor for objects of class HuffmanData
     */
    public HuffmanData()
    {
        code = null;
        frq = 0;
        sym = null;
    }
    
    public HuffmanData(Character symbol) {
        code = "" + symbol;
        frq = 0;
        sym = symbol;
    }
    
    public HuffmanData(Character symbol, double frequency) {
        code = "" + symbol;
        frq = frequency;
        sym = symbol;
    }
    
    public HuffmanData(Character symbol, double frequency, String code) {
        code = code;
        frq = frequency;
        sym = symbol;
    }
    
    public int compareTo(HuffmanData n) {
        return (int)(this.frq - n.getFrequency());
    }
    
    public boolean equals(HuffmanData o) {
        return this.frq == o.getFrequency() && this.sym == o.getSymbol();
    }
    
    public String getCode() {
        return this.code;
    }
    
    public double getFrequency() {
        return this.frq;
    }
    
    public Character getSymbol() {
        return this.sym;
    }
    
    public int hashCode() {
        return 43 * this.sym;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setFrequency(double frequency) {
        this.frq = frequency;
    }
    
    public void setSymbol(Character symbol) {
        this.sym = symbol;
    }
    
    public String toString() {
        return "<HD: " + sym + ", " + frq + ", " + code + ">";
    }
}
