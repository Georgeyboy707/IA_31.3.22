

class Main {
    public static void main(String[] args) {
        // test the database works (make sure test.txt exists)
        System.out.println(" ========== Database ==========");
        Database myDatabase = new Database("D:\\Zjunk\\UsernamePassword", 10);
        //System.out.println(myDatabase.getRecordCount());

        String[] userData = new String[myDatabase.getRecordCount()];
        Login myLogin = new Login();

        //creates a new account, adds to file
        //myLogin.createAccount("George", "Password");

        //checks if an entered user password combination is in the file
        if ((myLogin.authenticate("George", "Password").equals("-1"))){
            System.out.println("Invalid Login Details");
        } else {
            //opens the user's database of tasks
            String a = myLogin.authenticate("George", "Password");
            Display myDisplay = new Display(a);
            myDisplay.printDatabase();

        }


    }

}

