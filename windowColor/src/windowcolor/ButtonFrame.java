
package windowcolor;

/**
 *
 * @author jhovany
 */
import javax.swing.JFrame;
class ButtonFrame extends JFrame {
     public static final int DEFAULT_WIDTH = 400;
     public static final int DEFAULT_HEIGHT = 300;
   
    public ButtonFrame()
    {
       setTitle("colorTest");
       setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
       
       ButtonPanel panel = new ButtonPanel();
       add(panel);
    }
}
