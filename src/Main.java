import BasicInformation.Dao;
import BasicInformation.ID_Password;
import BasicInformation.Information;
import LoginScreen.UserFrame;
//import LoginScreen.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserFrame frame = new UserFrame();
        frame.setVisible(true);
        Dao dao=new Dao();
        Information information=new Information();
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String gender=sc.nextLine();
        information.setName(name);
        information.setSex();
        final int value=dao.registerUser(new ID_Password());
    }
}
