package com.jiker.keju;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ArgsRead {
    private File file ;
    private String PATH=System.getProperty("user.dir") + "\\src\\main\\resources\\";
    public ArgsRead(String fileName) {
        this.file  = new File(getClass().getClassLoader().getResource(fileName).getFile());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(getClass().getClassLoader().getResource(fileName).getFile());
    }
    public List<Cmd> getCMD() throws Exception {
        if(this.file.exists()){List<Cmd> list = new LinkedList<>();InputStream in = null;
            in = new FileInputStream(file);String  line;
            BufferedReader reader = new BufferedReader(new InputStreamReader(in,"UTF-8"));
            line = reader.readLine();while (line!=null) {
                Cmd cmd = new Cmd();String[] tp = line.split(",");
                tp[0]=tp[0].replace("公里","");tp[1]=tp[1].replace("等待","");tp[1]=tp[1].replace("分钟","");cmd.setDistance(Integer.parseInt(tp[0]));
                cmd.setWating(Integer.parseInt(tp[1]));
                list.add(cmd);line = reader.readLine();}
            return list;}return null;}
    }
