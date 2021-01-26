/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudswing;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class Result {
    public static void main(String[] args) {
       Query Q = new Query();
    }
    
}


 class Query extends JFrame{
     public Query(){
         JLabel dummyText = new JLabel("This is where output has to be shown");
         add(dummyText);
         setLayout(new FlowLayout());
         setSize(500, 500);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
 }