package org.j2os;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Timestamp;
import java.util.Date;

public class Main {
    public static void main(String[] args)throws Exception {
        File file = new File("C:\\ROOT\\Reza.txt");
        //file.mkdir();
        //file.delete();

        /*String [] files = file.list();
        for (String s : files) {
            System.out.println(s);
        }*/


        //file.deleteOnExit();

        //file.createNewFile();

        //file.renameTo(new File("D:\\Amirsam2.txt"));
        //System.out.println(file.getFreeSpace()/1024/1024/1024);
        //file.getParent();
        //System.out.println(new Date(file.lastModified()));
        //System.out.println(new Date(System.currentTimeMillis()));
        //System.out.println(new Timestamp(System.currentTimeMillis()));


        /*FileWriter fileWriter  = new FileWriter(file);
        fileWriter.write("Hello World\r\nAmirsamBahador");
        fileWriter.close();*/

        FileReader fileReader = new FileReader(file);
        int ascii = fileReader.read();
        StringBuilder stringBuilder = new StringBuilder();
        while (ascii!=-1)
        {
            stringBuilder.append((char)ascii);
            ascii = fileReader.read();
        }
        fileReader.close();
        System.out.println(stringBuilder);

    }
}
