/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package WebApp481;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test 
    public void appHasAGreeting() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.game(array, 4,1,3));
    }
    @Test
   public void sizeNotEqual() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.game(array, 3,1,10));
    }

    @Test
    public void notpositive() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.game(array, 4,-1,10));
    }

    @Test
    public void minmaxError() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(App.game(array, 4,10,1));
    }

    @Test
    public void testNull() {
      assertFalse(App.game(null, 1,1,10));
    }

}
