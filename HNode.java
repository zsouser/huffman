
/**
 * Write a description of class HNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HNode extends BTNode<HuffmanData> implements Comparable<HNode>
{
    /**
     * Constructor for objects of class HNode
     */
    public HNode()
    {
        super(new HuffmanData());
    }
    
    public HNode(Character symbol) {
        super(new HuffmanData(symbol));
    }
    
    public HNode(Character symbol, double frequency) {
        super(new HuffmanData(symbol, frequency));
    }
    
    public HNode(Character symbol, double frequency, String code) {
        super(new HuffmanData(symbol, frequency, code));
    }
    
    public HNode(Character symbol, double frequency, String code, HNode left, HNode right) {
        super(new HuffmanData(symbol, frequency, code), left, right);
    }
    
    public int compareTo(HNode n) {
        return (int)(this.getFrequency()-n.getFrequency());
    }
    
    public boolean equals(HNode o) {
        return this.getValue().equals(o.getValue());
    }
    
    public String getCode() {
        return this.getValue().getCode();
    }
    
    public double getFrequency() {
        return this.getValue().getFrequency();
    }
    
    public HNode getLeftChild() {
        return (HNode)super.getLeftChild();
    }
    
    public HNode getRightChild() {
        return (HNode)super.getRightChild();
    }
    
    public Character getSymbol() {
        return this.getValue().getSymbol();
    }
    
    public int hashCode() {
        return 43 * this.getValue().hashCode();
    }
    
    public void setCode(String code) {
        this.getValue().setCode(code);
    }
    
    public void setFrequency(double frequency) {
        this.getValue().setFrequency(frequency);
    }
    
    public void setSymbol(Character symbol) {
        this.getValue().setSymbol(symbol);
    }
}
