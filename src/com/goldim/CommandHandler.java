package com.goldim;

public class CommandHandler {
    
    public void commandExec(String commandLine){
        String[] carr = commandLine.split(" ");
        String command = carr[0];
        if (!command.equals("quit")) {
            String fileName = carr[1].replaceAll("\"", "");
            String text = null;
            if (!command.equals("read")) {
                text = carr[2].replaceAll("\"", "");
            }
            Editor editor = new Editor();
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

    }
}
