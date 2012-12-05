

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HNodeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HNodeTest
{
    HNode hn1, hn2, hn3, hn4, hn5;
    
    @Before
    public void setUp() {
        hn1 = new HNode('A');
        hn2 = new HNode('A',1.2,"11");
        hn3 = new HNode('A',1.28);
        hn4 = new HNode('B',1.2,"01");
        hn5 = new HNode('A',1.2,"11");
    }
    
    @Test
    public void testCompareTo() {
           assertEquals(hn2.compareTo(hn3),-1);
           assertEquals(hn3.compareTo(hn2),1);
           assertEquals(hn4.compareTo(hn2),0);
           assertEquals(hn3.compareTo(hn5),1);
           assertEquals(hn5.compareTo(hn2),0);
           assertEquals(hn5.compareTo(hn4),0);
           assertEquals(hn4.compareTo(hn2),0);
    }
    
    @Test
    public void testEquals() {
        assertFalse(hn1.equals(hn2));
        assertFalse(hn1.equals(hn3));
        assertFalse(hn1.equals(hn4));
        assertFalse(hn1.equals(hn5));
        assertFalse(hn2.equals(hn3));
        assertFalse(hn2.equals(hn4));
        assert(hn2.equals(hn5));
        assertFalse(hn3.equals(hn4));
        assertFalse(hn3.equals(hn5));
        assertFalse(hn4.equals(hn5));
    }
    
    @Test
    public void testGetCode() {
        assertEquals(hn1.getCode(),"");
        assertEquals(hn2.getCode(),"11");
        assertEquals(hn3.getCode(),"");
        assertEquals(hn4.getCode(),"01");
        assertEquals(hn5.getCode(),"11");
        assertEquals(hn4.getCode(),"01");
    }
    
    @Test
    public void testGetFrequency() {
        assert(hn1.getFrequency() == 0);
        assert(hn2.getFrequency() == 1.2);
        assert(hn3.getFrequency() == 1.28);
        assert(hn4.getFrequency() == 1.2);
        assert(hn5.getFrequency() == 1.2);
    }
    
    @Test
    public void testGetLeftChild() {
        HNode child = new HNode('A');
        HNode parent = new HNode('A',.2,"11",child,null);
        assertEquals(child,parent.getLeftChild());
    }
    
    @Test
    public void testGetRightChild() {
        HNode child = new HNode('A');
        HNode parent = new HNode('A',.2,"11",null,child);
        assertEquals(child,parent.getRightChild());
    }
    
    @Test
    public void testGetSymbol() {
        assertEquals(hn1.getSymbol(),(Character)'A');
        assertEquals(hn1.getSymbol(),hn2.getSymbol());
        assertEquals(hn1.getSymbol(),hn3.getSymbol());
        assertEquals(hn2.getSymbol(),hn3.getSymbol());
    }
    
    @Test
    public void testSetCode() {
        assertEquals(hn2.getCode(),hn5.getCode());
        hn2.setCode("00");
        assertEquals(hn2.getCode(),"00");
    }
    
    @Test
    public void testSetFrequency() {
        assert(hn1.getFrequency() == 0);
        hn1.setFrequency(1.3);
        assert(hn1.getFrequency() == 1.3);
    }
    
    @Test
    public void testSetLeftChild() {
        hn1.setLeftChild(hn2);
        assertEquals(hn1.getLeftChild(),hn2);
    }
    
    @Test
    public void testSetRightChild() {
        hn1.setRightChild(hn2);
        assertEquals(hn1.getRightChild(),hn2);
    }
    
    @Test
    public void testSetSymbol() {
        hn1.setSymbol('B');
        assertEquals(hn1.getSymbol(),(Character)'B');
        assertFalse(hn1.getSymbol().equals(hn2.getSymbol()));
        assertFalse(hn1.getSymbol().equals(hn3.getSymbol()));
        assertEquals(hn2.getSymbol(),hn3.getSymbol());
    }
    
}
