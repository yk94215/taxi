package com.jiker.keju.test;
import com.jiker.keju.Cmd;
import com.jiker.keju.ArgsRead;
import org.junit.Test;
import java.util.List;

import static  org.junit.Assert.assertEquals;
public class ArgsReadTest {
    @Test
    public void testGetCMD() throws Exception {
        ArgsRead argsRead = new ArgsRead("testData.txt");
        List list = argsRead.getCMD();
        Cmd cmd= (Cmd) list.get(0);
        assertEquals(cmd.getDistance(),123);
        assertEquals(cmd.getWating(),0);
        Cmd cmd2= (Cmd) list.get(9);
        assertEquals(cmd2.getDistance(),123);
        assertEquals(cmd2.getWating(),10);
    }
}