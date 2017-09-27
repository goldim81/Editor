package com.goldim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str;
        String[] carr;
        String command = null;
        String fileName;
        String text = null;
        Editor editor = new Editor();
        do {
            str = in.nextLine();
            carr = str.split(" ");
            command = carr[0];
            if (!command.equals("quit")) {
                fileName = carr[1].replaceAll("\"", "");
                text = null;
                if (!command.equals("read")) {
                    text = carr[2].replaceAll("\"", "");
                }

                switch (command) {
                    case "read":
                        editor.readFromFile(fileName);
                        break;
                    case "write":
                        editor.writeToFile(fileName, text, false);
                        break;
                    case "append":
                        editor.writeToFile(fileName, text, true);
                        break;
                }
            }
        } while (!command.equals("quit"));
        in.close();

    }


}