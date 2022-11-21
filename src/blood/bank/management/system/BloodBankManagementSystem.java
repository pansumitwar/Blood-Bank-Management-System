/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.bank.management.system;

import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Sumitbhaiji
 */
public class BloodBankManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new login().setVisible(true);
    }
    
}
