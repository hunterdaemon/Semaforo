package Arduino;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import panamahitek.Arduino.PanamaHitek_Arduino;

/**
 *
 * @author Antony García Gonzáles, from Panama Hitek Creative Team
 *
 * Este ejemplo le da dfuncionalidad a un sencillo ejemplo para encender o
 * apagar un LED conectado a Arduino al presionar uno de los dos botones de la
 * interfaz gráfica.
 */
public class Window extends javax.swing.JFrame {
//Se instancia la Librería Arduino

    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    Controles c = new Controles();
    
public class Imagen extends javax.swing.JPanel {    
 public Imagen() {
this.setSize(400, 400); //se selecciona el tamaño del panel
}
 
//Se crea un método cuyo parámetro debe ser un objeto Graphics
 
public void paint(Graphics grafico) {
Dimension height = getSize();

 ImageIcon Img =new ImageIcon(getClass().getResource("/Imagenes/Via.png"));;
 
 int Alta_Alta=0;
 int Alta_Normal=0;
 int Alto_Bajo=0;
 
 int Normal_Alto=0;
 int Normal_Normal=0;
 int Normal_Bajo=0;
 
 int Bajo_Alto=0;
 int Bajo_Normal=0;
 int Bajo_Bajo=0;
 
    if (jButtonAlto_Via_1.isEnabled()) {
  Alta_Alta=0;
  Alta_Normal=0;
  Alto_Bajo=0;
    }else{
        Alta_Alta=Alta_Alta+1;
        Alta_Normal=Alta_Normal+1;
        Alto_Bajo=Alto_Bajo+1;
    }
    
    if (jButtonNormal_Via_1.isEnabled()) {
     Normal_Alto=0;   
     Normal_Normal=0;
    Normal_Bajo=0;
    }else{
        Normal_Alto=Normal_Alto+1;
        Normal_Normal=Normal_Normal+1;
        Normal_Bajo=Normal_Bajo+1;
    }
    
    if (jButtonBajo_Via_1.isEnabled()) {
    Bajo_Alto=0;
Bajo_Normal=0;    
    Bajo_Bajo=0;
    }else{
        Bajo_Alto=Bajo_Alto+1;
        Bajo_Normal=Bajo_Normal+1;
    Bajo_Bajo=Bajo_Bajo+1;
    }
    
    //-----------------------------------------------------------------------------
    
     if (jButtonAlto_Via_2.isEnabled()) {
   Alta_Alta=0;
   Normal_Alto=0;
   Bajo_Alto=0;
    }else{    
    Alta_Alta=Alta_Alta+1;
    Normal_Alto=Normal_Alto+1;
    Bajo_Alto=Bajo_Alto+1;
     }
     
    if (jButtonNormal_Via_2.isEnabled()) {
        Alta_Normal=0;
        Normal_Normal=0;
        Bajo_Normal=0;
    }else{
    Alta_Normal=Alta_Normal+1;
    Normal_Normal=Normal_Normal+1;
    Bajo_Normal=Bajo_Normal+1;
    }
    
    if (jButtonBajo_Via_2.isEnabled()) {
        Alto_Bajo=0;
        Normal_Bajo=0;
        Bajo_Bajo=0;
    }else{
    Alto_Bajo=Alto_Bajo+1;
    Normal_Bajo=Normal_Bajo+1;
    Bajo_Bajo=Bajo_Bajo+1;
    }
    
    //-----------------------------------------------------------------------------
    
    if (Alta_Alta==2) {
                Img =new ImageIcon(getClass().getResource("/Imagenes/Via1_Via2_Alta.png")); 
    }
    if (Alta_Normal==2) {
        Img =new ImageIcon(getClass().getResource("/Imagenes/Via2_Alta.png"));
    }
    if (Alto_Bajo==2) {
        Img =new ImageIcon(getClass().getResource("/Imagenes/Via2_Alta_Via1_Baja.png"));
    }
    if (Normal_Alto==2) {
        Img =new ImageIcon(getClass().getResource("/Imagenes/Via1_Alta.png"));
    }
    if (Normal_Normal==2) {
         Img =new ImageIcon(getClass().getResource("/Imagenes/Via.png"));
    }
    if (Normal_Bajo==2) {
        Img =new ImageIcon(getClass().getResource("/Imagenes/Via1_Baja.png"));
    }
    if (Bajo_Alto==2) {
        Img =new ImageIcon(getClass().getResource("/Imagenes/Via2_Baja_Via1_Alta.png"));
    }
    if (Bajo_Normal==2) {
        Img =new ImageIcon(getClass().getResource("/Imagenes/Via2_Baja.png"));
    }
    if (Bajo_Bajo==2) {
        Img =new ImageIcon(getClass().getResource("/Imagenes/Via1_Via2_Baja.png"));
    }
//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
 
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
 
grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
setOpaque(false);
super.paintComponent(grafico);
}
}

    public Window() {

        initComponents();

        getPorts();

        //Se inicia la conexión con Arduino para transmisión de datos
    }

    public void getPorts() {
        jComboBoxPorts.removeAllItems();
        if (Arduino.getPortsAvailable() > 0) {
            List lst = Arduino.getSerialPorts();
            for(int i=0; i<lst.size(); i++){
                jComboBoxPorts.addItem(lst.get(i));
            }
            //Arduino.getSerialPorts().forEach(i -> jComboBoxPorts.addItem(i));
            jButtonConectar.setEnabled(true);
            jButtonConectar.setBackground(new Color(255, 255, 255));
        } else {
            jButtonConectar.setEnabled(false);
            jButtonConectar.setBackground(new Color(204, 204, 204));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAlto_Via_1 = new javax.swing.JButton();
        jButtonNormal_Via_1 = new javax.swing.JButton();
        jButtonBajo_Via_1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxPorts = new javax.swing.JComboBox();
        jButtonRefresh = new javax.swing.JButton();
        jButtonConectar = new javax.swing.JButton();
        jPanelVia = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonAlto_Via_2 = new javax.swing.JButton();
        jButtonNormal_Via_2 = new javax.swing.JButton();
        jButtonBajo_Via_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASwt v1.1.0");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAlto_Via_1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAlto_Via_1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonAlto_Via_1.setForeground(new java.awt.Color(255, 102, 0));
        jButtonAlto_Via_1.setText("Alto Via 1");
        jButtonAlto_Via_1.setEnabled(false);
        jButtonAlto_Via_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlto_Via_1ActionPerformed(evt);
            }
        });

        jButtonNormal_Via_1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNormal_Via_1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonNormal_Via_1.setForeground(new java.awt.Color(255, 102, 0));
        jButtonNormal_Via_1.setText("Normal Via 1");
        jButtonNormal_Via_1.setEnabled(false);
        jButtonNormal_Via_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNormal_Via_1ActionPerformed(evt);
            }
        });

        jButtonBajo_Via_1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBajo_Via_1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonBajo_Via_1.setForeground(new java.awt.Color(255, 102, 0));
        jButtonBajo_Via_1.setText("Bajo Via 1");
        jButtonBajo_Via_1.setEnabled(false);
        jButtonBajo_Via_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajo_Via_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAlto_Via_1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jButtonNormal_Via_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBajo_Via_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAlto_Via_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNormal_Via_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBajo_Via_1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxPorts.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refreshicon.png"))); // NOI18N
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonConectar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConectar.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jButtonConectar.setForeground(new java.awt.Color(0, 153, 204));
        jButtonConectar.setText("Conectar");
        jButtonConectar.setEnabled(false);
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxPorts, 0, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxPorts))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jButtonConectar)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanelVia.setBackground(new java.awt.Color(51, 51, 51));
        jPanelVia.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelViaMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanelViaLayout = new javax.swing.GroupLayout(jPanelVia);
        jPanelVia.setLayout(jPanelViaLayout);
        jPanelViaLayout.setHorizontalGroup(
            jPanelViaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanelViaLayout.setVerticalGroup(
            jPanelViaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAlto_Via_2.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAlto_Via_2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonAlto_Via_2.setForeground(new java.awt.Color(255, 102, 0));
        jButtonAlto_Via_2.setText("Alto Via 2");
        jButtonAlto_Via_2.setEnabled(false);
        jButtonAlto_Via_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlto_Via_2ActionPerformed(evt);
            }
        });

        jButtonNormal_Via_2.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNormal_Via_2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonNormal_Via_2.setForeground(new java.awt.Color(255, 102, 0));
        jButtonNormal_Via_2.setText("Normal Via 2");
        jButtonNormal_Via_2.setEnabled(false);
        jButtonNormal_Via_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNormal_Via_2ActionPerformed(evt);
            }
        });

        jButtonBajo_Via_2.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBajo_Via_2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonBajo_Via_2.setForeground(new java.awt.Color(255, 102, 0));
        jButtonBajo_Via_2.setText("Bajo Via 2");
        jButtonBajo_Via_2.setEnabled(false);
        jButtonBajo_Via_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajo_Via_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAlto_Via_2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jButtonNormal_Via_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBajo_Via_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAlto_Via_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNormal_Via_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBajo_Via_2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelVia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlto_Via_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlto_Via_1ActionPerformed



        //Se modifica la interface gráfica del botón precionado
        c.disableButton(jButtonAlto_Via_1);
        c.enableButton(jButtonNormal_Via_1);
        c.enableButton(jButtonBajo_Via_1);
        
 Imagen Imagen = new Imagen();
jPanelVia.add(Imagen);
jPanelVia.repaint();

        //Se envían un -1- para encender el LED
        try {
            Arduino.sendData("8");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonAlto_Via_1ActionPerformed

    private void jButtonNormal_Via_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNormal_Via_1ActionPerformed

        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonAlto_Via_1);
        c.disableButton(jButtonNormal_Via_1);
        c.enableButton(jButtonBajo_Via_1);
         Imagen Imagen = new Imagen();
jPanelVia.add(Imagen);
jPanelVia.repaint();
        //Se envía un -0- para apagar el LED
        try {
            Arduino.sendData("4");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonNormal_Via_1ActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed

        Imagen Imagen = new Imagen();
jPanelVia.add(Imagen);
jPanelVia.repaint();

        if (jButtonConectar.getText().equals("Desconectar")) {
            try {
                Arduino.killArduinoConnection();
                jButtonConectar.setText("Conectar");
        c.disableButton(jButtonAlto_Via_1);
        c.disableButton(jButtonNormal_Via_1);
        c.disableButton(jButtonBajo_Via_1);
        
        c.disableButton(jButtonAlto_Via_2);
        c.disableButton(jButtonNormal_Via_2);
        c.disableButton(jButtonBajo_Via_2);
                
                c.enableConnectionPanel(jButtonRefresh, jComboBoxPorts);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                Arduino.arduinoTX(jComboBoxPorts.getSelectedItem().toString(), 9600);
                jButtonConectar.setText("Desconectar");
                
        c.enableButton(jButtonAlto_Via_1);
        c.enableButton(jButtonNormal_Via_1);
        c.enableButton(jButtonBajo_Via_1);
        
        c.enableButton(jButtonAlto_Via_2);
        c.enableButton(jButtonNormal_Via_2);
        c.enableButton(jButtonBajo_Via_2);
                
                c.disableConnectionPanel(jButtonRefresh, jComboBoxPorts);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
    getPorts();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
       
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButtonBajo_Via_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajo_Via_1ActionPerformed
        
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonAlto_Via_1);
        c.enableButton(jButtonNormal_Via_1);
        c.disableButton(jButtonBajo_Via_1);
        //Se envía un -0- para apagar el LED
         Imagen Imagen = new Imagen();
jPanelVia.add(Imagen);
jPanelVia.repaint();
        try {
            Arduino.sendData("1");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBajo_Via_1ActionPerformed

    private void jPanelViaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelViaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelViaMouseMoved

    private void jButtonAlto_Via_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlto_Via_2ActionPerformed
        // TODO add your handling code here:
        //Se modifica la interface gráfica del botón precionado
        c.disableButton(jButtonAlto_Via_2);
        c.enableButton(jButtonNormal_Via_2);
        c.enableButton(jButtonBajo_Via_2);
        Imagen Imagen = new Imagen();
jPanelVia.add(Imagen);
jPanelVia.repaint();
        //Se envía un -0- para apagar el LED
        try {
            Arduino.sendData("8");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAlto_Via_2ActionPerformed

    private void jButtonNormal_Via_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNormal_Via_2ActionPerformed
        // TODO add your handling code here:
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonAlto_Via_2);
        c.disableButton(jButtonNormal_Via_2);
        c.enableButton(jButtonBajo_Via_2);
        Imagen Imagen = new Imagen();
jPanelVia.add(Imagen);
jPanelVia.repaint();
        //Se envía un -0- para apagar el LED
        try {
            Arduino.sendData("4");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonNormal_Via_2ActionPerformed

    private void jButtonBajo_Via_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajo_Via_2ActionPerformed
        // TODO add your handling code here:
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonAlto_Via_2);
        c.enableButton(jButtonNormal_Via_2);
        c.disableButton(jButtonBajo_Via_2);
        Imagen Imagen = new Imagen();
jPanelVia.add(Imagen);
jPanelVia.repaint();
        //Se envía un -0- para apagar el LED
        try {
            Arduino.sendData("1");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBajo_Via_2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlto_Via_1;
    private javax.swing.JButton jButtonAlto_Via_2;
    private javax.swing.JButton jButtonBajo_Via_1;
    private javax.swing.JButton jButtonBajo_Via_2;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonNormal_Via_1;
    private javax.swing.JButton jButtonNormal_Via_2;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JComboBox jComboBoxPorts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelVia;
    // End of variables declaration//GEN-END:variables
}
