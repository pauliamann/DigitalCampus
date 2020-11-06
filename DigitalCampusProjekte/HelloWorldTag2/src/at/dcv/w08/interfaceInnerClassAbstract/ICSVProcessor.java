package at.dcv.w08.interfaceInnerClassAbstract;

public interface ICSVProcessor {

    public boolean isLineValid(int columnCount);

    public void process(String[] columns);


}
