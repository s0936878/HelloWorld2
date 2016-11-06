package HelloWorld2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloWorld2 extends JFrame{
	
	//creates the GUI aspect
	 JPanel panel = new JPanel();
     JLabel label = new JLabel();
     JTextField text = new JTextField(30);
     JButton button = new JButton("Enter");
	 private String input;
     
     /**
      * calls the arguments into the program
      * @param args
      */
	  public static void main(String[] args){	
  		//error checks to make sure command line input has something there, if not quits the program
  			int length = args.length;
  			
  			if (length <= 0){
  		         System.out.println("Please look over command line arguments. There was an error.");
  		      }
  			else{
  				//test to make sure the program was running correctly. shows up in console while also popping the screen up
  				System.out.println("Hello World and " + args[0]);
  				HelloWorld2 helloWorld = new HelloWorld2(args[0]); 	
  			}		
  		
	  }
	

	 //general constructor
	 //by passing args through the constructor it reports back the name in the title of the program screen
       public HelloWorld2(String args){
    	      this.input = args; 
              setTitle("Enter Your Name again, " + args);
              setVisible(true);
              setSize(400, 200);
              setDefaultCloseOperation(EXIT_ON_CLOSE);

              panel.add(text);

    //if user hits the enter key instead of the enter button
              text.addActionListener(new ActionListener(){
            	  
                     public void actionPerformed(ActionEvent e){
                           input = text.getText();
                           label.setText("Hello World and "+ input); 
                     }
              });
    //for when user click the enter button on screen
              panel.add(button);
              button.addActionListener(new ActionListener(){
            	  
                      public void actionPerformed(ActionEvent e){
                             input = text.getText();
                             label.setText("Hello World and "+input);
                      }
              });
              
              panel.add(label);
              add(panel);
       }
}