package com.learn.leetcode;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BdapWriter {

    private OutputStream outputStream;
    private BufferedWriter writer;
    private boolean isxieguoshuju = false;

    public void newFile(OutputStream out) throws IOException {
        close();
        this.outputStream = out;
        this.writer = new BufferedWriter(new OutputStreamWriter(out,"utf-8"));
    }


    public void write(List<List<String>> lines) throws IOException {
        for(List<String> line: lines){
            StringBuilder lineString = null;
            if(isxieguoshuju) {
                lineString = new StringBuilder("\n");
            }else {
                lineString = new StringBuilder();
                isxieguoshuju = true;
            }
            int lineSize=line.size();
            for(int i=0;i<lineSize;i++){
//                if(i!=(lineSize-1)){
                    lineString.append(line.get(i)).append("|+|");
//                }
            }
//            lineString.append("|+|\n");
            this.writer.write(lineString.toString());
        }
        this.writer.flush();
    }


    public void close() throws IOException {
        if(this.writer != null){
            this.writer.close();
        }
    }

    public static void main(String[] args) throws IOException {
        BdapWriter bdapWriter = new BdapWriter();
        bdapWriter.newFile(new FileOutputStream(new File("text.dat")));
        List<List<String>> lists = new ArrayList<List<String>>(10);
        lists.add(Arrays.asList("wt", "28", "男"));
        lists.add(Arrays.asList("mkx", "34", "男"));
        lists.add(Arrays.asList("wt", "28", "男"));
        bdapWriter.write(lists);
        bdapWriter.write(lists);
        bdapWriter.close();
    }
}
