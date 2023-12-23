package com.giut0;

import java.io.File;

/**
 *
 * @author Giut0
 */

public class WiiGame {

    private String gameCode;
    private String gameName;
    private String gamePath;

    public WiiGame(String gameCode, String gameName, String gamePath) {
        this.gameCode = gameCode;
        this.gameName = gameName;
        this.gamePath = gamePath;
    }

    public WiiGame() {
        this.gameCode = "";
        this.gameName = "";
        this.gamePath = "";
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGamePath(String gamePath) {
        this.gamePath = gamePath;
    }

    public String getGameCode() {
        return gameCode;
    }

    public String getGameName() {
        return gameName;
    }

    public String getGamePath() {
        return gamePath;
    }

}
