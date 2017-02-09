
package windowcolor;

/**
 *
 * @author jhovany
 */
import java.awt.event.*;
import java.awt.*;

class ColorActionExt implements ActionListener{
     private final Color backgroundColor;
     private final Component comp;
     
     public ColorActionExt(Color c, Component comp)
    
    {
       this.backgroundColor = c;
       this.comp=comp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     comp.setBackground(backgroundColor);   
    }
}
