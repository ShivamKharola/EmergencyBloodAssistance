/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergencybloodassistance;

import javax.swing.InputVerifier;
import javax.swing.*;


public class NameVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
       JTextField jtf=(JTextField) input;
       if(jtf.getText()!=null&&jtf.getText().matches("^[a-zA-Z\\s]*$")&&jtf.getText().length()>0)
           return true;
       else{
           JOptionPane.showMessageDialog(input, "Kindly enter valid name", "Invalid Input", JOptionPane.ERROR_MESSAGE);
           return false;
       }
    }
    
}
