package vsvdev.co;
import javax.swing.*;
import java.awt.*;

public class Calculator {

    JPanel windowContent =new JPanel(  );;
    JTextField displayField=new JTextField( 30 );

   JButton button0=new JButton( "0" );
   JButton button1=new JButton( "1" );
   JButton button2=new JButton( "2" );
   JButton button3=new JButton( "3" );
   JButton button4=new JButton( "4" );
  JButton  button5=new JButton( "5" );
   JButton button6=new JButton( "6" );
   JButton button7=new JButton( "7" );
    JButton button8=new JButton( "8" );
    JButton button9=new JButton( "9" );
   JButton buttonPoint=new JButton( "." );
  JButton  buttonEqual=new JButton( "=" );
  JButton  buttonplus=new JButton( "+" );
   JButton buttonminus =new JButton( "-" );
   JButton buttonumnoz =new JButton( "*" );
   JButton buttondelit=new JButton( "/" );
   JButton buttonClear=new JButton( "C" );

    JPanel p1;
    JPanel p2;
    Calculator(){

        BorderLayout b1=new BorderLayout(  );
        windowContent.setLayout( b1 );
        windowContent.add( "North",displayField );


        p1=new JPanel(  );
        GridLayout gl=new GridLayout( 4,3 );
        p1.setLayout( gl );
        p1.add( button0 );
        p1.add( button1 );
        p1.add( button2 );
        p1.add( button3 );
        p1.add( button4 );
        p1.add( button5 );
        p1.add( button6 );
        p1.add( button7 );
        p1.add( button8 );
        p1.add( button9 );
        p1.add( buttonPoint );
        p1.add( buttonEqual );
        windowContent.add( "Center",p1 );
        p2=new JPanel(  );
       GridLayout gl2=new GridLayout( 4,1 );
        p2.setLayout( gl2 );
        p2.add( buttonplus );
        p2.add( buttonminus );
        p2.add( buttonumnoz );
        p2.add( buttondelit );
        windowContent.add( "East",p2 );
        JPanel p3=new JPanel(  );
        GridLayout gl3=new GridLayout( 1,1 );
        p3.setLayout( gl3 );
        p3.add( buttonClear );
        windowContent.add( "West",p3 );
        JFrame frame=new JFrame( "Calculator" );
        frame.setContentPane( windowContent );
        frame.pack();
        frame.setVisible( true );
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CalcEngine calEng=new CalcEngine(this);
        button0.addActionListener( calEng );
        button1.addActionListener( calEng );
        button2.addActionListener( calEng );
        button3.addActionListener( calEng );
        button4.addActionListener( calEng );
        button5.addActionListener( calEng );
        button6.addActionListener( calEng );
        button7.addActionListener( calEng );
        button8.addActionListener( calEng );
        button9.addActionListener( calEng );
        buttonPoint.addActionListener( calEng );
        buttonEqual.addActionListener( calEng );
        buttonplus.addActionListener( calEng );
        buttonminus.addActionListener( calEng );
        buttonumnoz.addActionListener( calEng );
        buttondelit.addActionListener( calEng );
        buttonClear.addActionListener( calEng );

    }
}
