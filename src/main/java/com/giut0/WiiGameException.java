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
