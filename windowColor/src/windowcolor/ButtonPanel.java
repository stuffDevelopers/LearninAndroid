
package windowcolor;

/**
 *
 * @author jhovany
 */
import java.awt.Color;
import javax.swing.*;
class ButtonPanel extends JPanel {
    
    public ButtonPanel()
    {
        JButton purpleButton = new JButton("Purple");
       add(purpleButton);
       ColorActionExt purpleAction = new ColorActionExt(new Color(92,52,168),this);
       purpleButton.addActionListener(purpleAction); 
        
       JButton blueButton = new JButton("Blue");
       add(blueButton);
       ColorActionExt blueAction = new ColorActionExt(Color.BLUE,this);
       blueButton.addActionListener(blueAction);
        
       JButton yellowButton = new JButton("Yellow");
       add(yellowButton);
       ColorActionExt yellowAction = new ColorActionExt(Color.YELLOW,this);
       yellowButton.addActionListener(yellowAction);
       
       
    }
}
