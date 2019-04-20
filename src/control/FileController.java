package control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileController {
    public static File file;
    public static FileWriter fileWriter;

    public static boolean salvarArquivo(String texto){
        try{
            file = new File("./files/saida.html");
            fileWriter = new FileWriter(file);
            fileWriter.write(texto);
            fileWriter.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
