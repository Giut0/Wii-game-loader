package com.giut0;

import java.io.File;
import java.nio.file.Files;

/**
 * This program handles the transfer of Wii game files to a WBFS directory.
 * Author: Giut0
 */

public class Main {

    // Method to transfer a Wii game file to a specified directory in WBFS format
    public static boolean transferFile(String gamePath, String dirPath, String gameName, String gameCode) throws Exception {

        boolean response = false;

        // Creating a WiiGame object with game details
        WiiGame wiiGame = new WiiGame(gameCode, gameName + " [" + gameCode.toUpperCase() + "]", gamePath);

        // Creating File objects for game file and WBFS directory
        File gameFile = new File(gamePath.toString());
        File wbfsDir = new File(dirPath.toString() + "wbfs");

        // Creating the WBFS directory if it doesn't exist
        if (!wbfsDir.exists()) {
            wbfsDir.mkdir();
        }

        // Creating a directory for the specific game within the WBFS directory
        File gameDir = new File(wbfsDir.toPath().toString() + File.separator + wiiGame.getGameName() + File.separator);
        if (!gameDir.exists()) {
            gameDir.mkdir();
        }

        // Creating the final game file in the WBFS directory
        File finalGameFile = new File(gameDir.toString() + File.separator + wiiGame.getGameCode() + ".wbfs");

        // Copying the game file to the final destination
        Files.copy(gameFile.toPath(), finalGameFile.toPath());
        response = true; // Setting response to true upon successful transfer

        return response; // Returning the transfer status
    }

    public static void main(String[] args) {
        // Opening the main JFrame window
        new MainJFrameWindow().setVisible(true);
    }
}