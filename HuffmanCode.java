import java.util.HashMap;
import java.util.PriorityQueue;
/**
 * HuffmanCode controller for a Huffman coder/decoder
 * 
 * @author Zach Souser
 * @version 1.0
 */
public class HuffmanCode
{
    /**
     * Seed string for the Huffman Code
     */
    private String seed;
    /**
     * the root of the Huffman Code Tree
     */
    private HNode codeTree;
    /**
     * the HashMap of the Huffman Code
     */
    private HashMap<Character,String> codeMap;
    
    public static void main(String[] args) {
        HuffmanCode hc = new HuffmanCode("Test");
        System.out.println(hc.encode("ts"));
        System.out.println(hc.decode("1101"));
    }
    /**
     * Constructor for objects of class HuffmanCode
     * 
     * @param initialString the seed string to be stored
     */
    public HuffmanCode(String initialString) {
        this.seed = initialString;
        PriorityQueue<HNode> q = createPriorityQueue(createFrequencyMap(initialString));
        createCodeTree(q);
        setCodes(this.codeTree,"");
        this.codeMap = new HashMap<Character,String>();
        growCodeMap(this.codeTree);
    }

    /**
     * Create the code tree
     * 
     * @param   hh  the PriorityQueue containing the subtrees
     */
    private void createCodeTree(PriorityQueue<HNode> hh) {
        if (hh.size() == 1) this.codeTree = hh.poll();
        else {
            HNode small1 = hh.poll();
            HNode small2 = hh.poll();
            hh.add(new HNode(null,small1.getFrequency()+small2.getFrequency(),"",small1,small2));
            createCodeTree(hh);
        }
    }

    /**
     * Create the frequency map
     * 
     * @param   source  source string
     * @return  the temporary HashMap of frequencies
     */
    private HashMap<Character,Integer> createFrequencyMap(String source) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < source.length(); i++) {
            Character ch = new Character(source.charAt(i));
            if (map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch,1);
        }
        
        return map;
    }
    
    /**
     * Create the PriorityQueue based on the frequency map from
     * createFrequencyMap
     * 
     * @param   fm  the frequency map
     * @return  the PriorityQueue based on the frequency table
     */
    private PriorityQueue<HNode> createPriorityQueue(HashMap<Character,Integer> fm) {
        PriorityQueue<HNode> q = new PriorityQueue<HNode>();
        for (Character c : fm.keySet()) {
            q.add(new HNode(c,fm.get(c)));
        }
        return q;
    }
    
    /**
     * Decode a string based on the Huffman Code
     * 
     * @param   encoded the string to be decoded
     * @return  the decoded string
     */
    public String decode(String encoded) {
        char letter;
        HNode root = this.codeTree;
        String ret = "";
        for (int i = 0; i < encoded.length(); i++) {
            char c = encoded.charAt(i);
            if (c == '1') root = root.getRightChild();
            else if (c == '0') root = root.getLeftChild();
            if (root.getSymbol() != null) {
                ret += root.getSymbol();
                root = this.codeTree;
            }
            
        }
        return ret;
    }
    
    /**
     * Encode a string based on the Huffman Code
     * 
     * @param   the string to be encoded
     * @return  the encoded string
     */
    
    public String encode(String clearText) {
        String ret = "";
        for (int i = 0; i < clearText.length(); i++) {
            if (!this.codeMap.containsKey((Character)clearText.charAt(i))) {
                return "Error: Cannot encode with current tree";
            } else {
                ret += this.codeMap.get((Character)clearText.charAt(i));
            }
        }
        return ret;
    }
    
    /**
     * Get the code map
     * 
     * @return  the code map
     */
    
    public HashMap<Character,String> getCodeMap() {
        return this.codeMap;
    }
    
    /**
     * Get the code tree
     * 
     * @return  the root of the code tree
     */
    public HNode getCodeTree() {
        return this.codeTree;
    }
    
    /**
     * Grow the code map by parsing the code tree,
     * adding to the code map when a letter node is reached
     * 
     * @param   root    the current HNode
     */
    private void growCodeMap(HNode root) {
         if (root != null) {
            if (root.getSymbol() != null) 
                this.codeMap.put(root.getSymbol(),root.getCode());
            growCodeMap(root.getLeftChild());
            growCodeMap(root.getRightChild());
        }
    }
    
    /**
     * Set the codes for all tree nodes
     * 
     * @param   root    the node whose code should be changed
     * @param   code    the acting code
     */
    
    private void setCodes(HNode root, String code) {
        if (root != null) {
            root.setCode(code);
            setCodes(root.getLeftChild(),code + "0");
            setCodes(root.getRightChild(),code + "1");
        }
    }
}
