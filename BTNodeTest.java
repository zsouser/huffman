

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BTNodeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BTNodeTest
{
    BTNode<String> node1, node2, node3;
    public BTNodeTest() {
        node1 = new BTNode<String>();
        node2 = new BTNode<String>("Test");
        node3 = new BTNode<String>("Tree",node1,node2);
    }
    
    @Test
    public void getLeftChildTest() {
        assertNull(node1.getLeftChild());
        assertNull(node2.getLeftChild());
        assertEquals(node3.getLeftChild(),node1);
    }
    
    @Test
    public void getRightChildTest() {
        assertNull(node1.getRightChild());
        assertNull(node2.getRightChild());
        assertEquals(node3.getRightChild(),node2);
    }
    
    @Test 
    public void getValueTest() {
        assertNull(node1.getValue());
        assertEquals(node2.getValue(),"Test");
        assertEquals(node3.getValue(),"Tree");
    }
    
    @Test
    public void setValueTest() {
        BTNode<String> temp = new BTNode<String>();
        assertNull(temp.getValue());
        temp.setValue("Test");
        assertEquals(temp.getValue(),"Test");
    }
}
