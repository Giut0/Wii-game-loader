package com.giut0;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author Giut0
 */
public class Main {

    public static boolean transferFile(String gamePath, String dirPath, String gameName, String gameCode, JTextArea jTextArea1) {
        
        boolean response = false;

        WiiGame wiiGame = new WiiGame(gameCode, gameName + " [" + gameCode.toUpperCase() + "]", gamePath);
        

        File gameFile = new File(gamePath.toString());

        File wbfsDir = new File(dirPath.toString() + "wbfs");

        if (!wbfsDir.exists()) {
            wbfsDir.mkdir();
        }

        File gameDir = new File(wbfsDir.toPath().toString() + "/" + wiiGame.getGameName() + "/");

        if (!gameDir.exists()) {
            gameDir.mkdir();
        }

        File finalGameFile = new File(gameDir.toString() + "/" + wiiGame.getGameCode() + ".wbfs");

        try {
            Path copy = Files.copy(gameFile.toPath(), finalGameFile.toPath());
            response = true;
            
        } catch (Exception e) {
            response = false;
            jTextArea1.append(">> Error: File already exists \n");
            System.out.println(e);

        }

        return response;
    }

    public static void main(String[] args) {

        new MainJFrameWindow().setVisible(true);

    }
}
