package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    String fileName;
    HistogramDisplay histo;
    List<Mail> mailList;
    Histogram<String> histogram;
    
    public static void main(String[] args) throws IOException{
        (new Kata4()).execute();
    }
    
    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
    private void input() {
        fileName = "C:\\Users\\Entrar\\Documents\\NetBeansProjects\\Kata4\\email.txt";
    }
    
    private void process() throws IOException {
        mailList = (new MailListReader()).read(fileName);
        histogram = (new MailHistogramBuilder()).build(mailList);
    }
    
    private void output() {
        histo = new HistogramDisplay("HISTOGRAMA", histogram);
        histo.execute();
    }
}
