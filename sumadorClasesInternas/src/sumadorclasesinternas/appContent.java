package sumadorclasesinternas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author jhovany
 */
public class appContent {
    public appContent(){}
    
    public void init(){
    FrameSumador frame=new FrameSumador();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
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
    
    public class SumaAction implements ActionListener {
    private final Sumador comp;
    public SumaAction(Sumador comp){
    this.comp=comp;
    }
    public void actionPerformed(ActionEvent e) {
        //esto obtiene los valores a sumar
        String cad1=comp.campo1.getText();
        String cad2=comp.campo2.getText();
        //convierte a enteroslos valores a sumar
        int c1=Integer.parseInt(cad1);
        int c2=Integer.parseInt(cad2);
        //Realiza la suma de los valores, convierte a cadena y asigna en resultado;
            comp.resultado.setText(String.valueOf(c1+c2));
    }
    
}
    
    public class FrameSumador extends JFrame {
    public FrameSumador(){
        super("Sumador");
        setBounds(400,400,400,100);
        Sumador panel=new Sumador();
        Container c=getContentPane();
        c.add(panel);
    }
}
    
}