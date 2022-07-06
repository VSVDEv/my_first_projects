package com.company;

import javax.swing.*;
import java.awt.*;

public class Converter {
    JPanel windowContent =new JPanel(  );;
    JTextField displayField=new JTextField( 30 );
    JButton buttonCurrent=new JButton( "I, A" );
    JButton buttonClear=new JButton( "C" );
    JButton buttonALCable= new JButton( "AL cable, mm2" );
    JButton buttonCUCable=new JButton( "Cu cable, mm2" );
    JButton buttonaction=new JButton( "Developed  by Voronkov Serhii" );


   Converter() {
       BorderLayout b1 = new BorderLayout();
       windowContent.setLayout( b1 );
       windowContent.add( "North", displayField );
       JPanel p1=new JPanel(  );
       GridLayout gl=new GridLayout( 4,1 );
       p1.setLayout( gl );
       p1.add( buttonCurrent );
       p1.add( buttonClear );
       p1.add( buttonALCable );
       p1.add( buttonCUCable );
       p1.add( buttonaction );
       windowContent.add( "Center",p1 );
       JFrame frame=new JFrame( "Power for chose cable" );
       frame.setContentPane( windowContent );
       frame.pack();
       frame.setVisible( true );
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       EngineConv encon=new EngineConv(this);
       buttonCurrent.addActionListener( encon );
       buttonClear.addActionListener( encon );
       buttonALCable.addActionListener( encon );
       buttonCUCable.addActionListener( encon );
       buttonaction.addActionListener( encon );
   }
}
