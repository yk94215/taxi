package com.jiker.keju;

import java.util.List;

 
public class AppRunner {
    public static void main(String  args[]){
    	ArgsRead argsRead = null;
    	try {if(args.length>0) {
      argsRead = new ArgsRead(args[0]);}
      else {argsRead = new ArgsRead("input.txt");}
      List<Cmd> list = argsRead.getCMD();
      String receipt = new ExCuteCmd().excute(list);
     System.out.println(receipt);}
  catch (Exception e){e.printStackTrace();}}    
 }
