package com.ivandjoh.libs;

import java.io.*;

public class CopyFile {

    public static void exeCopy(String source, String destination) {

        File sourceFolder = new File(source);
        File destinationFolder = new File(destination);

        if (sourceFolder.isDirectory()) {
            if (!destinationFolder.exists()) {
                destinationFolder.mkdirs();
                System.out.println("Directory copied from " + source + "  to " + destination);
            }
            String[] files = sourceFolder.list();
            assert files != null;
            for (String file : files) {
                String srcFile = new File(sourceFolder, file).getPath();
                File destFile = new File(destinationFolder, file);
                exeCopy(srcFile, String.valueOf(destFile));
            }
        } else {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = new FileInputStream(sourceFolder);
                out = new FileOutputStream(destinationFolder);

                byte[] buffer = new byte[1024];

                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
            } catch (Exception e) {
               try {
                   assert in != null;
                   in.close();
               } catch (IOException ex) {
                  ex.printStackTrace();
               }
               try{
                   assert out != null;
                   out.close();
               } catch (IOException ej) {
                   ej.printStackTrace();
               }
            }
        }
    }
}
