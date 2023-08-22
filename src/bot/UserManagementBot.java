package bot;


import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import tools.*;

/**
 * This bot is to manage the registration of the user with the command '/registration'.
 * The user will be asked to provide a registration code. If the registration code is 
 * correct, the user will be registered to the system.
 * 
 * The user cannot register again if the user has already registered (One discord ID 
 * to one student ID).
 * 
 * We assume the registration code will be sent to students via email in advanced. 
 * The registration information is given in a file (please check users.csv)
 * 
 * The file format of users.csv is as follows:
 * Each row may have three columns or five columns.
 * Three Columns, e.g.:
 *      20100001,g8xa9s,Bruce Lee
 * That represents the student ID is 20100001, the registration code is g8xa9s, and the name is Bruce Lee.
 * Five Columns, e.g.:
 *      20100002,-,Chan Tai Man,1004553330619580487,Kevin Wang
 * That represents the student ID is 20100002, the registration code is empty (registered already),
 * the student name is Chan Tai Man, the discord ID is 1004553330619580487, and the discord name is Kevin Wang.
 */
public class UserManagementBot extends CommandBot {
    //Add your data member here

    //Constructor
    public UserManagementBot(String filename) {
        //TODO
    }


    /**
     * Written for you. No need to change it
     */
    @Override
    public String getCommand() {
        return "registration";
    }

    /**
     * Written for you. No need to change it
     */
    @Override
    public String getCommandHelp() {
        return "Registers the user";
    }


    /**
     * to check if a user has been registered
     */
    boolean isRegistered(String id) {
        //TODO
    }


    /**
     * To respond to the command '/registration'.
     * 
     * If the user has already registered, return "You are already registered!"
     * If the registration code is correct, register the user and return "You are registered!". 
     * If the registration code is incorrect, return "Invalid registration code!"
     * 
     * To avoid data lost, remember to save the data to the file after each user's registration.
     */
    @Override
    public String respond(Command command) {
        //TODO
    }

    /**
     * return the student ID of the user with the given discord ID
     * 
     * throws an IDNotFoundException if the discord ID cannot be found
     */
    public String getStudentID(String id) throws IDNotFoundException {
        //TODO
    }
    
    /**
     * return the user object with the given discord ID
     * 
     * throws an IDNotFoundException if the discord ID cannot be found
     */
    public User getStudent(String id) throws IDNotFoundException {
        //TODO
    }


    /**
     * Output how many number of users have registered.
     */
    @Override
    public void actionPerform() {
    }
}
