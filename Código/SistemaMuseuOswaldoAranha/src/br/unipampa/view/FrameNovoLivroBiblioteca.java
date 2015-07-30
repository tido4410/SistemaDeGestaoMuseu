/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.model.LivroDaBiblioteca;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author gabrielbmoro
 */
public class FrameNovoLivroBiblioteca extends javax.swing.JFrame implements WindowListener{

    private LivroDaBiblioteca livroBiblioteca;

    /**
     * Creates new form FrameNovoLivroBiblioteca
     */
    public FrameNovoLivroBiblioteca() {
        initComponents();
        addWindowListener(this);
        ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 588, 480);
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
        txtCodigoAuxiliar = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboPaisLivroBiblioteca = new javax.swing.JComboBox();
        txtTituloDaObra = new javax.swing.JTextField();
        txtGrafica = new javax.swing.JTextField();
        txtAnoDeLancamento = new javax.swing.JFormattedTextField();
        txtRegiao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAutores = new javax.swing.JTextArea();
        btnSalvarNovoLivroBiblioteca = new javax.swing.JButton();

        setTitle("Cadastro de Novo Livro Biblioteca");

        jLabel1.setText("*Código Auxiliar:");

        txtCodigoAuxiliar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabel2.setText("*Título da Obra:");

        jLabel3.setText("*Autor (es):");

        jLabel4.setText("Gráfica:");

        jLabel5.setText("*Ano de Lançamento:");

        jLabel6.setText("Região:");

        jLabel7.setText("País:");

        jComboPaisLivroBiblioteca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------------", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Anguilla", "Antigua", "Arábia Saudita", "Argentina", "Armênia", "Aruba", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Bélgica", "Benin", "Bermudas", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burkina Fasso", "Botão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Cazaquistão", "Chade", "Chile", "China", "Cidade do Vaticano", "Colômbia", "Congo", "Coréia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Dinamarca", "Djibuti", "Dominica", "EUA", "Egito", "El Salvador", "Emirados Árabe", "Equador", "Eritréia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Gibraltar", "Granada", "Grécia", "Guadalupe", "Guam", "Guatemala", "Guiana", "Guiana Francesa", "Guiné-bissau", "Haiti", "Holanda", "Honduras", "Hong Kong", "Hungria", "Iêmen", "Ilhas Cayman", "Ilhas Cook", "Ilhas Curaçao", "Ilhas Marshall", "Ilhas Turks & Caicos", "Ilhas Virgens (brit.)", "lhas Virgens(amer.)", "Ilhas Wallis e Futuna", "Índia", "Indonésia", "Inglaterra", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Latvia", "Líbano", "Liechtenstein", "Lituânia", "Luxemburgo", "Macau", "Macedônia", "Madagascar", "Malásia", "Malaui", "Mali", "Malta", "Marrocos", "Martinica", "Mauritânia", "Mauritius", "México", "Moldova", "Mônaco", "Montserrat", "Nepal", "Nicarágua", "Niger", "Nigéria", "Noruega", "Nova Caledônia", "Nova Zelândia", "Omã", "Palau", "Panamá", "Papua-nova Guiné", "Paquistão", "Peru", "Polinésia Francesa", "Polônia", "Porto Rico", "Portugal", "Qatar", "Quênia", "Rep. Dominicana", "Rep. Tcheca", "Reunion", "Romênia", "Ruanda", "Rússia", "Saipan", "Samoa Americana", "Senegal", "Serra Leone", "Seychelles", "Singapura", "Síria", "Sri Lanka", "St. Kitts & Nevis", "St. Lúcia", "St. Vincent", "Sudão", "Suécia", "Suiça", "Suriname", "Tailândia", "Taiwan", "Tanzânia", "Togo", "Trinidad & Tobago", "Tunísia", "Turquia", "Ucrânia", "Uganda", "Uruguai", "Venezuela", "Vietnã", "Zaire", "Zâmbia", "Zimbábue" }));
        jComboPaisLivroBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPaisLivroBibliotecaActionPerformed(evt);
            }
        });

        txtAnoDeLancamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        txtAreaAutores.setColumns(20);
        txtAreaAutores.setRows(5);
        jScrollPane1.setViewportView(txtAreaAutores);

        btnSalvarNovoLivroBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/cadastrar.png"))); // NOI18N
        btnSalvarNovoLivroBiblioteca.setText("Salvar");
        btnSalvarNovoLivroBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarNovoLivroBibliotecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigoAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTituloDaObra))
                        .addComponent(btnSalvarNovoLivroBiblioteca)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAnoDeLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboPaisLivroBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTituloDaObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoDeLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPaisLivroBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnSalvarNovoLivroBiblioteca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboPaisLivroBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPaisLivroBibliotecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPaisLivroBibliotecaActionPerformed

    private void btnSalvarNovoLivroBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarNovoLivroBibliotecaActionPerformed

        if (this.txtCodigoAuxiliar.getText() == null || this.txtTituloDaObra.getText() == null
                || this.txtAreaAutores == null || txtAnoDeLancamento.getText() == null) {
            GeradorDeMensagem.exibirMensagemDeInformacao("Por favor, preencha os campos marcados com '*', pois são obrigatórios. \n Também verifique a validade das datas!", "Alerta ao Usuário");
            return;
        } else {
            try {
                int codigoAuxiliar = Integer.parseInt(this.txtCodigoAuxiliar.getText());
                String tituloDaObra = this.txtTituloDaObra.getText();
                String autor = this.txtAreaAutores.getText();
                String grafica = this.txtGrafica.getText();
                int anoDePublicacao = Integer.parseInt(this.txtAnoDeLancamento.getText());
                String regiao = this.txtRegiao.getText();
                Object pais = this.jComboPaisLivroBiblioteca.getSelectedItem();
                String paisTexto = pais.toString();

                this.livroBiblioteca = new LivroDaBiblioteca();
                this.livroBiblioteca.setOutroCodigo(codigoAuxiliar);
                this.livroBiblioteca.setNomeLivro(tituloDaObra);
                this.livroBiblioteca.setNomeAutor(autor);
                this.livroBiblioteca.setAnoLacamento(anoDePublicacao);
                this.livroBiblioteca.setRegiao(regiao);
                this.livroBiblioteca.setPais(paisTexto);
                this.livroBiblioteca.setGrafica(txtGrafica.getText());

                if (this.livroBiblioteca.salvar(this.livroBiblioteca)) {
                    GeradorDeMensagem.exibirMensagemDeInformacao("Os dados foram cadastrados com sucesso!", "Alerta ao Usuário");
                    dispose();
                } else {
                    GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");
                }

            } catch (NumberFormatException numberErro) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");
                return;
            }
        }
    }//GEN-LAST:event_btnSalvarNovoLivroBibliotecaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarNovoLivroBiblioteca;
    private javax.swing.JComboBox jComboPaisLivroBiblioteca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtAnoDeLancamento;
    private javax.swing.JTextArea txtAreaAutores;
    private javax.swing.JFormattedTextField txtCodigoAuxiliar;
    private javax.swing.JTextField txtGrafica;
    private javax.swing.JTextField txtRegiao;
    private javax.swing.JTextField txtTituloDaObra;
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
