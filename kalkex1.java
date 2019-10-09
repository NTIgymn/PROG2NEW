import javafx.scene.Scene;

import javax.swing.*;
import java.awt.*;

public class kalkex1 {

        public static void main(String[] args){
            // frame
            JFrame frame = new JFrame();

           // frame.setTitle("Calclayout");
            //panel och dens layout
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4,3));
            //knappar till panel
            addButtons(panel, "7", "8", "9","4","5","6","1","2","3","+","-","=" );

            JTextField tf = new JTextField("tf");
            tf.setEditable(true);

            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.getContentPane().add(tf,BorderLayout.NORTH);


            frame.pack();
            frame.setVisible(true);


        }

        private static void addButtons(Container container,String... string){
            for(String label  : string){
                container.add(new JButton(label));
            }
            }
        }

