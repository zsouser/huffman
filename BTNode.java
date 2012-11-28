import java.io.Serializable;
/**
 * Decision tree node for Strings. Has a value
 * and left and right children. All accessor and
 * mutator methods within
 * 
 * @author Zach Souser 
 * @version 1.0
 */
public class BTNode<T> implements Serializable {
    // instance variables - replace the example below with your own
    private T value;
    private BTNode<T> left, right;

    /**
     * Constructor for objects of class BTNode
     * No paramaters, initializes all to null
     */
    public BTNode() {
        this.value = null;
        this.right = null;
        this.left = null;
    }
    
    /**
     * One-paramater constructor of class BTNode
     * 
     * @param value the value of the BTNode
     */
    
    public BTNode(T value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
    
    /**
     * Three-parameter constructor of class BTNode
     * 
     * @param value the value of the BTNode
     * @param left the left-hand child of the BTNode, can be null
     * @param right the right-hand child of the BTNode, can be null
     */
    
    public BTNode(T value, BTNode<T> left, BTNode<T> right) {
        this.value = value; 
        this.left = left;
        this.right = right;
    }
    
    /** 
     * getLeftChild returns the left child of the BTNode
     * 
     * @return the BTNode that is the left child of this BTNode
     */
    
    public BTNode<T> getLeftChild() {
        return this.left;
    }
    
    /**
     * getRightChild returns the right child fo the BTNode
     * 
     * @return the BTNode that is the right child of this BTNode
     */
    
    public BTNode<T> getRightChild() {
        return this.right;
    }
    
    /** 
     * getValue returns the value of the current BTNode
     * 
     * @return the value of the BTNode
     */
    
    public T getValue() {
        return this.value;
    }
    
    /**
     * setLeftChild allows you to set the left child of the
     * BTNode
     * 
     * @param leftChild the BTNode to be set as the left child
     */
    
    public void setLeftChild(BTNode<T> leftChild) {
        this.left = leftChild;
    }
    /**
     * setRightChild allows you to set the right child of the
     * BTNode
     * 
     * @param rightChild the BTNode to be set as the right child
     */
    
    public void setRightChild(BTNode<T> rightChild) {
        this.right = rightChild;
    }
    
    /**
     * setValue allows you to set the value of the
     * BTNode
     * 
     * @param value the new value
     */
    
    public void setValue(T value) {
        this.value = value;
    }
    
    
    /**
     * toString method for BTNode
     * 
     * @return the String representation of the BTNode
     */
    
    public String toString() {
        return "[" + this.left + "|" + this.value + "|" + this.right + "]";
    }
    
    /**
     * equals method for BTNode
     * 
     * @param   node    the node to be compared to this
     * @return  true if node is the same, false if not
     */
    
    public boolean equals(BTNode<T> node) {
        return node.getValue() == this.getValue() && 
               node.getLeftChild() == this.getLeftChild() && 
               node.getRightChild() == this.getRightChild();
    }
}