/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author exact
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        menuCadHospedes1 = new javax.swing.JMenuItem();
        menuConHospedes = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        menuCadQuartos = new javax.swing.JMenuItem();
        menuConQuartos = new javax.swing.JMenuItem();
        Funcionarios = new javax.swing.JMenu();
        menuCadFuncionarios = new javax.swing.JMenuItem();
        menuConFuncionarios = new javax.swing.JMenuItem();
        Fornecedores = new javax.swing.JMenu();
        menuCadFornecedores = new javax.swing.JMenuItem();
        menuConFornecedores = new javax.swing.JMenuItem();
        Produtos = new javax.swing.JMenu();
        menuCadProdutos = new javax.swing.JMenuItem();
        menuConProdutos = new javax.swing.JMenuItem();
        Servicos = new javax.swing.JMenu();
        menuCadServicos = new javax.swing.JMenuItem();
        menuConServicos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu11.setBackground(new java.awt.Color(204, 204, 204));
        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/snoopy_37462.png"))); // NOI18N
        jMenu11.setText("Cadastros|");
        jMenu11.setActionCommand("Cadastros|");
        jMenu11.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenu12.setBackground(new java.awt.Color(204, 204, 204));
        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/haski_dog_animal_15968.png"))); // NOI18N
        jMenu12.setText("Hospedes");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuCadHospedes1.setBackground(new java.awt.Color(204, 204, 204));
        menuCadHospedes1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCadHospedes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dog+.png"))); // NOI18N
        menuCadHospedes1.setText("Cadastrar");
        menuCadHospedes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadHospedes1ActionPerformed(evt);
            }
        });
        jMenu12.add(menuCadHospedes1);

        menuConHospedes.setBackground(new java.awt.Color(204, 204, 204));
        menuConHospedes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuConHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/viewmag_view_search_find_11032.png"))); // NOI18N
        menuConHospedes.setText("Consultar");
        jMenu12.add(menuConHospedes);

        jMenu11.add(jMenu12);

        jMenu13.setBackground(new java.awt.Color(204, 204, 204));
        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/place-dog-house-building-landmark_108515.png"))); // NOI18N
        jMenu13.setText("Quartos");
        jMenu13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuCadQuartos.setBackground(new java.awt.Color(204, 204, 204));
        menuCadQuartos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCadQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addhouse.png"))); // NOI18N
        menuCadQuartos.setText("Cadastrar");
        jMenu13.add(menuCadQuartos);

        menuConQuartos.setBackground(new java.awt.Color(204, 204, 204));
        menuConQuartos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuConQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/viewmag_view_search_find_11032.png"))); // NOI18N
        menuConQuartos.setText("Consultar");
        jMenu13.add(menuConQuartos);

        jMenu11.add(jMenu13);

        Funcionarios.setBackground(new java.awt.Color(204, 204, 204));
        Funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1488492660-people10_81753.png"))); // NOI18N
        Funcionarios.setText("Funcionarios");
        Funcionarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuCadFuncionarios.setBackground(new java.awt.Color(204, 204, 204));
        menuCadFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCadFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addfunc.png"))); // NOI18N
        menuCadFuncionarios.setText("Cadastrar");
        Funcionarios.add(menuCadFuncionarios);

        menuConFuncionarios.setBackground(new java.awt.Color(204, 204, 204));
        menuConFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuConFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/viewmag_view_search_find_11032.png"))); // NOI18N
        menuConFuncionarios.setText("Consultar");
        Funcionarios.add(menuConFuncionarios);

        jMenu11.add(Funcionarios);

        Fornecedores.setBackground(new java.awt.Color(204, 204, 204));
        Fornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/truck_icon-icons.com_52347.png"))); // NOI18N
        Fornecedores.setText("Fornecedores");
        Fornecedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuCadFornecedores.setBackground(new java.awt.Color(204, 204, 204));
        menuCadFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCadFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/truck+.png"))); // NOI18N
        menuCadFornecedores.setText("Cadastrar");
        Fornecedores.add(menuCadFornecedores);

        menuConFornecedores.setBackground(new java.awt.Color(204, 204, 204));
        menuConFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuConFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/viewmag_view_search_find_11032.png"))); // NOI18N
        menuConFornecedores.setText("Consultar");
        Fornecedores.add(menuConFornecedores);

        jMenu11.add(Fornecedores);

        Produtos.setBackground(new java.awt.Color(204, 204, 204));
        Produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/household_chores_feeding_pet_feed_dog_food_icon_133347.png"))); // NOI18N
        Produtos.setText("Produtos");
        Produtos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuCadProdutos.setBackground(new java.awt.Color(204, 204, 204));
        menuCadProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCadProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/osso+.png"))); // NOI18N
        menuCadProdutos.setText("Cadastrar");
        Produtos.add(menuCadProdutos);

        menuConProdutos.setBackground(new java.awt.Color(204, 204, 204));
        menuConProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuConProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/viewmag_view_search_find_11032.png"))); // NOI18N
        menuConProdutos.setText("Consultar");
        Produtos.add(menuConProdutos);

        jMenu11.add(Produtos);

        Servicos.setBackground(new java.awt.Color(204, 204, 204));
        Servicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pet-animal-pets-paw-dog-cat-paws_108559.png"))); // NOI18N
        Servicos.setText("Servicos");
        Servicos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuCadServicos.setBackground(new java.awt.Color(204, 204, 204));
        menuCadServicos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCadServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dogBanhopng.png"))); // NOI18N
        menuCadServicos.setText("Cadastrar");
        Servicos.add(menuCadServicos);

        menuConServicos.setBackground(new java.awt.Color(204, 204, 204));
        menuConServicos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuConServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/viewmag_view_search_find_11032.png"))); // NOI18N
        menuConServicos.setText("Consultar");
        Servicos.add(menuConServicos);

        jMenu11.add(Servicos);

        jMenuBar1.add(jMenu11);

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendarDog.png"))); // NOI18N
        jMenu2.setText("Reservas   |");
        jMenu2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consumo   |");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Financeiro   |");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Relatórios   |");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Segurança   |");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ferramentas   |");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Sair");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadHospedes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadHospedes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadHospedes1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Fornecedores;
    private javax.swing.JMenu Funcionarios;
    private javax.swing.JMenu Produtos;
    private javax.swing.JMenu Servicos;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCadFornecedores;
    private javax.swing.JMenuItem menuCadFuncionarios;
    private javax.swing.JMenuItem menuCadHospedes1;
    private javax.swing.JMenuItem menuCadProdutos;
    private javax.swing.JMenuItem menuCadQuartos;
    private javax.swing.JMenuItem menuCadServicos;
    private javax.swing.JMenuItem menuConFornecedores;
    private javax.swing.JMenuItem menuConFuncionarios;
    private javax.swing.JMenuItem menuConHospedes;
    private javax.swing.JMenuItem menuConProdutos;
    private javax.swing.JMenuItem menuConQuartos;
    private javax.swing.JMenuItem menuConServicos;
    // End of variables declaration//GEN-END:variables
}