/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.model.ItemConsignado;
import br.unipampa.service.GerarRelatorioEmPdf;
import br.unipampa.service.TipoDeRelatorio;
import java.awt.Desktop;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;

/**
 *
 * @author gabrielbmoro
 */
public class FrameDeGeracaoDeRelatorios extends javax.swing.JFrame implements WindowListener {

    private JFileChooser jFileChooser;
    private TipoDeRelatorio tipoDeRelatorio;

    /**
     * Creates new form FrameDeGeracaoDeRelatorios
     */
    public FrameDeGeracaoDeRelatorios(TipoDeRelatorio tipoDeRelatorio) {
        initComponents();
        this.tipoDeRelatorio = tipoDeRelatorio;
        if (this.tipoDeRelatorio != null) {
            ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 495, 212);
        } else {
            GeradorDeMensagem.exibirMensagemDeInformacao("Nenhum tipo de relatorio informado, realize a operaçao novamente!", "Alerta de Usuario");
            dispose();
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
        txtCaminhoParaSalvar = new javax.swing.JTextField();
        txtBuscarDiretorio = new javax.swing.JButton();
        btnGerarRelatorio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNomeDoRelatorio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gerar Relatorios");

        jLabel1.setText("Caminho para salvar o relatorio:");

        txtCaminhoParaSalvar.setText("caminhoDoArquivo");
        txtCaminhoParaSalvar.setEnabled(false);

        txtBuscarDiretorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/pesquisar.png"))); // NOI18N
        txtBuscarDiretorio.setToolTipText("Buscar Imagem para Item");
        txtBuscarDiretorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarDiretorioActionPerformed(evt);
            }
        });

        btnGerarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/exportar.png"))); // NOI18N
        btnGerarRelatorio.setText("Gerar Relatorio");
        btnGerarRelatorio.setToolTipText("Gerar Relatorio com Itens Cadastrados");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Arquivo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGerarRelatorio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCaminhoParaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBuscarDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addComponent(txtNomeDoRelatorio)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscarDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaminhoParaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGerarRelatorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarDiretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarDiretorioActionPerformed
        jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resposta = jFileChooser.showOpenDialog(null);
        if (resposta == JFileChooser.APPROVE_OPTION) {
            File diretorioEscolhido = jFileChooser.getSelectedFile();
            GeradorDeMensagem.exibirMensagemDeInformacao("Você escolheu o diretório: " + diretorioEscolhido.getName().toString(), "Alerta à Usuário");
            txtCaminhoParaSalvar.setText(diretorioEscolhido.getPath().toString());
        } else {
            GeradorDeMensagem.exibirMensagemDeInformacao("Você não selecionou nenhum diretório", "Alerta à Usuário");
        }
    }//GEN-LAST:event_txtBuscarDiretorioActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        String titulo = txtNomeDoRelatorio.getText();
        
        if(titulo.isEmpty()||titulo==null){
            titulo = "RelatorioSisMOA";
        }
        
        if (new File(txtCaminhoParaSalvar.getText()).exists()) {
            ItemConsignado itemConsignado = new ItemConsignado();
            List<Object> dados = itemConsignado.recuperarTodos();
            if (dados.isEmpty() || dados == null) {
                GeradorDeMensagem.exibirMensagemDeInformacao("O relatorio nao foi gerado, pois nenhum registro foi encontrado!", "Alerta ao Usuario");
            } else {
                GerarRelatorioEmPdf gerarRelatorioEmPdf = new GerarRelatorioEmPdf();
                boolean resposta = gerarRelatorioEmPdf.gerarRelatorio(dados, txtCaminhoParaSalvar.getText(), titulo , this.tipoDeRelatorio);
                if (resposta) {
                    GeradorDeMensagem.exibirMensagemDeInformacao("O relatorio foi gerado com sucesso!", "Alerta ao Usuario");
                } else {
                    GeradorDeMensagem.exibirMensagemDeInformacao("O relatorio nao foi gerado, realize a operaçao mais tarde!", "Alerta ao Usuario");
                }
            }
        } else {
            GeradorDeMensagem.exibirMensagemDeInformacao("Caminho de diretorio invalido, escolha outro diretorio!", "Alerta ao Usuario");
        }

    }//GEN-LAST:event_btnGerarRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton txtBuscarDiretorio;
    private javax.swing.JTextField txtCaminhoParaSalvar;
    private javax.swing.JTextField txtNomeDoRelatorio;
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
