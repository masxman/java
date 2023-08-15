import java.awt.*;
import java.awt.event.*;

public class PersonalDetails {
    public static void main(String[] args) {
        Frame f = new Frame("Button Event");

        // Creating labels to display parent details
        Label fn = new Label();
        Label mn = new Label();
        Label ln = new Label();
        Label r1 = new Label();
        Label a1 = new Label();

        // Creating "Mother" button
        Button mb = new Button("Click here for Mother's details");
        mb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fn.setText("Name: " + "    " + "Aishwarya");
                mn.setText("Designation: " + "    " + "Professor");
                ln.setText("Age: " + "      " + "42");
                r1.setText("Father Name: " + "    " + "Ram Ganesh");
                a1.setText("Nationality: " + "      " + "Indian");
            }
        });

        // Creating "Father" button
        Button fb = new Button("Click here for Father's details");
        fb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fn.setText("Name: " + "    " + "Ram");
                mn.setText("Designation: " + "    " + "Manager");
                ln.setText("Age: " + "      " + "44");
                r1.setText("Father Name: " + "    " + "Ram Ganesh");
                a1.setText("Nationality: " + "      " + "Indian");
            }
        });

        // Adding components to the frame
        f.add(mb);
        f.add(fb);
        f.add(fn);
        f.add(ln);
        f.add(mn);
        f.add(r1);
        f.add(a1);

        // Setting frame properties
        f.setSize(800, 400);
        f.setLayout(new GridLayout(3, 2));
        f.setVisible(true);
    }
}
