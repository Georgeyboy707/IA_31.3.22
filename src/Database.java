
public class Database {

    private String filename;
    private int rowWidth;
    int recordCount;

    public Database(String filename, int rowWidth) {
        this.filename = filename;
        this.rowWidth = rowWidth;
        recordCount = getRecordCount();
    }

    public void appendRecord(String data) {

        //splits data into parts vis csv

        int desiredLen = 20;
        int currentLen = data.length();



        while (currentLen < desiredLen-1){
            data = data + "x";

            currentLen = data.length();
        }
        data = data + ",";


        FileHandler.appendLine(filename, data);
    }

    public void deleteRecord(int rowNumber) {
    }

    public String getRecord(int rowNumber) {
        //System.out.println(rowNumber + " rowNum = rowWidth " + rowWidth);
        return FileHandler.readLineAt(filename, (rowNumber * rowWidth));
    }

    public int getRecordCount() {
        return FileHandler.countLines(filename)+1;

    }
    public void enter(){
        FileHandler.enter(filename);
    }

    public boolean findRecord(String data) {
        // search for a record matching data
        // return true if found
        return false;
    }

}



