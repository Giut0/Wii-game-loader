package com.giut0;

import java.io.File;
import java.nio.file.Files;

/**
 *
 * @author Giut0
 */

public class App {
    public static void main(String[] args) {
            
        /*String file_path = "";
        String folder_path = "";
        String game_name = "";
        String game_code = "";
        
        
        File originaFile = new File(file_path);
        File folder = new File(folder_path + "/" + game_name);
        folder.mkdir();
        File desFile = new File(folder.toPath() + "/" + game_code);

        try {
            Files.copy(originaFile.toPath(), desFile.toPath());
        } catch (Exception e) {
            System.out.println(e);
        }
        */
        
        new MainJFrameWindow().setVisible(true);
        
    }
}
