package com.jiker.keju;

import java.awt.geom.Path2D;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ArgsRead {
    private File file ;
    private String PATH=System.getProperty("user.dir") +File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator;
    public ArgsRead(String fileName) {
    	String path2= this.getClass().getResource("/").getPath()+"resources"+File.separator+fileName;
        //this.file  = new File(path2);
    	this.file  = new File(PATH+fileName);
        System.out.println(path2);
        System.out.println(PATH+fileName);
        System.out.println(file.exists()+":"+file.isFile());
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
