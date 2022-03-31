public class Display {
String filename;
    public Display(String username) {
        filename = "D:\\Zjunk\\"+username+"Database";

    }

    public void printDatabase(){
        Database myDatabase = new Database((filename), 42);
        System.out.println(myDatabase.getRecordCount());
        //reads the line and places it into line[]
        String[] line = new String[myDatabase.getRecordCount()];
        for (int i = 0; i < myDatabase.getRecordCount(); i++) {
            System.out.println(i);
            line[i] = myDatabase.getRecord(i).replaceAll("x", "");
            System.out.println(line[i]);
        }

    }
}