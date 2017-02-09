
package sumador;

/**
 *
 * @author jhovany
 */
import javax.swing.*;
public class Sumador extends JPanel{
    /**
     * @param Mi clase Panel
     */
    JTextField campo1,campo2;
    JLabel mas,resultado;
    JButton btnIgual;
    public Sumador(){
      campo1=new JTextField("",5);
      campo2=new JTextField("",5);
      mas= new JLabel("+");
      btnIgual= new JButton("=");
      resultado=new JLabel("");
        // se agregan los elementos al panel
        add(campo1); add(mas); add(campo2); add(btnIgual); add(resultado);
        // creación del objeto Listener
        SumaAction listener= new SumaAction(this);
        // agregar el Listener al botón
        btnIgual.addActionListener(listener);
    }

}
