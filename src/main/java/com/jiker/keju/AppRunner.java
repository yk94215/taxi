package com.jiker.keju;

import java.util.List;

public class AppRunner {

    public static void main(String  args[]){
        try { String receipt = "";
        ArgsRead argsRead = new ArgsRead(args[0]);
        List list = argsRead.getCMD();
        ExCuteCmd exCuteCmd = new ExCuteCmd();
        receipt = exCuteCmd.excute(list);
        System.out.println(receipt);
 		} catch (Exception e) {e.printStackTrace();}
        
    }
}
