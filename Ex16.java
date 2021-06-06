/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;

public class Ex16
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int age;
        System.out.print("What is your age?");
        age = kb.nextInt();
        while(age < 0){
            System.out.print("Enter a valid age. What is your age?");
            age = kb.nextInt();
        }
        if(age < 16)
        {
            System.out.print("You are not old enough to legally drive.");

        }
        else{
            System.out.print("You are old enough to legally drive.");
        }

    }

}