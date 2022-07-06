package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EngineConv implements ActionListener {
   Converter parent;

   double currentResult=0;
EngineConv(Converter parent){this.parent=parent;}

    @Override
    public void actionPerformed(ActionEvent e) {
        String dispFieldText=parent.displayField.getText();

        JTextField displayField=null;

        Object eventSource=e.getSource();






        double displayValue=0;
        if(!" ".equals( dispFieldText )){
            displayValue=Double.parseDouble( dispFieldText );
        }
        Object src=e.getSource();
        if(src ==parent.buttonClear){

            displayValue=0;
            parent.displayField.setText("" );}

        else if(src ==parent.buttonCurrent){

            currentResult=displayValue;
            double c=220;
            currentResult = displayValue/c;
            parent.displayField.setText( "" + currentResult  );}
        else if(src ==parent.buttonALCable){

               double y=displayValue;
               double b=0;
                if (y < 20) {
                    b = 2.5;
                } else if (y < 28) {
                    b = 4;
                } else if (y < 36) {
                    b = 6;
                } else if (y < 50) {
                    b = 10;
                } else if (y < 60) {
                    b = 16;
                } else if (y < 85) {
                    b = 25;
                } else if (y < 100) {
                    b = 35;
                }
                currentResult=b;
                parent.displayField.setText( "" + currentResult );
            }
        else if(src ==parent.buttonCUCable){
           double x=displayValue;
           double d=0;

            if (x < 19) {
                d = 1.5;
            } else if (x < 27) {
                d = 2.5;
            } else if (x < 38) {
                d = 4;
            } else if (x < 46) {
                d = 6;
            } else if (x < 70) {
                d = 10;
            } else if (x < 85) {
                d = 16;
            } else if (x < 115) {
                d = 25;
            }
            currentResult=d;
            parent.displayField.setText( "" + currentResult );
        }

    }
}
