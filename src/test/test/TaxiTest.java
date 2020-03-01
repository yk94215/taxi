package  test;
import com.jiker.keju.Taxi;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;
 public class TaxiTest {
    @Test
    public void should_testTaxi_lessStartingPrice(){
        assertEquals(new Taxi().getPrice(2,0),6);
        assertEquals(new Taxi().getPrice(1,0),6);
        assertEquals(new Taxi().getPrice(0,0),6);
    }
    @Test
    public void should_testTaxi_lessL1Price(){
        assertEquals(new Taxi().getPrice(2,0),6);
        assertEquals(new Taxi().getPrice(1,0),6);
        assertEquals(new Taxi().getPrice(15,30),27);
    }
    @Test
    public void assNormal(){
        assertEquals(new Taxi().getPrice(3,40),17);
        assertEquals(new Taxi().getPrice(3,0),7);
    }
    @Test
    public void testWait(){
        assertEquals(new Taxi().getPrice(1,100),31);
    }
    @Test
    public void longDistance(){
        assertEquals(new Taxi().getPrice(13,0),17);
        assertEquals(new Taxi().getPrice(17,15),25);
    }
}
