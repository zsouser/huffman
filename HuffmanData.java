import java.lang.Math;
/**
 * Huffman Data object, stores the symbol, frequency, and code of each node
 * in the Huffman Tree
 * 
 * @author Zach Souser
 * @version 1.0
 */
public class HuffmanData
{
    /**
     * The codeword for the letter
     */
    private String code;
    /**
     * The minimum margin by which two similar frequencies will be the same
     */
    public static double EPSILON = 0.0001;
    /**
     * The frequency of the letter
     */
    private double frq;
    /**
     * The symbol being considered
     */
    private Character sym;

    /**
     * No-argument constructor for objects of class HuffmanData
     */
    public HuffmanData()
    {
        code = "";
        frq = 0;
        sym = null;
    }
    
    /**
     * One-argument constructor for HuffmanData, specifying only
     * the symbol
     * 
     * @param   symbol  the Character symbol for the node
     */
    
    public HuffmanData(Character symbol) {
        code = "";
        frq = 0;
        sym = symbol;
    }
    
    /**
     * Two-argument constructor for HuffmanData, specifying
     * symbol and frequency
     * 
     * @param   symbol  the symbol Character
     * @param   frequency   the frequency
     */
    
    public HuffmanData(Character symbol, double frequency) {
        code = "";
        frq = frequency;
        sym = symbol;
    }
    
    /**
     * Two-argument constructor for HuffmanData, specifying
     * symbol, frequency, and code
     * 
     * @param   symbol  the symbol Character
     * @param   frequency   the frequency
     * @param   code    the Huffman code
     */
    
    public HuffmanData(Character symbol, double frequency, String code) {
        this.code = code;
        frq = frequency;
        sym = symbol;
    }
    
    /**
     * CompareTo method - 
     * 
     * @param   n   data to be compared
     * @return  1 if greater than, 0 if the same, and -1 if less than
     */
    public int compareTo(HuffmanData n) {
        double difference = n.getFrequency() - this.frq;
        if (Math.abs(difference) < EPSILON) return 0;
        if (difference < 0) return 1;
        if (difference > 0) return -1;
        return 0;
    }
    
    /**
     * Equals method -
     * 
     * @param   o   the data to be compared
     * @return  true if the frequencies and symbols match, false otherwise
     */
    public boolean equals(HuffmanData o) {
        return this.compareTo(o) == 0 && this.sym == o.getSymbol();
    }
    
    /**
     * Accessor method for code
     * 
     * @return  the code
     */
    
    public String getCode() {
        return this.code;
    }
    
    /**
     * Accessor method for frequency
     * 
     * @return  the frequency
     */
    
    public double getFrequency() {
        return this.frq;
    }
    
    /**
     * Accessor method for symbol
     * 
     * @return  the symbol
     */
    
    public Character getSymbol() {
        return this.sym;
    }
    
    /**
     * HashCode
     * 
     * @return  the hash code
     */
    
    public int hashCode() {
        return 43 * this.sym;
    }
    
    /**
     * Mutator method for code
     * 
     * @param   code    the new code
     */
    
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Mutator method for frequency
     * 
     * @param   frequency   the new frequency
     */
    
    public void setFrequency(double frequency) {
        this.frq = frequency;
    }
    
    /**
     * Mutator method for symbol
     * 
     * @param   symbol  the new symbol
     */
    
    public void setSymbol(Character symbol) {
        this.sym = symbol;
    }
    
    /**
     * toString implementation
     * 
     * @return the string representation of the data
     */
    public String toString() {
        return "<HD: " + sym + ", " + frq + ", " + code + ">";
    }
}
