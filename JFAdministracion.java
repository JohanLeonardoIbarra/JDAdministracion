import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

/**
 * Write a description of class JFAdministracion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JFAdministracion extends JFrame implements ActionListener
{
    private JPanel p1,p2,p3,p4;
    private JLabel lblNombre, lblPropietario, lblArea, lblHabitantes, lblValorPagar, lblValorP, lVacio;
    private JTextField t1,t2,t3,t4;
    private JCheckBox c1,c2;
    private JButton b1,b2,b3,b4;
    Border borde1, borde2, borde3;
    
    JFAdministracion()
    {
        borde1 = new TitledBorder(new EtchedBorder(), "Datos Personales");
        borde2 = new TitledBorder(new EtchedBorder(), "Descuentos");
        borde3 = new TitledBorder(new EtchedBorder(), "Datos Personales");
        crearInterfaz();
    }
    
    public void crearInterfaz()
    {
        JFrame marco = new JFrame();
        marco.setVisible(true);
        marco.setResizable(false);
        marco.setSize(300,500);
        marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
        marco.setTitle("Administracionm de Condominio");
        marco.setLocationRelativeTo(null);
        
        p1 = new JPanel();
        p1.setSize(new Dimension(300, 500));
        p1.setLayout(new BorderLayout());
        p1.setVisible(true);
        p1.setBackground(Color.BLACK);
        
        p2 = new JPanel();
        p2.setPreferredSize(new Dimension(290,300));
        p2.setLayout(new GridLayout(5,2,10,10));
        p2.setBorder(borde1);
        p2.setBackground(Color.WHITE);
        p2.setVisible(true);
        
        p3 = new JPanel();
        p3.setPreferredSize(new Dimension(290,70));
        p3.setLayout(new FlowLayout());
        p3.setBorder(borde1);
        p3.setBackground(Color.WHITE);
        p3.setVisible(true);
        
        p4 = new JPanel();
        p4.setPreferredSize(new Dimension(290,100));
        p4.setLayout(new GridLayout(2,3,5,5));
        p4.setBorder(borde2);
        p4.setBackground(Color.WHITE);
        p4.setVisible(true);
        
        //Adicionar paneles
        
        marco.add(p1);
        p1.add(p2, BorderLayout.NORTH);
        p1.add(p3, BorderLayout.CENTER);
        p1.add(p4, BorderLayout.SOUTH);
        
        //Elementos panel Datos
        
        p2.add(lblNombre = new JLabel("Nombre"));
        p2.add(t1 = new JTextField());
        p2.add(lblPropietario = new JLabel("Propietario"));
        p2.add(t2 = new JTextField());
        p2.add(lblArea = new JLabel("Area"));
        p2.add(t3 = new JTextField());
        p2.add(lblHabitantes = new JLabel("Habitantes"));
        p2.add(t4 = new JTextField());
        p2.add(b1 = new JButton("Buscar"));
        b1.addActionListener(this);
        
        //Elementos panel Descuentos
        
        p3.add(c1 = new JCheckBox("P. Pago", false));
        p3.add(c1 = new JCheckBox("P. Plataforma", false));
        
        //Elementos panel calcular
        
        p4.add(lblValorPagar = new JLabel("Valor a Pagar"));
        p4.add(lblValorP = new JLabel(""));
        lblValorP.setBorder(new LineBorder(Color.BLACK));
        p4.add(lVacio = new JLabel(""));
        p4.add(b2 = new JButton("Calcular"));
        p4.add(b4 = new JButton("Guardar"));
        p4.add(b3 = new JButton("Limpiar"));
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String comando = e.getActionCommand();
  
        if (comando.equals("Calcular"))
        {
            Propiedad p = new Propiedad(t1.getText(), t2.getText(), Double.parseDouble(t3.getText()), Integer.parseInt(t4.getText()));
            
            Double pago = 0.00;

            System.out.println(t1.getText() + " " + t2.getText() + " " + t3.getText()+ " " +t4.getText());
            
            if(Double.parseDouble(t3.getText()) <= 120)
            {
                pago = 107000.00;
            }
            else if (Double.parseDouble(t3.getText()) <= 250)
            {
                pago = 155000.00;
            }
            else if (Double.parseDouble(t3.getText()) <= 320)
            {
                pago = 222916.67;
            }
            else {pago = 285333.33;}
            
            if (c1.isSelected()){pago -= pago * 0.05;}
            //if (c2.isSelected()){pago -= pago * 0.10;}
            
            lblValorP.setText(pago.toString());
        }
        else if (comando.equals("Limpiar"))
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            lblValorP.setText("");
        }
        else if(comando.equals("Guardar"))
        {
            
        }   
        else if (comando.equals("Buscar"))
        {
            
        }
    }
}
