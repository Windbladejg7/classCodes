package vistaListeners;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class MiWindowsListeners implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("La ventana se abrio");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(resp==JOptionPane.YES_OPTION){ //acepta
            System.exit(0); //cerrar aplicacion
        }else{
            System.out.println("Seguimos en la app");
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
