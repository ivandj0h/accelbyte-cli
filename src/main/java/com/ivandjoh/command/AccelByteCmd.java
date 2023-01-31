package com.ivandjoh.command;

import java.util.concurrent.Callable;

import com.ivandjoh.libs.CopyFile;
import com.ivandjoh.nodes.TreeNode;
import picocli.CommandLine;

@CommandLine.Command(
        name = "accelByte",
        description = "AccelByte CLI",
        mixinStandardHelpOptions = true,
        version = "1.0"
)
public class AccelByteCmd implements Callable<String> {

    // this command use to show files inside folder
    @CommandLine.Option(names = "--show-tree", description = "show files inside folder")
    private String showFiles;

    @CommandLine.Option(names = "sync", description = "Sync files from  to destination folder")
    private boolean isSync;

    @CommandLine.Option(names = "-s", description = "Source folder")
    private String sourceFolder;

    @CommandLine.Option(names = "-d", description = "Destination folder")
    private String destinationFolder;

    @Override
    public String call() throws Exception {
        if (showFiles != null) {
           TreeNode.main(new String[] {showFiles});
       }
        else if(!isSync || sourceFolder == null || destinationFolder == null) {
            System.out.println("Source and destination folder must be specified");
            System.exit(0);
        } else {
            CopyFile.exeCopy(sourceFolder, destinationFolder);
        }

        return "Success";
    }

    public static void executeAccelByteCmd(String[] args) {
        int exitCode = new CommandLine(new AccelByteCmd()).execute(args);
        System.exit(exitCode);
    }
}
