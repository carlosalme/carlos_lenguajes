/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionario;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author T-102
 */
public class AplicacionCuestionario extends javax.swing.JFrame {

    /**
     * Creates new form AplicacionCuestionario
     */
    public AplicacionCuestionario() {
        initComponents();
        nuestroMetodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        BotonRespuesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("BIENVENIDO AL TEST DE GEOGRAFIA ");

        etiquetaTitulo.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Este sera el titulo de la pregunta");

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setLayout(new java.awt.GridLayout(4, 1));

        BotonRespuesta.setText("CHECAR RESPUESTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTitulo)
                            .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonRespuesta)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(etiquetaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRespuesta)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AplicacionCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacionCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacionCuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRespuesta;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables

    private void nuestroMetodo() {
       //generaremos los radio buton
       JRadioButton r1=new JRadioButton("opcion 1");
       JRadioButton r2=new JRadioButton("opcion 2");
       JRadioButton r3=new JRadioButton("opcion 3");
       JRadioButton r4=new JRadioButton("opcion 4");
       
       //creamos un agrupador de botones
      ButtonGroup grupo=new ButtonGroup();
       /*grupo.add(r1);
       grupo.add(r2);
       grupo.add(r3);
       grupo.add(r4);
       */
       //los agregamos a nuestro panelOpciones
      /* panelOpciones.add(r1);
       panelOpciones.add(r2);
       panelOpciones.add(r3);
       panelOpciones.add(r4);
       */
       //vamos a indicarle que ponga la primer pregunta en sus 
       //respectivas opciones
       ArrayList<Pregunta> preguntas=new GeneradorCuestionario().generar();
       
       //del arraylist que se llama preguntas obtenemos el titulo de la primera
       //ArrayList<JRadioButton> radios=new ArrayList<>();
       JRadioButton []radios2=new JRadioButton[preguntas.get(0).getOpciones().size()];
       etiquetaTitulo.setText(preguntas.get(0).getTitulo());
       int indice=0;
       for(JRadioButton radio:radios2){ //ciclo for mejorado
           radio=new JRadioButton();
           grupo.add(radio);
           radio.setText(preguntas.get(0).getOpciones().get(indice).getTitulo());
           panelOpciones.add(radio);
           indice++;
       }
       /*r1.setText(preguntas.get(0).getOpciones().get(0).getTitulo());
       r2.setText(preguntas.get(0).getOpciones().get(1).getTitulo());
       r3.setText(preguntas.get(0).getOpciones().get(2).getTitulo());
       r4.setText(preguntas.get(0).getOpciones().get(3).getTitulo());
       */
       
       //aqui se va a programar el evento del boton con programacion funcional 
       
       /* operacion para un boton para java menor a 8 
       
       BotonRespuesta.addActionListener(new ActionListener(){
       #override
       public void actionPerformed(ActionEvent e){
       }
       });
       */
       
       //programacion del boton para versiones mayores a java 8
       
       //vamos a buscar la opcion correcta 
       BotonRespuesta.addActionListener(evento->{
           
           JOptionPane.showConfirmDialog(this, "Probando esto");
       });//operador lambda
       
    }
}
