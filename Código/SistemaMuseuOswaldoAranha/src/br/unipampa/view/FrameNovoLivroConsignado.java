/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.model.ItemConsignado;
import br.unipampa.service.UtilitariaDeUploadDeImagem;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author gabrielbmoro
 */
public class FrameNovoLivroConsignado extends javax.swing.JFrame implements WindowListener {

    private ItemConsignado itemConsignado;
    private JFileChooser jFileChooser;

    /**
     * Creates new form FrameNovoLivroConsignado
     */
    public FrameNovoLivroConsignado() {
        initComponents();
        ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 1100, 500);
        jPanelDados.setVisible(true);
        jPanelUploadDeImagem.setVisible(false);
        revalidate();
        repaint();
        addWindowListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDados = new javax.swing.JPanel();
        txtProcedenciaLivroConsignado = new javax.swing.JTextField();
        txtSitioLivroConsignado = new javax.swing.JTextField();
        txtResponsavelDaFamiliaLivroConsignado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRegiaoLivroConsignado = new javax.swing.JTextField();
        txtCodigoAuxiliarLivroConsignado = new javax.swing.JFormattedTextField();
        txtFuncaoEspecificaLivroConsignado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTipoDeObjetoLivroConsignado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTecmanufaturaLivroConsignado1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEstiloLivroConsignado = new javax.swing.JTextField();
        txtCulturaLivroConsignado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtGrupoLingLivroConsignado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboPaisLivroConsignado = new javax.swing.JComboBox();
        jDateChooserDevolucaoLivroConsignado = new com.toedter.calendar.JDateChooser();
        jDateDeUtilizacaoFinalLivroConsignado = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDateDeUtilizacaoInicialLivroConsignado = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMateriaPrimaLivroConsignado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jDateEmprestimoLivroConsignado = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrarDadosLivroConsignado = new javax.swing.JButton();
        jPanelUploadDeImagem = new javax.swing.JPanel();
        txtCaminhoImagem = new javax.swing.JTextField();
        txtBuscarImagem = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btnRegistrarImagem = new javax.swing.JButton();

        setTitle("Novo LivroConsignado");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setText("*Responsável da Família:");

        txtCodigoAuxiliarLivroConsignado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabel8.setText("*Tipo de Objeto:");

        jLabel6.setText("Data de Utilização Inicial:");

        jLabel17.setText("País:");

        jLabel7.setText("Data de Utilização Final:");

        jLabel4.setText("*Data de Devolução:");

        jLabel12.setText("Grupo Linguístico:");

        jLabel13.setText("Técnica de Manufatura:");

        jLabel10.setText("Cultura:");

        txtCulturaLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCulturaLivroConsignadoActionPerformed(evt);
            }
        });

        jLabel2.setText("*Matéria Prima:");

        jLabel14.setText("Procedência:");

        txtGrupoLingLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoLingLivroConsignadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Data do Empréstimo:");

        jComboPaisLivroConsignado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------------", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Anguilla", "Antigua", "Arábia Saudita", "Argentina", "Armênia", "Aruba", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Bélgica", "Benin", "Bermudas", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burkina Fasso", "Botão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Cazaquistão", "Chade", "Chile", "China", "Cidade do Vaticano", "Colômbia", "Congo", "Coréia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Dinamarca", "Djibuti", "Dominica", "EUA", "Egito", "El Salvador", "Emirados Árabe", "Equador", "Eritréia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Gibraltar", "Granada", "Grécia", "Guadalupe", "Guam", "Guatemala", "Guiana", "Guiana Francesa", "Guiné-bissau", "Haiti", "Holanda", "Honduras", "Hong Kong", "Hungria", "Iêmen", "Ilhas Cayman", "Ilhas Cook", "Ilhas Curaçao", "Ilhas Marshall", "Ilhas Turks & Caicos", "Ilhas Virgens (brit.)", "lhas Virgens(amer.)", "Ilhas Wallis e Futuna", "Índia", "Indonésia", "Inglaterra", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Latvia", "Líbano", "Liechtenstein", "Lituânia", "Luxemburgo", "Macau", "Macedônia", "Madagascar", "Malásia", "Malaui", "Mali", "Malta", "Marrocos", "Martinica", "Mauritânia", "Mauritius", "México", "Moldova", "Mônaco", "Montserrat", "Nepal", "Nicarágua", "Niger", "Nigéria", "Noruega", "Nova Caledônia", "Nova Zelândia", "Omã", "Palau", "Panamá", "Papua-nova Guiné", "Paquistão", "Peru", "Polinésia Francesa", "Polônia", "Porto Rico", "Portugal", "Qatar", "Quênia", "Rep. Dominicana", "Rep. Tcheca", "Reunion", "Romênia", "Ruanda", "Rússia", "Saipan", "Samoa Americana", "Senegal", "Serra Leone", "Seychelles", "Singapura", "Síria", "Sri Lanka", "St. Kitts & Nevis", "St. Lúcia", "St. Vincent", "Sudão", "Suécia", "Suiça", "Suriname", "Tailândia", "Taiwan", "Tanzânia", "Togo", "Trinidad & Tobago", "Tunísia", "Turquia", "Ucrânia", "Uganda", "Uruguai", "Venezuela", "Vietnã", "Zaire", "Zâmbia", "Zimbábue" }));
        jComboPaisLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPaisLivroConsignadoActionPerformed(evt);
            }
        });

        jLabel9.setText("Função Específica:");

        jLabel1.setText("*Código Auxiliar:");

        jLabel16.setText("Sítio:");

        jLabel11.setText("Estilo:");

        jLabel15.setText("Região:");

        btnRegistrarDadosLivroConsignado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/cadastrar.png"))); // NOI18N
        btnRegistrarDadosLivroConsignado.setText("Salvar");
        btnRegistrarDadosLivroConsignado.setToolTipText("Registrar Dados");
        btnRegistrarDadosLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDadosLivroConsignadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoAuxiliarLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMateriaPrimaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuncaoEspecificaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCulturaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateDeUtilizacaoInicialLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateDeUtilizacaoFinalLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateEmprestimoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserDevolucaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstiloLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGrupoLingLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTecmanufaturaLivroConsignado1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProcedenciaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addComponent(txtRegiaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(137, 137, 137)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSitioLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jComboPaisLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(188, 312, Short.MAX_VALUE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResponsavelDaFamiliaLivroConsignado))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoDeObjetoLivroConsignado))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(btnRegistrarDadosLivroConsignado)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoAuxiliarLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMateriaPrimaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateEmprestimoLivroConsignado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooserDevolucaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResponsavelDaFamiliaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateDeUtilizacaoInicialLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateDeUtilizacaoFinalLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoDeObjetoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncaoEspecificaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCulturaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstiloLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrupoLingLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTecmanufaturaLivroConsignado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProcedenciaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegiaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSitioLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboPaisLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarDadosLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDados);

        txtCaminhoImagem.setText("caminhoDoArquivo");
        txtCaminhoImagem.setEnabled(false);

        txtBuscarImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/pesquisar.png"))); // NOI18N
        txtBuscarImagem.setToolTipText("Buscar Arquivo");
        txtBuscarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarImagemActionPerformed(evt);
            }
        });

        jLabel18.setText("Foto do Item:");

        btnRegistrarImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unipampa/view/icons/cadastrar.png"))); // NOI18N
        btnRegistrarImagem.setText("Registrar Imagem");
        btnRegistrarImagem.setToolTipText("Registrar Imagem para o Item");
        btnRegistrarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUploadDeImagemLayout = new javax.swing.GroupLayout(jPanelUploadDeImagem);
        jPanelUploadDeImagem.setLayout(jPanelUploadDeImagemLayout);
        jPanelUploadDeImagemLayout.setHorizontalGroup(
            jPanelUploadDeImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUploadDeImagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUploadDeImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanelUploadDeImagemLayout.createSequentialGroup()
                        .addComponent(txtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistrarImagem))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanelUploadDeImagemLayout.setVerticalGroup(
            jPanelUploadDeImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUploadDeImagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUploadDeImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarImagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelUploadDeImagem);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCulturaLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCulturaLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCulturaLivroConsignadoActionPerformed

    private void txtGrupoLingLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoLingLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoLingLivroConsignadoActionPerformed

    private void jComboPaisLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPaisLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPaisLivroConsignadoActionPerformed

    private void btnRegistrarDadosLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDadosLivroConsignadoActionPerformed
        if ((this.txtCodigoAuxiliarLivroConsignado.getText().isEmpty()
                || this.txtMateriaPrimaLivroConsignado.getText().isEmpty()
                || this.jDateChooserDevolucaoLivroConsignado.getDateFormatString().isEmpty()
                || this.txtResponsavelDaFamiliaLivroConsignado.getText().isEmpty()
                || this.txtTipoDeObjetoLivroConsignado.getText().isEmpty()) && (this.jDateDeUtilizacaoInicialLivroConsignado.getDate().after(this.jDateDeUtilizacaoFinalLivroConsignado.getDate())
                && this.jDateEmprestimoLivroConsignado.getDate().after(this.jDateChooserDevolucaoLivroConsignado.getDate()))) {
            GeradorDeMensagem.exibirMensagemDeInformacao("Por favor, preencha os campos marcados com '*', pois são obrigatórios. \n Também verifique a validade das datas!", "Alerta ao Usuário");
            return;
        } else {
            try {
                this.itemConsignado = new ItemConsignado();
                this.itemConsignado.setOutroCodigo(Integer.parseInt(this.txtCodigoAuxiliarLivroConsignado.getText()));
            } catch (NumberFormatException erroDeConversao) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");
                return;
            }

            this.itemConsignado.setMateriaPrima(this.txtMateriaPrimaLivroConsignado.getText());
            this.itemConsignado.setDataDoEmprestimo(this.jDateEmprestimoLivroConsignado.getDate());
            this.itemConsignado.setDataDeDevolucao(this.jDateChooserDevolucaoLivroConsignado.getDate());
            this.itemConsignado.setDataUtilizacaoInicial(this.jDateDeUtilizacaoInicialLivroConsignado.getDate());
            this.itemConsignado.setDataUtilizacaoFinal(this.jDateDeUtilizacaoFinalLivroConsignado.getDate());
            this.itemConsignado.setResponsavelDaFamilia(this.txtResponsavelDaFamiliaLivroConsignado.getText());
            this.itemConsignado.setEstilo(this.txtEstiloLivroConsignado.getText());
            this.itemConsignado.setGrupoLinguistico(this.txtGrupoLingLivroConsignado.getText());
            this.itemConsignado.setRegiao(this.txtRegiaoLivroConsignado.getText());
            Object dadosPais = this.jComboPaisLivroConsignado.getSelectedItem();
            this.itemConsignado.setPais(dadosPais.toString());
            this.itemConsignado.setProcedencia(this.txtProcedenciaLivroConsignado.getText());
            this.itemConsignado.setFuncaoEspecifica(this.txtFuncaoEspecificaLivroConsignado.getText());
            this.itemConsignado.setCultura(this.txtCulturaLivroConsignado.getText());
            this.itemConsignado.setSitio(this.txtSitioLivroConsignado.getText());
            this.itemConsignado.setTecnicaManufatura(this.txtTecmanufaturaLivroConsignado1.getText());
            this.itemConsignado.setTipoObjeto(this.txtTipoDeObjetoLivroConsignado.getText());
            this.itemConsignado.setImage(false);
            try {
                if (this.itemConsignado.salvar(this.itemConsignado)) {
                    GeradorDeMensagem.exibirMensagemDeInformacao("Os dados foram cadastrados com sucesso!", "Alerta ao Usuário");
                    GeradorDeMensagem.exibirMensagemDeInformacao("Envie agora uma foto do item de acervo!", "Alerta ao Usuário");
                    jPanelDados.setVisible(false);
                    jPanelUploadDeImagem.setVisible(true);
                    revalidate();
                    repaint();
                } else {
                    GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");
                }

            } catch (Exception erro1) {
                GeradorDeMensagem.exibirMensagemDeErro("Ocorreram alguns problemas, por favor realize a operação mais tarde!");
            }

        }
    }//GEN-LAST:event_btnRegistrarDadosLivroConsignadoActionPerformed

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

    private void btnRegistrarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarImagemActionPerformed
        boolean verificacao = UtilitariaDeUploadDeImagem.verificarArquivo(new File(this.txtCaminhoImagem.getText()));
        if (verificacao == true) {
            if (itemConsignado != null) {
                Long resultado = itemConsignado.recuperarID(itemConsignado);
                if (resultado != null) {
                    File fileArquivo = new File(this.txtCaminhoImagem.getText());
                    boolean resposta = UtilitariaDeUploadDeImagem.enviarArquivo(fileArquivo, resultado);
                    if (resposta) {
                        itemConsignado.setImage(true);
                        itemConsignado.setID(resultado);
                        itemConsignado.alterar(itemConsignado);
                        GeradorDeMensagem.exibirMensagemDeInformacao("Arquivo enviado com sucesso!", "Alerta ao Usuário");
                        boolean resposta2 = GeradorDeMensagem.exibirMensagemDeConfirmacao("Você deseja registrar um novo item?", "Alerta ao Usuário");
                        if (resposta2) {
                            dispose();
                            new FrameNovoLivroConsignado();
                        } else {
                            dispose();
                        }
                    } else {
                        GeradorDeMensagem.exibirMensagemDeErro("Ocorreu um problema, realize a operação novamente!");
                        
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarImagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarDadosLivroConsignado;
    private javax.swing.JButton btnRegistrarImagem;
    private javax.swing.JComboBox jComboPaisLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateChooserDevolucaoLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateDeUtilizacaoFinalLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateDeUtilizacaoInicialLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateEmprestimoLivroConsignado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelUploadDeImagem;
    private javax.swing.JButton txtBuscarImagem;
    private javax.swing.JTextField txtCaminhoImagem;
    private javax.swing.JFormattedTextField txtCodigoAuxiliarLivroConsignado;
    private javax.swing.JTextField txtCulturaLivroConsignado;
    private javax.swing.JTextField txtEstiloLivroConsignado;
    private javax.swing.JTextField txtFuncaoEspecificaLivroConsignado;
    private javax.swing.JTextField txtGrupoLingLivroConsignado;
    private javax.swing.JTextField txtMateriaPrimaLivroConsignado;
    private javax.swing.JTextField txtProcedenciaLivroConsignado;
    private javax.swing.JTextField txtRegiaoLivroConsignado;
    private javax.swing.JTextField txtResponsavelDaFamiliaLivroConsignado;
    private javax.swing.JTextField txtSitioLivroConsignado;
    private javax.swing.JTextField txtTecmanufaturaLivroConsignado1;
    private javax.swing.JTextField txtTipoDeObjetoLivroConsignado;
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
