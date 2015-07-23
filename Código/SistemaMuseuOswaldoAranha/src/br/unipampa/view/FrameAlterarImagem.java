/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.service.UtilitariaDeUploadDeImagem;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author gabrielbmoro
 */
public class FrameAlterarImagem extends javax.swing.JFrame implements WindowListener{

    private Long idObjeto;
    private  JFileChooser jFileChooser;
    
    /**
     * Creates new form FrameAlterarImagem
     */
    public FrameAlterarImagem(Long idObjeto) {
        initComponents();
        this.idObjeto = idObjeto;
        addWindowListener(this);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarImagem = new javax.swing.JButton();
        txtCaminhoImagem = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtBuscarImagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Enviar Imagem");

        btnRegistrarImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/cadastrar.png"))); // NOI18N
        btnRegistrarImagem.setText("Registrar Imagem");
        btnRegistrarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarImagemActionPerformed(evt);
            }
        });

        txtCaminhoImagem.setText("caminhoDoArquivo");
        txtCaminhoImagem.setEnabled(false);

        jLabel18.setText("Foto do Item:");

        txtBuscarImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/pesquisar.png"))); // NOI18N
        txtBuscarImagem.setToolTipText("Buscar Imagem para Item");
        txtBuscarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(btnRegistrarImagem))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarImagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarImagemActionPerformed
        boolean verificacao = UtilitariaDeUploadDeImagem.verificarArquivo(new File(this.txtCaminhoImagem.getText()));
        if (verificacao == true) {
            if (idObjeto != null) {
                    File fileArquivo = new File(txtCaminhoImagem.getText());
                    boolean resposta = UtilitariaDeUploadDeImagem.enviarArquivo(fileArquivo, idObjeto);
                    if (resposta) {
                        GeradorDeMensagem.exibirMensagemDeInformacao("Arquivo enviado com sucesso!", "Alerta ao Usuário");
                        boolean resposta2 = GeradorDeMensagem.exibirMensagemDeConfirmacao("Você deseja registrar um novo item?", "Alerta ao Usuário");
                        if (resposta2) {
                            dispose();
                        } else {
                            dispose();
                        }
                    } else {
                        GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");

                    
                    }}else {
                        GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");

                    }
        }
     else {
                        GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");

                    }
    }//GEN-LAST:event_btnRegistrarImagemActionPerformed

    private void txtBuscarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarImagemActionPerformed
        jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resposta = jFileChooser.showOpenDialog(null);
        if (resposta == JFileChooser.APPROVE_OPTION) {
            File diretorioEscolhido = jFileChooser.getSelectedFile();
            GeradorDeMensagem.exibirMensagemDeInformacao("Você escolheu o diretório: " + diretorioEscolhido.getName().toString(), "Alerta ao Usuário");
            txtCaminhoImagem.setText(diretorioEscolhido.getPath().toString());
        } else {
            GeradorDeMensagem.exibirMensagemDeInformacao("Você não selecionou nenhum diretório", "Alerta ao Usuário");
        }
    }//GEN-LAST:event_txtBuscarImagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarImagem;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JButton txtBuscarImagem;
    private javax.swing.JTextField txtCaminhoImagem;
    // End of variables declaration//GEN-END:variables

     @Override
    public void windowOpened(WindowEvent e) {
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
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
