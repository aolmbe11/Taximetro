package taximetro;

import es.javiergarbedo.coordinateslib.CoordinatesConverter;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.validator.routines.CreditCardValidator;

public class Taximetro extends javax.swing.JFrame {
    
    // Declaración de variables y constantes
    final double TARIFAMINUTO = 0.50;
    final double IVA = 0.21;
    int contador = 0;
    
    // Creación de objetos Calendar y Fomatos que serán usados en varios botones.
    Calendar fechaHoraBajadaBandera;
    DateFormat formatoHora = DateFormat.getTimeInstance(DateFormat.MEDIUM);
    DateFormat formatoFecha = DateFormat.getDateInstance(DateFormat.MEDIUM);

    public Taximetro() {
        initComponents();
        // Método para asignar un icono a la aplicación.
        setIcon();

        // Al inicar la ventana el botón parar está desabilitado.
        botonParar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        coordenadasLatitud = new javax.swing.JLabel();
        jT_Latitud = new javax.swing.JTextField();
        jT_Longitud = new javax.swing.JTextField();
        coordenadasLongitud = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jT_Destino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaTicket = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        etiquetaMapa = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jT_TarjetaCredito = new javax.swing.JTextField();
        botonComprobar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        botonBanderaVerde = new javax.swing.JButton();
        botonParar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taximetro");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Posición GPS Inicio");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Latitud:");

        jLabel2.setText("Longitud:");

        coordenadasLatitud.setText("latitud");

        coordenadasLongitud.setText("longitud");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taximetro/imagenes/GPS_inYourCar2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jT_Latitud)
                    .addComponent(jT_Longitud, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coordenadasLongitud)
                    .addComponent(coordenadasLatitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(coordenadasLatitud)
                            .addComponent(jT_Latitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jT_Longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coordenadasLongitud))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Datos del Trayecto");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setText("Destino:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jT_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jT_Destino, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textAreaTicket.setEditable(false);
        textAreaTicket.setColumns(20);
        textAreaTicket.setRows(5);
        jScrollPane1.setViewportView(textAreaTicket);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("Tarjeta de Crédito:");

        botonComprobar.setText("Comprobar");
        botonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprobarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Mapa");

        botonBanderaVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taximetro/imagenes/free-vector-green-flag_098725_Green_flag.png"))); // NOI18N
        botonBanderaVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBanderaVerdeActionPerformed(evt);
            }
        });

        botonParar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/taximetro/imagenes/X-Stop-Sign-Clip-Art.png"))); // NOI18N
        botonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(botonBanderaVerde)
                                .addGap(18, 18, 18)
                                .addComponent(botonParar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(botonComprobar))
                                .addComponent(jT_TarjetaCredito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonParar)
                            .addComponent(botonBanderaVerde))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jT_TarjetaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonComprobar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBanderaVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBanderaVerdeActionPerformed
        
        // Al bajar la bandera, el botón queda desabilitado.
        botonBanderaVerde.setEnabled(false);
        
        // Al bajar la bandera, el botón parar se vuelve a habilitar.
        botonParar.setEnabled(true);
        
        // Obtener hora de bajada de bandera.
        fechaHoraBajadaBandera = Calendar.getInstance();
        formatoHora.format(fechaHoraBajadaBandera.getTime());

        // Recogida de datos y conversión a double.
        double latitud = Double.valueOf(jT_Latitud.getText());
        double longitud = Double.valueOf(jT_Longitud.getText());

        // Convertir latitud y longitud a coordenadas.
        CoordinatesConverter conversorCoordenadas = new CoordinatesConverter();
        coordenadasLatitud.setText(conversorCoordenadas.decimalToDMS(latitud));
        coordenadasLongitud.setText(conversorCoordenadas.decimalToDMS(longitud));

        //Código para mostrar el mapa en un JLabel 
        String origen = jT_Latitud.getText() + "," + jT_Longitud.getText();
        String destino = jT_Destino.getText();
        
        //Hay que sustituir los espacios por el carácter %20 para que se
        //  interprete bien la URL que se generará
        destino = destino.replaceAll(" ", "%20");
        
        // Mostrar mapa en el jLabel asignado para ello.
        javax.swing.JLabel jLabelMapa = etiquetaMapa;
        
        // Asignar tamaño al mapa.
        int tamHorizontal = 300;
        int tamVertical = 300;      

        //A partir de aquí no hace falta cambiar nada
        try {
            String txtDireccionImagenMapa = "http://maps.google.com/maps/api/staticmap?path="
                    + origen + "|" + destino + "&size=" + tamHorizontal + "x" + tamVertical
                    + "&language=ES&sensor=false";
            System.out.println(txtDireccionImagenMapa);
            java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
            java.awt.Image imagenMapa = toolkit.getImage(new java.net.URL(txtDireccionImagenMapa));
            jLabelMapa.setIcon(new javax.swing.ImageIcon(imagenMapa));
        } catch (java.net.MalformedURLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "La dirección de imagen indicada no es correcta");
        }

        // Crear formato para el contador de ticket.
        DecimalFormat formatoTicket = new DecimalFormat("00000");
        contador++;
        String contadorAString = formatoTicket.format(contador);
        
        // Mostrar datos del ticket en el textArea
        textAreaTicket.setText("TICKET\n");
        textAreaTicket.append("======\n");
        textAreaTicket.append("Nºticket: " + contadorAString);
        textAreaTicket.append("\nFecha:" + formatoFecha.format(fechaHoraBajadaBandera.getTime()));
        textAreaTicket.append("\n\n");
        textAreaTicket.append("Hora bajada de bandera: " + formatoHora.format(fechaHoraBajadaBandera.getTime()));

    }//GEN-LAST:event_botonBanderaVerdeActionPerformed

    private void botonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPararActionPerformed
        
         // Al finalizar el trayecto, el botón parar está desabilitado.
        botonParar.setEnabled(false);
        
        // Al finalizar el trayecto, el botón iniciar se vuelve a habilitar.
        botonBanderaVerde.setEnabled(true);
        
        // Obtener hora de fin de trayecto
        Calendar horaFinTrayecto = Calendar.getInstance();

        // Conversión de hh/mm/ss a milisegundos para obtener la duración del 
        // trayecto.
        long miliSegundosBajadaBandera = fechaHoraBajadaBandera.getTimeInMillis();
        long miliSegundosFinTrayecto = horaFinTrayecto.getTimeInMillis();
        long duracionTrayectoEnMilis = miliSegundosFinTrayecto - miliSegundosBajadaBandera;

        // Formato para convertir milisegundos a hh/mm/ss     
        String formatoMilis = DurationFormatUtils.formatDuration(duracionTrayectoEnMilis,"HH:mm:ss");
        
        // Calcular importe.
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
        double duracionTrayectoEnSeg = (duracionTrayectoEnMilis / 1000);
        double importe = (duracionTrayectoEnSeg / 60) * TARIFAMINUTO; // Pasar milisegundos a minutos
        double ivaImporte = importe * IVA;
        double importeTotal = importe + ivaImporte;

        // Agregar datos del ticket en el textArea
        
        textAreaTicket.append("\nHora fin de trayecto: " + formatoHora.format(horaFinTrayecto.getTime()));
        textAreaTicket.append("\nDuración de trayecto: " + formatoMilis);
        textAreaTicket.append("\nTarifa por minuto: " + formatoMoneda.format(TARIFAMINUTO));
        textAreaTicket.append("\n\n");
        textAreaTicket.append("Importe: " + formatoMoneda.format(importe));
        textAreaTicket.append("\nIVA: " + formatoMoneda.format(ivaImporte));
        textAreaTicket.append("\nImporte total: " + formatoMoneda.format(importeTotal));
    }//GEN-LAST:event_botonPararActionPerformed

    private void botonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprobarActionPerformed
        
        // Comprobar validez de la tarjeta de crédito
        String numTarjeta = jT_TarjetaCredito.getText();
        CreditCardValidator validadorTarjeta = new CreditCardValidator();
        boolean tarjetaValida = validadorTarjeta.isValid(numTarjeta);
        String mensaje = (tarjetaValida == true) ? "Tarjeta válida" : "Tarjeta inválida";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_botonComprobarActionPerformed

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
            java.util.logging.Logger.getLogger(Taximetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taximetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taximetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taximetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taximetro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBanderaVerde;
    private javax.swing.JButton botonComprobar;
    private javax.swing.JButton botonParar;
    private javax.swing.JLabel coordenadasLatitud;
    private javax.swing.JLabel coordenadasLongitud;
    private javax.swing.JLabel etiquetaMapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_Destino;
    private javax.swing.JTextField jT_Latitud;
    private javax.swing.JTextField jT_Longitud;
    private javax.swing.JTextField jT_TarjetaCredito;
    private javax.swing.JTextArea textAreaTicket;
    // End of variables declaration//GEN-END:variables

    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("taxi14.png")));
    }
}
