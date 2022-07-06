package vsvdev.co;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcEngine implements ActionListener {
    Calculator parent;
    char selectedAction = ' ';
    double currentResult = 0;

    CalcEngine(Calculator parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String dispFieldText = parent.displayField.getText();

        JTextField displayField = null;
        JButton clickedButton = null;
        Object eventSource = e.getSource();
        if (eventSource instanceof JButton) {
            clickedButton = (JButton) eventSource;
        } else if (eventSource instanceof JTextField) {
            displayField = (JTextField) eventSource;
        }
        String clickedButtonLabel = clickedButton.getText();
        parent.displayField.setText(dispFieldText + clickedButtonLabel);


        double displayValue = 0;
        if (!" ".equals(dispFieldText)) {
            try {
                displayValue = Double.parseDouble(dispFieldText);
            } catch (NumberFormatException ex) {
            }

        }
        Object src = e.getSource();
        if (src == parent.buttonClear) {

            displayValue = 0;
            parent.displayField.setText("");
        } else if (src == parent.buttonplus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonminus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttondelit) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonumnoz) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonEqual) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            }
            if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            }
            if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            }
        }


    }
}
