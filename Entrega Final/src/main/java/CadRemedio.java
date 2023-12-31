//Nome: Stefano Calheiros Stringhini - RA: 2312123

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author win
 */
public class CadRemedio extends javax.swing.JFrame {
    private Medicamento remedio;
    private GerRem gerrem = new GerRem();
    /**
     * Creates new form CadRemedio
     */
    public CadRemedio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cxnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cxnomeclinico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cxcomposicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cxperiodo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cxpublico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cxsintomas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cxvalidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cxdisp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cxcodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cxpeso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cxpreco = new javax.swing.JTextField();
        BtSair = new javax.swing.JButton();
        BtCadastrar = new javax.swing.JButton();
        BtLimpar = new javax.swing.JButton();
        BtConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblMed = new javax.swing.JTable();
        BtAlterar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtDesconto = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro Medicamento:");

        jLabel2.setText("Nome:");

        cxnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxnomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome Clinico:");

        cxnomeclinico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxnomeclinicoActionPerformed(evt);
            }
        });

        jLabel4.setText("Composição:");

        cxcomposicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxcomposicaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Periodo de Uso:");

        cxperiodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxperiodoActionPerformed(evt);
            }
        });

        jLabel6.setText("Publico Alvo:");

        cxpublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxpublicoActionPerformed(evt);
            }
        });

        jLabel7.setText("Sintomas Recomendados:");

        cxsintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxsintomasActionPerformed(evt);
            }
        });

        jLabel8.setText("Validade (coloque na forma xxx/xx/xxxx):");

        cxvalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxvalidadeActionPerformed(evt);
            }
        });

        jLabel9.setText("Disponibilidade:");

        cxdisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxdispActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Codigo de Barra:");

        cxcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxcodigoActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Miligramas (apenas números):");

        cxpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxpesoActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("Preço:");

        cxpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxprecoActionPerformed(evt);
            }
        });

        BtSair.setText("Voltar");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });

        BtConsultar.setText("Consultar Codigo de Barra");
        BtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarActionPerformed(evt);
            }
        });

        TblMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo de Barra", "Nome", "Validade", "Preço"
            }
        ));
        jScrollPane2.setViewportView(TblMed);

        BtAlterar.setText("Alterar pelo Codigo de Barra");
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        BtExcluir.setText("Excluir pelo Codigo de Barra");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtDesconto.setText("Desconto");
        BtDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDescontoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxnomeclinico))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxcomposicao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxperiodo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxpublico))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxsintomas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxvalidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxdisp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxcodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxpeso))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxpreco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxnome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(BtSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(BtConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(BtAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(BtExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(BtDesconto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cxnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cxnomeclinico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cxcomposicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cxperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cxpublico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cxsintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cxvalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cxdisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cxcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cxpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cxpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadastrar)
                    .addComponent(BtConsultar)
                    .addComponent(BtAlterar)
                    .addComponent(BtExcluir)
                    .addComponent(BtDesconto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSair)
                    .addComponent(BtLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxnomeActionPerformed

    private void cxnomeclinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxnomeclinicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxnomeclinicoActionPerformed

    private void cxcomposicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxcomposicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxcomposicaoActionPerformed

    private void cxperiodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxperiodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxperiodoActionPerformed

    private void cxpublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxpublicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxpublicoActionPerformed

    private void cxsintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxsintomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxsintomasActionPerformed

    private void cxvalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxvalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxvalidadeActionPerformed

    private void cxdispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxdispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxdispActionPerformed

    private void cxcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxcodigoActionPerformed

    private void cxpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxpesoActionPerformed

    private void cxprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxprecoActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        sair();
    }//GEN-LAST:event_BtSairActionPerformed
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null,"Deseja Realmente Sair?","Exit",JOptionPane.YES_NO_OPTION);
        if(resp== 0) this.dispose();
    }
    
    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed
        cadastrar();
        listtabela();
    }//GEN-LAST:event_BtCadastrarActionPerformed

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        limpar();
    }//GEN-LAST:event_BtLimparActionPerformed
    
    private void limpar(){
        cxnome.setText("");
        cxnomeclinico.setText("");
        cxcomposicao.setText("");
        cxperiodo.setText("");
        cxpublico.setText("");
        cxsintomas.setText("");
        cxvalidade.setText("");
        cxdisp.setText("");
        cxcodigo.setText("");
        cxpeso.setText("");
        cxpreco.setText("");
    }
    
    private void BtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_BtConsultarActionPerformed

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
        alterar();
        listtabela();
        limpar();
    }//GEN-LAST:event_BtAlterarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        excluir();
        listtabela();
        limpar();
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDescontoActionPerformed
        desconto();
    }//GEN-LAST:event_BtDescontoActionPerformed
    
    public void desconto(){
     remedio = new Medicamento();
     try{
        remedio.setCodigoBarra(Integer.parseInt(cxcodigo.getText()));
        
        remedio = (Medicamento) gerrem.consProCod(remedio);
        
        if(remedio != null){
            cxpreco.setText(Integer.toString((int) remedio.getPreco()));
            
            JOptionPane.showMessageDialog(null,"Preço com Desconto: " +remedio.desconto(),"Desconto",1);
            limpar();
        }else{
            JOptionPane.showMessageDialog(null,"Não existe produto com esse codigo","Codigo Inexistente",1);
            limpar();
        
        }}catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"O Codigo de Barra deve ser um número inteiro!","Erro de Busca",0);
                cxcodigo.setText("");}
    
    }
    
    public void excluir(){
        remedio = new Medicamento();

            try{
            remedio.setCodigoBarra(Integer.parseInt(cxcodigo.getText()));

            remedio = (Medicamento) gerrem.consProCod(remedio);

            if(remedio != null){
                cxcodigo.setText(Integer.toString((int) remedio.getCodigoBarra()));
                cxpeso.setText(Integer.toString((int) remedio.getMiligramas()));
                cxpreco.setText(Integer.toString((int) remedio.getPreco()));

                cxnome.setText(remedio.getNome());
                cxnomeclinico.setText(remedio.getNomeClinico());
                cxcomposicao.setText(remedio.getComposicao());
                cxperiodo.setText(remedio.getPeriodoUso());
                cxpublico.setText(remedio.getPublicoAlvo());
                cxsintomas.setText(remedio.getSitRecomenda());
                cxvalidade.setText(remedio.getValidade());
                cxcomposicao.setText(remedio.getComposicao());
                cxdisp.setText(remedio.getDisponibilidade());
                int x = JOptionPane.showConfirmDialog(null,"Deseja realmente excluir?","Confirmação de Exclusão",JOptionPane.YES_NO_OPTION);
                    if(x==0){ 
                    gerrem.removeProCod(remedio);
                    JOptionPane.showMessageDialog(null,"Produto excluido com sucesso!","Exclusão concluida",1);
                    }

            }else{
                JOptionPane.showMessageDialog(null,"Não existe produto com esse codigo","Codigo Inexistente",1);
                limpar();

            }}catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"O Codigo de Barra deve ser um número inteiro!","Erro de Busca",0);
                    cxcodigo.setText("");

                    }
 
    }
    
    public void alterar(){
        remedio = new Medicamento();

            try{
            remedio.setCodigoBarra(Integer.parseInt(cxcodigo.getText()));

            remedio = (Medicamento) gerrem.atualizaProCod(remedio);

            if(remedio != null){
                cxcodigo.setText(Integer.toString((int) remedio.getCodigoBarra()));
                cxpeso.setText(Integer.toString((int) remedio.getMiligramas()));
                cxpreco.setText(Integer.toString((int) remedio.getPreco()));

                cxnome.setText(remedio.getNome());
                cxnomeclinico.setText(remedio.getNomeClinico());
                cxcomposicao.setText(remedio.getComposicao());
                cxperiodo.setText(remedio.getPeriodoUso());
                cxpublico.setText(remedio.getPublicoAlvo());
                cxsintomas.setText(remedio.getSitRecomenda());
                cxvalidade.setText(remedio.getValidade());
                cxdisp.setText(remedio.getDisponibilidade());
                JOptionPane.showMessageDialog(null,"Dados Atualizados!","Atualização de Dados",1);
                limpar();
            }else{
                JOptionPane.showMessageDialog(null,"Não existe produto com esse codigo","Codigo Inexistente",1);
                limpar();

            }}catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"O Codigo de Barra deve ser um número inteiro!","Erro de Busca",0);
                    cxcodigo.setText("");

                    }
    
    
    
    
    }
    
    public void consultar(){
        remedio = new Medicamento();
        
        try{
        remedio.setCodigoBarra(Integer.parseInt(cxcodigo.getText()));
        
        remedio = (Medicamento) gerrem.consProCod(remedio);
        
        if(remedio != null){
            cxcodigo.setText(Integer.toString((int) remedio.getCodigoBarra()));
            cxpeso.setText(Integer.toString((int) remedio.getMiligramas()));
            cxpreco.setText(Integer.toString((int) remedio.getPreco()));
            
            cxnome.setText(remedio.getNome());
            cxnomeclinico.setText(remedio.getNomeClinico());
            cxcomposicao.setText(remedio.getComposicao());
            cxperiodo.setText(remedio.getPeriodoUso());
            cxpublico.setText(remedio.getPublicoAlvo());
            cxsintomas.setText(remedio.getSitRecomenda());
            cxvalidade.setText(remedio.getValidade());
            cxdisp.setText(remedio.getDisponibilidade());
            JOptionPane.showMessageDialog(null,"Confirme os dados","Confimação",1);
            limpar();
        }else{
            JOptionPane.showMessageDialog(null,"Não existe produto com esse codigo","Codigo Inexistente",1);
            limpar();
        
        }}catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"O Codigo de Barra deve ser um número inteiro!","Erro de Busca",0);
                cxcodigo.setText("");
            
                }
    }
    
    public void listtabela(){
    DefaultTableModel modelo = (DefaultTableModel) TblMed.getModel();   
     int poslin = 0;
    
    modelo.setRowCount(poslin);
    
        for(Medicamento rem : gerrem.getBdRem()){
            modelo.insertRow(poslin, new Object []{rem.getCodigoBarra(),rem.getNome(),rem.getValidade(),rem.getPreco()});
            poslin++;

        }
        
        
    }
     
            
    public void cadastrar(){
    
    remedio = new Medicamento();
    try{
        
    remedio.setNome(cxnome.getText());
    remedio.setNomeClinico(cxnomeclinico.getText());
    remedio.setComposicao(cxcomposicao.getText());
    remedio.setPeriodoUso(cxperiodo.getText());
    remedio.setPublicoAlvo(cxpublico.getText());
    remedio.setSitRecomenda(cxsintomas.getText());
    remedio.setValidade(cxvalidade.getText());
    remedio.setDisponibilidade(cxdisp.getText());
    
    remedio.setCodigoBarra(Integer.parseInt(cxcodigo.getText()));
    remedio.setMiligramas(Integer.parseInt(cxpeso.getText()));
    remedio.setPreco(Integer.parseInt(cxpreco.getText()));
    
    remedio = (Medicamento) gerrem.cadPro(remedio);
    
        if(remedio != null){JOptionPane.showMessageDialog(null,"Produto cadastrado!","Cadastro", 1);} 
        limpar();
    
    }catch(NumberFormatException nfe){
        JOptionPane.showMessageDialog(null,"coloque apenas numeros inteiros\nonde estiver em vermelho!","ERRO NA ENTRADA!", 0);
        
    }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(CadRemedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadRemedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadRemedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadRemedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadRemedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtConsultar;
    private javax.swing.JButton BtDesconto;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtLimpar;
    private javax.swing.JButton BtSair;
    private javax.swing.JTable TblMed;
    private javax.swing.JTextField cxcodigo;
    private javax.swing.JTextField cxcomposicao;
    private javax.swing.JTextField cxdisp;
    private javax.swing.JTextField cxnome;
    private javax.swing.JTextField cxnomeclinico;
    private javax.swing.JTextField cxperiodo;
    private javax.swing.JTextField cxpeso;
    private javax.swing.JTextField cxpreco;
    private javax.swing.JTextField cxpublico;
    private javax.swing.JTextField cxsintomas;
    private javax.swing.JTextField cxvalidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
