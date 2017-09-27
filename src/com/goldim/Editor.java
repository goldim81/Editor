package com.goldim;

import java.io.*;

public class Editor {

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;


    public Editor setFileReader(String fileName) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.bufferedReader = new BufferedReader(fileReader);
        return this;
    }

    public Editor setFileWriter(String fileName, boolean append) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName , append);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedWriter = new BufferedWriter(fileWriter);
        return this;
    }

    public String readFromFile (String name) {
        String str = null;
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public void writeToFile(String name, String text, boolean append){
        try {
            bufferedWriter.write(text);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
