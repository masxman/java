import java.awt.*;
import java.awt.event.*;

public class PersonalDetails {
    public static void main(String[] args) {
        Frame f = new Frame("Button Event");
        Label l = new Label("WELCOME TO MY PAGE");
        l.setFont(new Font("Calibri", Font.BOLD, 16));
        Label fn = new Label();
        Label mn = new Label();
        Label ln = new Label();
        Label r1 = new Label();
        Label a1 = new Label();
        
        l.setBounds(250, 30, 600, 50);
        fn.setBounds(20, 120, 600, 30);
        mn.setBounds(20, 160, 600, 30);
        ln.setBounds(20, 200, 600, 30);
        r1.setBounds(20, 240, 600, 30);
        a1.setBounds(20, 280, 600, 30);
        
        Button mb = new Button("Click here for personal details");
        mb.setBounds(210,70,320,30);
        
        mb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                fn.setText("Name: " + "    " + "Aishwarya");
                mn.setText("Designation : " + "    " + "Professor");
                ln.setText("Age: " + "      " + "42");
                r1.setText("Father Name : " + "    " + "Ram Ganesh");
                a1.setText("Nationality " + "      " + "Indian");
            }
        });
        
        f.add(mb);
        f.add(fn);
        f.add(ln);
        f.add(mn);
        f.add(r1);
        f.add(a1);
        
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);
    }
}
