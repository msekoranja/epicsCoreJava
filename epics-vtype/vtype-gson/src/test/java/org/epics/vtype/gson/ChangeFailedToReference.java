/**
 * Copyright information and license terms for this software can be
 * found in the file LICENSE.TXT included with the distribution.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.epics.vtype.gson;

import java.io.File;

/**
 *
 * @author carcassi
 */
public class ChangeFailedToReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("src/test/resources/org/epics/vtype/gson/");
        for (File failed : file.listFiles((File dir, String name) -> name.contains(".failed."))) {
            File reference = new File(failed.getPath().subSequence(0, failed.getPath().indexOf(".failed.")) + ".json");
            if (reference.exists()) {
                reference.delete();
            }
            failed.renameTo(reference);
        }
    }
    
}
