package  test;
import main.Taxi;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;
 public class TaxiTest {
    @Test
    public void should_testTaxi_lessStartingPrice(){
        assertEquals(Taxi.getPrice(2,0),6);
        assertEquals(Taxi.getPrice(1,0),6);
        assertEquals(Taxi.getPrice(0,0),6);
    }
    @Test
    public void should_testTaxi_lessL1Price(){
        assertEquals(Taxi.getPrice(2,0),6);
        assertEquals(Taxi.getPrice(1,0),6);
        assertEquals(Taxi.getPrice(15,30),27);
    }
    @Test
    public void assNormal(){
        assertEquals(Taxi.getPrice(3,40),17);
        assertEquals(Taxi.getPrice(3,0),7);
    }
    @Test
    public void testWait(){
        assertEquals(Taxi.getPrice(1,100),31);
    }
    @Test
    public void longDistance(){
        assertEquals(Taxi.getPrice(13,0),17);
        assertEquals(Taxi.getPrice(17,15),25);
    }
}
