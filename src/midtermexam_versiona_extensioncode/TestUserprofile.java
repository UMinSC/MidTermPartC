/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author umin
 */
public class TestUserprofile {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Create a new profile:\n");
         
         
         System.out.print("Name:");
         String userID = input.next();
         
         System.out.print("Choose your favourite Genre:\n");
         int userGenreIndex = input.nextInt();
         
         //create a new user profile
         //UserProfile newUser = new UserProfile(userID, UserProfile.genres[userGenreIndex - 1]);
         UserProfile newUser = new UserProfile(userID, "Comedy");
         
         
         System.out.println("Your userProfile is created successfully!\n");
     }
    
     
}
