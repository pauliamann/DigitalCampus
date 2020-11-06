package at.dcv.w08.interfaceInnerClassAbstract;

public class SpeiseReader implements ICSVProcessor{

    SpeiseReader() {

    }

    @Override
    public boolean isLineValid(int columnCount) {
        if (columnCount == 3) return true;
        return false;
    }

    @Override
    public void process(String[] columns) {

        System.out.println(("Name: " + columns[0]));
        System.out.println(("Preis: " + columns[1]));
        System.out.println(("Kosten: " + columns[2]));

    }

    public static void main(String[] args) {
        SpeiseReader sr = new SpeiseReader();
        CSVReader csv = new CSVReader(sr);
        csv.readCSV("C:\\Users\\DCV\\Desktop\\Restaurant\\speise.csv", ",");
        System.out.println();
    }
}
