package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import static org.junit.jupiter.api.Assertions.*;

public class ArrStackTest {
    @Test
    public void testPushAndPop(){
        ArrStack arrStack = new ArrStack();
        arrStack.push("A");
        arrStack.push("B");

        assertEquals(2, arrStack.size());
        assertEquals("B", arrStack.pop());
        assertEquals("A", arrStack.pop());
        assertEquals(0, arrStack.size());
        assertTrue(arrStack.isEmpty());

    }
    @Test
    public void testPushAndPeek(){
        ArrStack arrStack = new ArrStack();
        arrStack.push("A");
        arrStack.push("B");

        assertEquals(2, arrStack.size());
        assertEquals("B", arrStack.peek());
        assertEquals("B", arrStack.peek());
        assertEquals(2, arrStack.size());

    }
    @Test
    public void testIsEmptyForNewStackReturnTrue(){
        ArrStack arrStack = new ArrStack();

        assertTrue(arrStack.isEmpty());

    }
    @Test
    public void testIsEmptyForNotEmptyStackReturnFalse(){
        ArrStack arrStack = new ArrStack();
        arrStack.push("A");
        arrStack.push("B");
        assertFalse(arrStack.isEmpty());

    }

    @Test
    public void testIsEmptyForStackAfterClearReturnTrue(){
        ArrStack arrStack = new ArrStack();
        arrStack.push("A");
        arrStack.push("B");
        arrStack.clear();
        assertTrue(arrStack.isEmpty());

    }
    @Test
    public void testContainsReturnTrue(){
        ArrStack arrStack = new ArrStack();
        arrStack.push("A");
        arrStack.push("B");
        assertTrue(arrStack.contains("A"));

    }
    @Test
    public void testContainsReturnFalse(){
        ArrStack arrStack = new ArrStack();
        arrStack.push("A");
        arrStack.push("B");
        assertFalse(arrStack.contains("s"));

    }
    @Test
    public void testContainsReturnFalseOnEmptyStack(){
        ArrStack arrStack = new ArrStack();

        assertFalse(arrStack.contains("s"));

    }
    @Test
    public void testReturnIllegalExceptionWhenPopOnEmptyStack(){
        ArrStack arrStack = new ArrStack();
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            arrStack.pop();
        });



    }

}
