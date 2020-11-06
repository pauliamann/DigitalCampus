package at.dcv.w08.interfaceInnerClassAbstract;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    private ICSVProcessor processor;

    public CSVReader(ICSVProcessor processor) {
        this.processor = processor;
    }

    public void readCSV(String fileName, String separator) {
        BufferedReader br = null;
        int idxLine = 0;
        try {
            br = new BufferedReader(new FileReader(fileName));
            if (br != null) {
                while (br.ready()) {
                    String line = br.readLine();

                    if (idxLine > 0) {
                        String[] spalte = line.split(separator);
                        if (processor.isLineValid(spalte.length)) {
                            processor.process(spalte);
                        } else {
                            System.out.println("Zeile konnte nicht gelesen werden: \n" + line);
                        }
                    }
                    ++idxLine;
                }
                br.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
