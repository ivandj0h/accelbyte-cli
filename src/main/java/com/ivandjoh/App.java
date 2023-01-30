package com.ivandjoh;

import com.ivandjoh.nodes.TreeNode;
import picocli.CommandLine;

import java.util.concurrent.Callable;


@CommandLine.Command(name = "accelByte", description = "AccelByte CLI", mixinStandardHelpOptions = true, version = "1.0")
public class App implements Callable<String> {

    @CommandLine.Option(names = "-sf", description = "show files")
    private String showFiles;

    @CommandLine.Option(names = "-s", description = "Source folder")
    private String sourceFolder;

    @CommandLine.Option(names = "-d", description = "Destination folder")
    private String destinationFolder;

    public static void main(String[] args) throws Exception {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public String call() throws Exception {
       if (showFiles != null) {
           TreeNode.main(new String[] {showFiles});
       }
//        if (sourceFolder == null || destinationFolder == null) {
//            System.out.println("Source and destination folder must be specified");
//            System.exit(1);
//        }
//        System.out.println("Source folder: " + sourceFolder);
//        System.out.println("Destination folder: " + destinationFolder);
        return "Success";
    }
}
