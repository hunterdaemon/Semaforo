/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arduino;

import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author DavidM
 */
public class Controles {

public void enableButton(JButton boton) {
        boton.setEnabled(true);
        boton.setBackground(new Color(255, 204, 51));

    }

    public void disableButton(JButton boton) {
        boton.setEnabled(false);
        boton.setBackground(new Color(204, 204, 204));
    }

    public void disableConnectionPanel(JButton boton, JComboBox combo) {
        combo.setEnabled(false);
        boton.setEnabled(false);
    }

    public void enableConnectionPanel(JButton boton, JComboBox combo) {
        combo.setEnabled(true);
        boton.setEnabled(true);
    }
    
    
}
