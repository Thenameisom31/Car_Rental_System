package Controller;

import java.util.Scanner;

import Model.Database;
import Model.Operation;
import Model.User;
import javax.swing.JFrame;

public class Quit implements Operation {

	public void operation(Database database, Scanner s, User user) {

            try (s) {
                System.out.println("Thanks for visiting us!");
            }
		
	}

    @Override
    public void operation(Database database, JFrame f, User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
