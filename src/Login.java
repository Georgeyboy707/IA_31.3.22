public class Login {
    public static void login(){




    }

    public String authenticate(String username, String password){
        Database myDatabase = new Database("D:\\Zjunk\\UsernamePassword", 42);

        String[] userPasswords = new String[myDatabase.getRecordCount()];
        String[] userUsernames = new String[myDatabase.getRecordCount()];
        String[] line = new String[myDatabase.getRecordCount()];

        //reads the line and places it into line[]
        for (int i = 0; i < myDatabase.getRecordCount(); i++) {
            line[i] = myDatabase.getRecord(i).replaceAll("x", "");
        }
        //separates line[] into a tempVar, which can then be given to username and password
        for (int i = 0; i < line.length; i++){
            String[] tempVar = {"-1", "-2"};
            tempVar = line[i].split(",");

            userUsernames[i] = tempVar[0];
            userPasswords[i] = tempVar[1];
        }

        //checks if the entered username matches one in storage
        for (int i = 0; i < myDatabase.getRecordCount(); i++){
            if (username.equals(userUsernames[i]) && password.equals(userPasswords[i])) {
                return username;
            }
        }
        return "-1";

    }

    public void createAccount(String username, String password){
        Database myDatabase = new Database("D:\\Zjunk\\UsernamePassword", 10);

        System.out.println("Please enter your Username:");
        myDatabase.appendRecord(username);

        System.out.println("Please enter Password:");
        myDatabase.appendRecord(password);

        myDatabase.enter();
    }
}
