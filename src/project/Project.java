/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ahadj
 */

  
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Exception;
import java.util.ArrayList;
public class Project {
    

  
    public static void main(String[] args) {
        
        Admin [] admins = new Admin[2];
        
        Admin adm0 = new Admin();
        
       
       adm0.setusername("shahad");
       adm0.setId(123456);
       adm0.setphone(996543332);
       adm0.setpassword(222333); 
        admins[0]= adm0;
       
       
       Admin adm1 = new Admin();
       
       adm1.setusername("sadeam"); 
       adm1.setId(1234567);
       adm1.setphone(996543332);
       adm1.setpassword(345678);
        admins[1]= adm1;
      
        
          // System.out.println("admin 2: " + adm1.getusername() +"\n"+ adm1.getId() + "\n" + adm1.getpassword()+"\n" + adm1.getphone());
          for(int i=0; i<admins.length; i++) {
          // System.out.println("admins[" +i+ "] = " +admins[i]);
          // System.out.println("admins[" +i+ "] = " + Arrays.toString(admins));
         System.out.println( Arrays.toString(admins));
        }
       
    
        User [] users = new User[2];
        
        User u0 = new User();
        
        u0.setusername("ream");
        u0.setId(22222222);
        u0.setSalary(20000);
        u0.setpassword(23453);
        
        User u1 = new User(); 
        u1.setusername("albandary");
        u1.setpassword(234567);
        u1.setId(11233333);
        u1.setSalary(300000);
        
        
          for(int i=0; i<users.length; i++) {
            System.out.println("users[" +i+ "] = " +users[i]);
        }

        
     
        
      
    }
  
}