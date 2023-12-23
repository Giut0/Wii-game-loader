/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giut0;

/**
 *
 * @author giuto
 */
public class WiiGameException {
    
    public static void checkEmptyFields(String... fields) throws Exception {
        for (String field : fields) {
            if (field == null || field.trim().isEmpty()) {
                throw new Exception(">> Error: Empty field");
            }
        }
    }
    
    
    
}
