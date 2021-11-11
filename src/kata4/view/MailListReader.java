package kata4.view;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    
    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException {
        List<Mail> mails = new ArrayList<Mail>();
        String cadena;
        File file = new File(fileName);
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!= null) {
            if (cadena.contains("@")) {
                mails.add(new Mail(cadena));
            }
        }
        b.close();
        return mails;
    }
}
