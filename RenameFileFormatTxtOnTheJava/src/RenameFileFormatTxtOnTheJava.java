import java.io.File;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RenameFileFormatTxtOnTheJava {
    private List<File> files;
    private static final String ENDFILE = ".java";


    public RenameFileFormatTxtOnTheJava() {
        this.files = new ArrayList<>();
    }

    public void start(){
        System.out.println("Введите полный путь к папке");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        scanner.close();
        ScannerFile(file);
        files.forEach(File -> RenameFormatFile(File));
    }

    public void scannerFile(File dir){
            File[] listFiles = dir.listFiles();
            for (File file : listFiles){
               if(file.isDirectory()){
                scannerFile(file);
               }else {
                   files.add(file);
               }
            }
    }

    public void renameFormatFile(File file){
        String nameFile = file.getName();
        Path path = file.toPath().getParent();
        String [] text = nameFile.split("\\.");
        file.renameTo(new File(path + "\\" + text[0] + ENDFILE));
    }
}
