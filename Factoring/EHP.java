
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
/**
 * issa vpn.
 *
 * @author karltrowbridge
 * @version 9/21/18
 */
public class EHP
{
    private int numOfClasses;
    ArrayList classList = new ArrayList();
    public EHP()
    {
        // number of classes
        Scanner s = new Scanner(System.in);
        System.out.println("How many classes do you have: ");
        this.numOfClasses = s.nextInt();
        
        // class names
        
        String className;
        System.out.println("Input class name: ");
        for(int x=1;x<=this.numOfClasses; x++)
        {
            
            className = s.nextLine();
            classList.add(className);
        }
        
        System.out.println(classList);
    }
    
    public void addClass()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What class do you want to add?: ");
        String className = s.nextLine();
        classList.add(className);
    }
    
    public void addHomework()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What class?: ");
        //String className = s.nextln()
    }
}
