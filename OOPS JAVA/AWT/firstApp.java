//package firstapp;
import java.awt.*;


public class firstApp {
    public static void main(String args[]){
        Frame f = new Frame("My First App");
        f.setLayout(new FlowLayout());

        Label l=new Label("Name");
        TextField tf=new TextField(20);
        Button b= new Button("Sumit");
        f.add(l);
        f.add(tf);  
        f.add(b);
        
        // b.setVisible(true);
        // b.setSize(100,100);



        f.setSize(500, 500);
        f.setVisible(true);
    }
}
