package javaapplication6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FIKRE ADERA
 */

//1a.
import java.util.*;
public class GuessGameOnePlayer {
    public static void main(String[] args){
        Player p1= new Player();
        int targetNumber= (int)(Math.random()*10);
        System.out.println("Guess the number between 0 and 9 ");
        boolean p1isRight = false;
        while(true){
            int num = p1.guess();
            if (targetNumber==num){
                p1isRight=true;
            }
            if (p1isRight==true){
                System.out.println("you win the game");
                System.out.println("Number to guess was "+ targetNumber);
                break;
            }
            else {
                System.out.println("Please try again ");
            }
        }
    }
}
 
    

