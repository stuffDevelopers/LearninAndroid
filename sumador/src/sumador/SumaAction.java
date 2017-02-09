package sumador;
/**
 *
 * @author jhovany
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SumaAction implements ActionListener {
    private final Sumador comp;
    public SumaAction(Sumador comp){
    this.comp=comp;
    }
    @Override
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
