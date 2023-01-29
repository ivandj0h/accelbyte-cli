package com.ivandjoh.accelbyte.dir;

import java.io.File;
import java.util.Objects;

/**
 * @author Ivan
 * @since 2020-01-30
 * @version 1.0
 *
 * Print the directory tree and its file names.
 *
 */
public class FileAssert {

    public static void printDirectoryTree(File folder) {
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        int indent = 0;
        StringBuilder sb = new StringBuilder();
        printDirectoryTree(folder, indent, sb);
    }

    private static void printDirectoryTree(
            File folder,
            int indent,
            StringBuilder sb
    ) {
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(folder.getName());
        sb.append("/");
        sb.append("\n");
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.isDirectory()) {
                printDirectoryTree(file, indent + 1, sb);
            } else {
                printFile(file, indent + 1, sb);
            }
        }
    }

    private static void printFile(File file, int indent, StringBuilder sb) {
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(file.getName());
        sb.append("\n");
    }

    private static String getIndentString(int indent) {
        return "|  ".repeat(Math.max(0, indent));
    }
}
