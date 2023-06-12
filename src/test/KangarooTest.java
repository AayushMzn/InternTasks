package test;

import org.testng.annotations.Test;
import unitTesting.Kangaroo;

import static org.testng.Assert.*;

public class KangarooTest {
    
    @Test
    public void different_velocity_which_meets(){
        String output = Kangaroo.kangaroo(0, 3, 6, 1);
        assertEquals(output,"YES");
    }
    @Test
    public void different_velocity_which_does_not_meets(){
        String output = Kangaroo.kangaroo(0, 3, 1, 4);
        assertEquals(output,"NO");
    }
    @Test
    public void same_velocity(){
        String output = Kangaroo.kangaroo(1, 2, 2, 2);
        assertEquals(output,"NO");
    }

}