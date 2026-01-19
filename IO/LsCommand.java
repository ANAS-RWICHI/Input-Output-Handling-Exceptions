package TP5.IO;
import  java.io.File;
public class LsCommand {
    public static void main(String[] args) {
        File dir = new File("E:/Old/Projects/ETL Pipelines");
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Wrong path directory");
            return;
        }
        String[] items = dir.list();

        if (items == null) {
            System.out.println("Cannot access directory");
            return;
        }

        for (String name : items) {
            File f = new File(dir, name);
            String type = f.isDirectory() ? "<DIR>" : "<FILE>";
            String permissions = "";

            permissions += f.canRead() ? "r" : "-";
            permissions += f.canWrite() ? "w" : "-";
            permissions += f.isHidden() ? "h" : "-";

            System.out.println(f.getPath() + " " + type + " " + permissions);
        }
    }
}

