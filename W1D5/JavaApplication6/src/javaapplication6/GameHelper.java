/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;



import java.io.IOException;
import java.util.*;

//import java.io.*;
public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine =null;
        System.out.print(prompt + " ");
        Scanner is = new Scanner(System.in);
        inputLine=is.nextLine();
        if (inputLine.length()==0)    
        
        return null;
    }
catch (IoException e ){
    System.out.println("IOException:"+e);
}
        return inputLine;           

    
    }
        }
}

