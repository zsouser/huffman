

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HuffmanDataTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HuffmanDataTest
{
    HuffmanData hd1,hd2,hd3,hd4,hd5,hd6;
    @Before
    public void setUp() {
        hd1 = new HuffmanData();
        hd2 = new HuffmanData('A');
        hd3 = new HuffmanData('A',.23,"11");
        hd4 = new HuffmanData('A');
        hd5 = new HuffmanData('A',.2301,"11");
        hd6 = new HuffmanData('C',.24,"01");
    }
    @Test
    public void testCompareTo() {
        assertEquals(hd1.compareTo(hd2),0);
        assertEquals(hd1.compareTo(hd3),-1);
        assertEquals(hd1.compareTo(hd4),0);
        assertEquals(hd1.compareTo(hd5),-1);
        assertEquals(hd1.compareTo(hd6),-1);
        assertEquals(hd2.compareTo(hd3),-1);
        assertEquals(hd2.compareTo(hd4),0);
        assertEquals(hd2.compareTo(hd5),-1);
        assertEquals(hd2.compareTo(hd6),-1);
        assertEquals(hd3.compareTo(hd4),1);
        assertEquals(hd3.compareTo(hd5),0);
        assertEquals(hd3.compareTo(hd6),-1);
        assertEquals(hd4.compareTo(hd5),-1);
        assertEquals(hd4.compareTo(hd6),-1);
        assertEquals(hd5.compareTo(hd6),-1);
    }
    @Test
    public void testEquals() {
        assertFalse(hd1.equals(hd2));
        assertFalse(hd1.equals(hd3));
        assertFalse(hd1.equals(hd4));
        assertFalse(hd1.equals(hd5));
        assertFalse(hd1.equals(hd6));
        assertFalse(hd2.equals(hd3));
        assert(hd2.equals(hd4));
        assertFalse(hd2.equals(hd5));
        assertFalse(hd2.equals(hd6));
        assertFalse(hd3.equals(hd4));
        assert(hd3.equals(hd5));
        assertFalse(hd3.equals(hd6));
        assertFalse(hd4.equals(hd5));
        assertFalse(hd4.equals(hd6));
        assertFalse(hd5.equals(hd6));
    }
    @Test
    public void testGetCode() {
        assertEquals(hd1.getCode(),"");
        assertEquals(hd2.getCode(),"");
        assertEquals(hd3.getCode(),"11");
        assertEquals(hd4.getCode(),"");
        assertEquals(hd5.getCode(),"11");
        assertEquals(hd6.getCode(),"01");
    }
    
    @Test
    public void testGetFrequency() {
        assert(hd1.getFrequency() == 0);
        assert(hd2.getFrequency() == 0);
        assert(hd3.getFrequency() == .23);
        assert(hd4.getFrequency() == 0);
        assert(hd5.getFrequency() == .2301);
        assert(hd6.getFrequency() == .24);
    }
    
    @Test
    public void testGetSymbol() {
        assertEquals(hd1.getSymbol(),null);
        assertEquals(hd2.getSymbol(),(Character)'A');
        assertEquals(hd3.getSymbol(),(Character)'A');
        assertEquals(hd4.getSymbol(),(Character)'A');
        assertEquals(hd5.getSymbol(),(Character)'A');
        assertEquals(hd6.getSymbol(),(Character)'C');
    }
    
    @Test
    public void testSetCode() {
        assertEquals(hd1.getCode(),"");
        hd1.setCode("10");
        assertEquals(hd1.getCode(),"10");
    }
    
    @Test
    public void testSetFrequency() {
        assert(hd1.getFrequency() == 0);
        hd1.setFrequency(10);
        assert(hd1.getFrequency() == 10);
    } 
    @Test
    public void testSetSymbol() {
        assertEquals(hd1.getSymbol(),null);
        hd1.setSymbol('D');
        assertEquals(hd1.getSymbol(),(Character)'D');
    }
    @Test
    public void testToString() {
        assertEquals(hd1.toString(),"<HD: null, 0.0, >");
        assertEquals(hd2.toString(),"<HD: A, 0.0, >");
        assertEquals(hd3.toString(),"<HD: A, 0.23, 11>");
        assertEquals(hd4.toString(),"<HD: A, 0.0, >");
        assertEquals(hd5.toString(),"<HD: A, 0.2301, 11>");
        assertEquals(hd6.toString(),"<HD: C, 0.24, 01>");
    }
}
