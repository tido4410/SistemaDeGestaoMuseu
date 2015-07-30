/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.service.VerificacaoDeInicializacao;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author gabrielbmoro
 */
public class FrameInicial extends javax.swing.JFrame implements WindowListener {

    private static final String SET_LOOK = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
    private boolean flagDeMostrarDetalhes=false;
    /**
     * Creates new form FrameInicial
     */
    public FrameInicial() {
        initComponents();
        lookAndfeel();
        atualizarBarraDeProgresso();
        ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 591, 382);
        jPanelFeedbackParaUsuario.setVisible(false);
        revalidate();
        addWindowListener(this);
    }

    private void atualizarBarraDeProgresso() {
        this.getjProgressBar().setIndeterminate(true);
        revalidate();
    }

    private void lookAndfeel() {
        try {
            UIManager.setLookAndFeel(SET_LOOK);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception erro) {
            System.err.println("Erro");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        btnMostrarDetalhes = new javax.swing.JButton();
        jPanelFeedbackParaUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDeTarefasExecutadas = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem vindo ao SisMOA");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/logoTipoRelatorio.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Seja bem-vindo ao Sistema de Acervo do Museu Oswaldo Aranha!");

        jLabel3.setText("Aguarde a inicialização do sistema...");

        btnMostrarDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/add.png"))); // NOI18N
        btnMostrarDetalhes.setToolTipText("Mais Detalhes");
        btnMostrarDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDetalhesActionPerformed(evt);
            }
        });

        jListDeTarefasExecutadas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListDeTarefasExecutadas);

        javax.swing.GroupLayout jPanelFeedbackParaUsuarioLayout = new javax.swing.GroupLayout(jPanelFeedbackParaUsuario);
        jPanelFeedbackParaUsuario.setLayout(jPanelFeedbackParaUsuarioLayout);
        jPanelFeedbackParaUsuarioLayout.setHorizontalGroup(
            jPanelFeedbackParaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFeedbackParaUsuarioLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanelFeedbackParaUsuarioLayout.setVerticalGroup(
            jPanelFeedbackParaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFeedbackParaUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(275, 275, 275)))
                                .addComponent(btnMostrarDetalhes)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelFeedbackParaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMostrarDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelFeedbackParaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDetalhesActionPerformed
       if(flagDeMostrarDetalhes==false){
           this.getjPanelFeedbackParaUsuario().setVisible(true);
        this.btnMostrarDetalhes.setIcon(new ImageIcon(getClass().getResource("/br/unipampa/view/icons/naoAdd.png")));
        flagDeMostrarDetalhes=true;
       }else{
           this.getjPanelFeedbackParaUsuario().setVisible(false);
           this.btnMostrarDetalhes.setIcon(new ImageIcon(getClass().getResource("/br/unipampa/view/icons/add.png")));
           flagDeMostrarDetalhes=false;
       }
       revalidate();
    }//GEN-LAST:event_btnMostrarDetalhesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarDetalhes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListDeTarefasExecutadas;
    private javax.swing.JPanel jPanelFeedbackParaUsuario;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (GeradorDeMensagem.exibirMensagemDeConfirmacao("Você deseja realmente sair da aplicação?", "Alerta ao Usuário")) {
            System.exit(0);
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

    /**
     * @return the jListDeTarefasExecutadas
     */
    public javax.swing.JList getjListDeTarefasExecutadas() {
        return jListDeTarefasExecutadas;
    }

    /**
     * @return the jPanelFeedbackParaUsuario
     */
    public javax.swing.JPanel getjPanelFeedbackParaUsuario() {
        return jPanelFeedbackParaUsuario;
    }

    /**
     * @return the jProgressBar
     */
    public javax.swing.JProgressBar getjProgressBar() {
        return jProgressBar;
    }
}
