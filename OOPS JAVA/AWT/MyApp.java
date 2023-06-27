import java.awt.*;
class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;
    public MyFrame(){
        super("My App");

        setLayout(new FlowLayout());

        l= new Label("Name");
        tf=new TextField(20);
        b= new Button("OK");

        add(l);
        add(tf);
        add(b);
    }
}

public class MyApp{
    public static void  main(String args[]){
        MyFrame f =new MyFrame();
        f.setSize(200,200);
        f.setVisible(true);
    }
}
