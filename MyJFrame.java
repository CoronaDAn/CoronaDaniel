import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame {
    private JLabel myLabel;

    public MyJFrame() {
       
        myLabel = new JLabel("Hola Mundo");
        
        this.add(myLabel);
        
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}
