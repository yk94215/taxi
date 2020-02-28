package com.jiker.keju;

import java.util.List;

public class ExCuteCmd {

    public String excute(List list) {
        if(list!=null){
            String pfix = "收费";String sfix = "元\n";String ret = "";
            for(int x = 0;x<list.size();x++){
                Cmd cmd = (Cmd) list.get(x);
                ret = ret + pfix+Taxi.getPrice(cmd.getDistance(),cmd.getWating())+sfix;
            }return  ret;}return null;
    }
}
