import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Latihan4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        public void run(){
            JFrame frame = new JFrame("Jendela Pertamaku");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.setLayout(new BorderLayout());
            
            JLabel label=new JLabel("label ada diatas (NORTH)");
            JButton button=new JButton("tombol dibawah (SOUTH)");
            
            button.addActionListener(e ->{
            label.setText("Tombol di SOUTH di KLIK!");
            });
            
            frame.add(label, BorderLayout.NORTH);
            frame.add(button, BorderLayout.SOUTH);
            frame.add(new JButton("west"), BorderLayout.WEST);
            frame.add(new JButton("east"), BorderLayout.EAST);
            frame.add(new JButton("CENTER"), BorderLayout.CENTER);
            
            
            
            frame.setVisible(true);
            
            
            
        }
        });
    }
}
