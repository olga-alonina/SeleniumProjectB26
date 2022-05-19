package com.NextBaseCRM.utilities;

import java.util.ArrayList;

public class Login_Credentials {

    public static void main(String[] args) {

        //1.ArrayList for Correct usernames
        ArrayList<String> cor_UsernameList = new ArrayList<>();

            cor_UsernameList.add("helpdesk29@cybertekschool.com");
            cor_UsernameList.add("helpdesk30@cybertekschool.com");

            cor_UsernameList.add("marketing29@cybertekschool.com");
            cor_UsernameList.add("marketing30@cybertekschool.com");

            cor_UsernameList.add("hr29@cybertekschool.com");
            cor_UsernameList.add("hr30@cybertekschool.com");

        ArrayList<String> correctUsernameList = new ArrayList<>(cor_UsernameList);

        //2. ArrayList for Correct passwords
        ArrayList<String> cor_PasswordList = new ArrayList<>();

            cor_PasswordList.add("UserUser");

        ArrayList<String> correctPasswordList = new ArrayList<>(cor_PasswordList);


        //3. ArrayList for Wrong usernames
        ArrayList<String> wrongUsernameList = new ArrayList<>();

            wrongUsernameList.add("wrong29@cybertekschool.com");
            wrongUsernameList.add("wrong30@cybertekschool.com");

        //4. ArrayList for Wrong passwords
        ArrayList<String> wrongPasswordList = new ArrayList<>();

            wrongPasswordList.add("WrongWrong");
            wrongPasswordList.add("WrongUser");

    }

    /** 1. ArrayList with Correct usernames */
    public static ArrayList useCorrectUsernames (){
        //1.
        ArrayList<String> cor_UsernameList = new ArrayList<>();
            //2.
            cor_UsernameList.add("helpdesk29@cybertekschool.com");
            cor_UsernameList.add("helpdesk30@cybertekschool.com");

            cor_UsernameList.add("marketing29@cybertekschool.com");
            cor_UsernameList.add("marketing30@cybertekschool.com");

            cor_UsernameList.add("hr29@cybertekschool.com");
            cor_UsernameList.add("hr30@cybertekschool.com");
        //3.
        ArrayList<String> correctUsernameList = new ArrayList<>(cor_UsernameList);
        //4.
        return correctUsernameList;
    }

    /** 2. ArrayList with Correct passwords */
    public static ArrayList correctPasswords () {
        //1.
        ArrayList<String> cor_Passwords = new ArrayList<>();
            //2.
            cor_Passwords.add("UserUser");
        //3.
        ArrayList<String> correctPasswordList = new ArrayList<>(cor_Passwords);
        //4.
        return  correctPasswordList;
    }


}
