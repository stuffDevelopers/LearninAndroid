package sumador;

/**
 *
 * @author jhovany
 */
import java.awt.Container;
import javax.swing.*;
public class FrameSumador extends JFrame {
    public FrameSumador(){
        super("Sumador");
        setBounds(400,400,400,100);
        Sumador panel=new Sumador();
        Container c=getContentPane();
        c.add(panel);
    }
}
