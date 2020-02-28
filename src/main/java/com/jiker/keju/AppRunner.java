package com.jiker.keju;

import java.util.List;

public class AppRunner {

    public static void main(String[] args) throws Exception {
        String testDataFile = "input.txt";
        String receipt = "";
        ArgsRead argsRead = new ArgsRead(testDataFile);
        List list = argsRead.getCMD();
        ExCuteCmd exCuteCmd = new ExCuteCmd();
        receipt = exCuteCmd.excute(list);
        System.out.println(receipt);
    }
}
