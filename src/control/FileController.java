package control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Parser.Formatter;

public class FileController {
    public static File file;
    public static FileWriter fileWriter;
    public static Formatter formatter;

    public static boolean salvarArquivo(String texto){
        String pathname = "./files/saida.html";
        try{
            file = new File(pathname);
            formatter = new Formatter();
            fileWriter = new FileWriter(file);
            fileWriter.write(texto);
            fileWriter.close();
            formatter.format(pathname);

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
