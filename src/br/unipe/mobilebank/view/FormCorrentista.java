/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.view;

import br.unipe.mobilebank.controller.ControllerCorrentista;
import br.unipe.mobilebank.model.dao.ConexaoDAO;
import br.unipe.mobilebank.model.vo.Correntista;
import br.unipe.mobilebank.model.vo.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rodolfo
 */
public class FormCorrentista extends javax.swing.JFrame {

    public int pkcorrentista = 0;

    /**
     * Creates new form NewJFrame
     */
    public FormCorrentista() {
        initComponents();

        Correntista co = new Correntista();
        carregarDados(co);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSituacao = new javax.swing.ButtonGroup();
        grade1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeCorrentista = new javax.swing.JTextField();
        rgCorrentista = new javax.swing.JTextField();
        cpfCorrentista = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            cpfCorrentista = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "insira um cpf válido");
        }
        estadoCivilCorrentista = new javax.swing.JComboBox<>();
        sexoCorrentista = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gradeMatriculado = new javax.swing.JPanel();
        rsituacaoCorrentistaF = new javax.swing.JRadioButton();
        rsituacaoCorrentistaT = new javax.swing.JRadioButton();
        dtnascimento = new javax.swing.JFormattedTextField();
        dtCadastro = new javax.swing.JFormattedTextField();
        profissaoCorrentista = new javax.swing.JTextField();
        emailCorrentista = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        telefoneCorrentista = new javax.swing.JTextField();
        logradouroCorrentista = new javax.swing.JTextField();
        numeroCorrentista = new javax.swing.JTextField();
        bairroCorrentista = new javax.swing.JTextField();
        cidadeCorrentista = new javax.swing.JTextField();
        grade2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        estadoCorrentista = new javax.swing.JComboBox<>();
        cepCorrentista = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Gerenciamento Bancario - Mobile Bank");
        setResizable(false);

        grade1.setLayout(new java.awt.GridLayout(0, 5, 10, 0));

        jLabel1.setText("Nome Completo:");
        grade1.add(jLabel1);

        jLabel2.setText("RG");
        grade1.add(jLabel2);

        jLabel3.setText("CPF");
        grade1.add(jLabel3);

        jLabel4.setText("Estado Civil");
        grade1.add(jLabel4);

        jLabel5.setText("Sexo");
        grade1.add(jLabel5);
        grade1.add(nomeCorrentista);
        grade1.add(rgCorrentista);
        grade1.add(cpfCorrentista);

        estadoCivilCorrentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Viúvo", "União Estáve", "Divorciado" }));
        grade1.add(estadoCivilCorrentista);

        sexoCorrentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        grade1.add(sexoCorrentista);

        jLabel6.setText("Situacao (Matriculado)");
        grade1.add(jLabel6);

        jLabel7.setText("Data de Nasc.");
        grade1.add(jLabel7);

        jLabel8.setText("Data de Cadastro ");
        grade1.add(jLabel8);

        jLabel9.setText("Profissão");
        grade1.add(jLabel9);

        jLabel10.setText("Email");
        grade1.add(jLabel10);

        gradeMatriculado.setLayout(new java.awt.GridLayout(1, 0));

        GrupoSituacao.add(rsituacaoCorrentistaF);
        rsituacaoCorrentistaF.setText("Não");
        rsituacaoCorrentistaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsituacaoCorrentistaFActionPerformed(evt);
            }
        });
        gradeMatriculado.add(rsituacaoCorrentistaF);

        GrupoSituacao.add(rsituacaoCorrentistaT);
        rsituacaoCorrentistaT.setText("Sim");
        gradeMatriculado.add(rsituacaoCorrentistaT);

        grade1.add(gradeMatriculado);

        try {
            dtnascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        grade1.add(dtnascimento);

        try {
            dtCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        grade1.add(dtCadastro);
        grade1.add(profissaoCorrentista);
        grade1.add(emailCorrentista);

        jLabel11.setText("Telefone");
        grade1.add(jLabel11);

        jLabel12.setText("Logradouro");
        grade1.add(jLabel12);

        jLabel13.setText("Numero");
        grade1.add(jLabel13);

        jLabel14.setText("Bairro");
        grade1.add(jLabel14);

        jLabel15.setText("Cidade");
        grade1.add(jLabel15);
        grade1.add(telefoneCorrentista);
        grade1.add(logradouroCorrentista);
        grade1.add(numeroCorrentista);
        grade1.add(bairroCorrentista);
        grade1.add(cidadeCorrentista);

        grade2.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        jLabel16.setText("Estado");
        grade2.add(jLabel16);

        jLabel17.setText("CEP");
        grade2.add(jLabel17);

        estadoCorrentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PB", "PE", "RS", "SP" }));
        grade2.add(estadoCorrentista);
        grade2.add(cepCorrentista);

        observacao.setColumns(20);
        observacao.setRows(5);
        jScrollPane1.setViewportView(observacao);

        jLabel18.setText("Observações");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(grade1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(grade2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnSalvar)
                        .addGap(37, 37, 37)
                        .addComponent(btnAtualizar)
                        .addGap(25, 25, 25)
                        .addComponent(btnCancelar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(grade1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(grade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel18)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        char i = 'N';
        Correntista co = new Correntista();
        co.setCorrentistaNome(nomeCorrentista.getText());
        co.setCorrentistaRG(rgCorrentista.getText());
        co.setCorrentistaCPF(cpfCorrentista.getText());
        co.setCorrentistaEstCivil(estadoCivilCorrentista.getModel().getSelectedItem().toString());
        co.setCorrentistaSexo(sexoCorrentista.getModel().getSelectedItem().toString());
        co.setCorrentistaDtNasc(dtnascimento.getText());
        co.setCorrentistaDtCadBanco(dtCadastro.getText());
        co.setCorrentistaProfissao(profissaoCorrentista.getText());
        co.setCorrentistaEmail(emailCorrentista.getText());
        co.setCorrentistaTelefone(telefoneCorrentista.getText());
        if (rsituacaoCorrentistaT.isSelected()) {
            i = 'M';
        } else {
            i = 'N';
        }
        co.setCorrentistaSituacao(i);
        Endereco end = new Endereco();
        end.setLogradouro(logradouroCorrentista.getText());
        end.setNumero(numeroCorrentista.getText());
        end.setBairro(bairroCorrentista.getText());
        end.setCidade(cidadeCorrentista.getText());
        end.setEstado(estadoCorrentista.getModel().getSelectedItem().toString());
        end.setCep(cepCorrentista.getText());
        co.setCorrentistaEndereco(end);
        co.setCorrentistaObservacao(observacao.getText());
        ControllerCorrentista CC = new ControllerCorrentista();
        CC.cadastroCorrentista(co);
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void rsituacaoCorrentistaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsituacaoCorrentistaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rsituacaoCorrentistaFActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        char i = 'N';
        Correntista co = new Correntista();
        co.setCorrentistaNome(nomeCorrentista.getText());
        co.setCorrentistaRG(rgCorrentista.getText());
        co.setCorrentistaCPF(cpfCorrentista.getText());
        co.setCorrentistaEstCivil(estadoCivilCorrentista.getModel().getSelectedItem().toString());
        co.setCorrentistaSexo(sexoCorrentista.getModel().getSelectedItem().toString());
        co.setCorrentistaDtNasc(dtnascimento.getText());
        co.setCorrentistaDtCadBanco(dtCadastro.getText());
        co.setCorrentistaProfissao(profissaoCorrentista.getText());
        co.setCorrentistaEmail(emailCorrentista.getText());
        co.setCorrentistaTelefone(telefoneCorrentista.getText());
        if (rsituacaoCorrentistaT.isSelected()) {
            i = 'M';
        } else {
            i = 'N';
        }
        co.setCorrentistaSituacao(i);
        Endereco end = new Endereco();
        end.setLogradouro(logradouroCorrentista.getText());
        end.setNumero(numeroCorrentista.getText());
        end.setBairro(bairroCorrentista.getText());
        end.setCidade(cidadeCorrentista.getText());
        end.setEstado(estadoCorrentista.getModel().getSelectedItem().toString());
        end.setCep(cepCorrentista.getText());
        co.setCorrentistaEndereco(end);
        co.setCorrentistaObservacao(observacao.getText());
        co.setCorrentistaPK(pkcorrentista);
        ControllerCorrentista CC = new ControllerCorrentista();
        CC.atualizaCorrentista(co);
        dispose();

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCorrentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCorrentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCorrentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCorrentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCorrentista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoSituacao;
    private javax.swing.JTextField bairroCorrentista;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cepCorrentista;
    private javax.swing.JTextField cidadeCorrentista;
    private javax.swing.JTextField cpfCorrentista;
    private javax.swing.JFormattedTextField dtCadastro;
    private javax.swing.JFormattedTextField dtnascimento;
    private javax.swing.JTextField emailCorrentista;
    private javax.swing.JComboBox<String> estadoCivilCorrentista;
    private javax.swing.JComboBox<String> estadoCorrentista;
    private javax.swing.JPanel grade1;
    private javax.swing.JPanel grade2;
    private javax.swing.JPanel gradeMatriculado;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField logradouroCorrentista;
    private javax.swing.JTextField nomeCorrentista;
    private javax.swing.JTextField numeroCorrentista;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTextField profissaoCorrentista;
    private javax.swing.JTextField rgCorrentista;
    private javax.swing.JRadioButton rsituacaoCorrentistaF;
    private javax.swing.JRadioButton rsituacaoCorrentistaT;
    private javax.swing.JComboBox<String> sexoCorrentista;
    private javax.swing.JTextField telefoneCorrentista;
    // End of variables declaration//GEN-END:variables

    public boolean carregarDados(Correntista co) {

        boolean a = false;
        char i = 'N';

        if (co != null) {

            try {

                String exibirSQL = "SELECT * FROM correntista WHERE correntista_pk = ?";

                PreparedStatement exibir = ConexaoDAO.getInstance().getConexao().prepareStatement(exibirSQL);
                exibir.setInt(1, co.getCorrentistaPK());

                ResultSet rs = exibir.executeQuery();

                while (rs.next()) {
                    co.setCorrentistaNome(rs.getString("correntista_nome"));
                    co.setCorrentistaRG(rs.getString("correntista_rg"));
                    co.setCorrentistaCPF(rs.getString("correntista_cpf"));
                    co.setCorrentistaEstCivil(rs.getString("correntista_est_civil"));
                    co.setCorrentistaSexo(rs.getString("correntista_sexo"));
                    co.setCorrentistaSituacao(rs.getString("correntista_situacao").charAt(0));
                    co.setCorrentistaDtNasc(rs.getString("correntista_dt_nasc"));
                    co.setCorrentistaDtCadBanco(rs.getString("correntista_dt_cad"));
                    co.setCorrentistaProfissao(rs.getString("correntista_profissao"));
                    co.setCorrentistaEmail(rs.getString("correntista_email"));
                    co.setCorrentistaTelefone(rs.getString("correntista_telefone"));

                    Endereco end = new Endereco();

                    end.setLogradouro(rs.getString("correntista_logradouro"));
                    end.setNumero(rs.getString("correntista_numero_casa"));
                    end.setBairro(rs.getString("correntista_bairro"));
                    end.setCidade(rs.getString("correntista_cidade"));
                    end.setEstado(rs.getString("correntista_estado"));
                    end.setCep(rs.getString("correntista_cep"));

                    co.setCorrentistaEndereco(end);

                    co.setCorrentistaObservacao(rs.getString("correntista_observacoes"));
                    co.setCorrentistaPK(rs.getInt("correntista_pk"));

                    nomeCorrentista.setText(co.getCorrentistaNome());
                    rgCorrentista.setText(co.getCorrentistaRG());
                    cpfCorrentista.setText(co.getCorrentistaCPF());
                    estadoCivilCorrentista.setSelectedItem(co.getCorrentistaEstCivil());
                    sexoCorrentista.setSelectedItem(co.getCorrentistaSexo());
                    dtnascimento.setText(co.getCorrentistaDtNasc());
                    if (co.getCorrentistaSituacao() == 'M') {
                        rsituacaoCorrentistaT.setSelected(true);
                    } else {
                        rsituacaoCorrentistaF.setSelected(true);
                    }
                    dtCadastro.setText(co.getCorrentistaDtCadBanco());
                    profissaoCorrentista.setText(co.getCorrentistaProfissao());
                    emailCorrentista.setText(co.getCorrentistaEmail());
                    telefoneCorrentista.setText(co.getCorrentistaTelefone());
                    logradouroCorrentista.setText(co.getCorrentistaEndereco().getLogradouro());
                    numeroCorrentista.setText(co.getCorrentistaEndereco().getNumero());
                    bairroCorrentista.setText(co.getCorrentistaEndereco().getBairro());
                    cidadeCorrentista.setText(co.getCorrentistaEndereco().getCidade());
                    estadoCorrentista.setSelectedItem(co.getCorrentistaEndereco().getEstado());
                    cepCorrentista.setText(co.getCorrentistaEndereco().getCep());
                    observacao.setText(co.getCorrentistaObservacao());
                    pkcorrentista = co.getCorrentistaPK();
                }

            } catch (SQLException e) {

                e.getMessage();

            }

            a = true;
        } else {
            a = false;
        }
        return a;

    }

}
