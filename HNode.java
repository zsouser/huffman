
/**
 * The node of a HuffmanTree. Has HuffmanData as its value, but 
 * is otherwise a BTNode
 * 
 * @author Zach Souser
 * @version 1.0
 */
public class HNode extends BTNode<HuffmanData> implements Comparable<HNode>
{
    /**
     * No-argument Constructor for objects of class HNode
     */
    public HNode()
    {
        super(new HuffmanData());
    }
    
    /**
     * Single-argument constructor for HNode, specifying only
     * the symbol
     * 
     * @param   symbol  the symbol of the node
     */
    
    public HNode(Character symbol) {
        super(new HuffmanData(symbol));
    }
    
    /**
     * Two-argument constructor for Hnode, specifying
     * symbol and frequency
     * 
     * @param   symbol  the symbol for the node
     * @param   frequency   the frequency of the symbol in the word
     */
    
    public HNode(Character symbol, double frequency) {
        super(new HuffmanData(symbol, frequency));
    }
    
    /** 
     * Three-argument constructor for HNode, specifying
     * the symbol, frequency, and codeword for the node
     * 
     * @param   symbol  the symbol for the node
     * @param   frequency   the frequency of the symbol in the string
     * @param   code    the codeword for the node
     */
    
    public HNode(Character symbol, double frequency, String code) {
        super(new HuffmanData(symbol, frequency, code));
    }
    
    /**
     * Five-argument constructr, specifying symbol, frequency,
     * codeword, and left and right children
     * 
     * @param   symbol  the symbol for the node
     * @param   frequency   the frequency of the symbol in the string
     * @param   code    the codeword for the node
     * @param   left    the left child
     * @param   right   the right child
     */
    
    public HNode(Character symbol, double frequency, String code, HNode left, HNode right) {
        super(new HuffmanData(symbol, frequency, code), left, right);
    }
    
    /**
     * Compares one HNode to another
     * 
     * @param   n   the node to be compared to
     * @return  1 if frequency is greater than, 0 if the same, and -1 if less than n
     */
    
    public int compareTo(HNode n) {
        return this.getValue().compareTo(n.getValue());
        
    }
    
    /**
     * Equals method for HNodes
     * 
     * @param   o   the node to be compared
     * @return  the true if HNode's data matches o, and false if not
     */
    
    public boolean equals(HNode o) {
        return this.getValue().equals(o.getValue());
    }
    
    /**
     * Accessor method for code property
     * 
     * @return  the code for the HNode
     */
    
    public String getCode() {
        return this.getValue().getCode();
    }
    
    /**
     * Accessor method for frequency property
     * 
     * @return  the frequency of the HNode
     */
    
    public double getFrequency() {
        return this.getValue().getFrequency();
    }
    
     /**
     * Accessor method for left child
     * 
     * @return  the left child of the HNode
     */
    
    public HNode getLeftChild() {
        return (HNode)super.getLeftChild();
    }

    /**
     * Accessor method for right child
     * 
     * @return  the right child of the HNode
     */
    
    public HNode getRightChild() {
        return (HNode)super.getRightChild();
    }
    
    /**
     * Accessor method for symbol
     * 
     * @return  the symbol of the HNode
     */
    
    public Character getSymbol() {
        return this.getValue().getSymbol();
    }
    
    /**
     * HashCode implementation for the symbol;
     * 
     * @return  the hash code
     */
    
    public int hashCode() {
        return 43 * this.getValue().hashCode();
    }
    
    /**
     * Mutator method for the code property
     * 
     * @param   code    the code to be assigned to this node
     */
    
    public void setCode(String code) {
        this.getValue().setCode(code);
    }
    
    /**
     * Mutator method for frequency
     * 
     * @param   frequency   the new frequency
     */
    
    public void setFrequency(double frequency) {
        this.getValue().setFrequency(frequency);
    }
    
    /**
     * Mutator method for symbol
     * 
     * @param   symbol  the new symbol
     */
    
    public void setSymbol(Character symbol) {
        this.getValue().setSymbol(symbol);
    }
}
