
import javax.swing.JFrame;
/**
 * issa vpn.
 *
 * @author karltrowbridge
 * @version 9/21/18
 */
public class EHPViewer
{
    public void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(600,700);
        frame.setTitle("Easy Homework Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EHPComponent component = new EHPComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
