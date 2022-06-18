
package telas;
import conexao.Conexao;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbData = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCalendar3 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        telaFundo = new javax.swing.JDesktopPane();
        jLabel14 = new javax.swing.JLabel();
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
        CadReserva = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        ConReserva = new javax.swing.JMenu();
        FinReserva = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Produtos1 = new javax.swing.JMenu();
        Servicos1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoDogHostelTela.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel3.setText("..Dog Hostel");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        lbData.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbData.setForeground(new java.awt.Color(0, 0, 255));
        lbData.setText("Horário do Sistema");
        lbData.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Usuário:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Cargo:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("N. Acesso:");
        jLabel7.setToolTipText("");

        jLabel8.setText("Nome");

        jLabel9.setText("texto");

        jLabel10.setText("texto");

        jCalendar2.setDecorationBackgroundVisible(false);
        jCalendar2.setDoubleBuffered(false);
        jCalendar2.setFocusable(false);
        jCalendar2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jCalendar2.setWeekOfYearVisible(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Check-out Hospede");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 0));
        jLabel12.setText("Check-in Hospede");

        jCalendar3.setDecorationBackgroundVisible(false);
        jCalendar3.setDoubleBuffered(false);
        jCalendar3.setFocusable(false);
        jCalendar3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jCalendar3.setWeekOfYearVisible(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("© Copyright | VINICIUS ORUAM RODRIGUES");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logout_37127.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbData)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(74, 74, 74))
                    .addComponent(jCalendar3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(64, 64, 64)))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbData)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(53, 53, 53))
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IMG-20220612-WA0006.jpg"))); // NOI18N
        jLabel14.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel14PropertyChange(evt);
            }
        });

        telaFundo.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout telaFundoLayout = new javax.swing.GroupLayout(telaFundo);
        telaFundo.setLayout(telaFundoLayout);
        telaFundoLayout.setHorizontalGroup(
            telaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, Short.MAX_VALUE)
        );
        telaFundoLayout.setVerticalGroup(
            telaFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 693, Short.MAX_VALUE)
        );

        jMenu11.setBackground(new java.awt.Color(204, 204, 204));
        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/snoopy_37462.png"))); // NOI18N
        jMenu11.setText("Cadastros|");
        jMenu11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu11.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenu12.setBackground(new java.awt.Color(204, 204, 204));
        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/haski_dog_animal_15968.png"))); // NOI18N
        jMenu12.setText("Hospedes");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuCadHospedes1.setBackground(new java.awt.Color(204, 204, 204));
        menuCadHospedes1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCadHospedes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dog+.png"))); // NOI18N
        menuCadHospedes1.setText("Cadastrar");
        menuCadHospedes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadHospedes1MouseClicked(evt);
            }
        });
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

        CadReserva.setBackground(new java.awt.Color(204, 204, 204));
        CadReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendarDog.png"))); // NOI18N
        CadReserva.setText("Reservas|");
        CadReserva.setToolTipText("");
        CadReserva.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addDate.png"))); // NOI18N
        jMenu1.setText("Cadastrar Reserva");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CadReserva.add(jMenu1);

        ConReserva.setBackground(new java.awt.Color(204, 204, 204));
        ConReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/searchDate.png"))); // NOI18N
        ConReserva.setText("Consultar Reserva");
        ConReserva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CadReserva.add(ConReserva);

        FinReserva.setBackground(new java.awt.Color(204, 204, 204));
        FinReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/okayDate.png"))); // NOI18N
        FinReserva.setText("Finalizar Reserva");
        FinReserva.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CadReserva.add(FinReserva);

        jMenuBar1.add(CadReserva);

        jMenu3.setBackground(new java.awt.Color(204, 204, 204));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Carrinho.png"))); // NOI18N
        jMenu3.setText("Consumo|");
        jMenu3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        Produtos1.setBackground(new java.awt.Color(204, 204, 204));
        Produtos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/household_chores_feeding_pet_feed_dog_food_icon_133347.png"))); // NOI18N
        Produtos1.setText("Produtos");
        Produtos1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.add(Produtos1);

        Servicos1.setBackground(new java.awt.Color(204, 204, 204));
        Servicos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pet-animal-pets-paw-dog-cat-paws_108559.png"))); // NOI18N
        Servicos1.setText("Servicos");
        Servicos1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.add(Servicos1);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(204, 204, 204));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Financial-Budget-Transparent-Background.png"))); // NOI18N
        jMenu4.setText("Financeiro|");
        jMenu4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pagar.png"))); // NOI18N
        jMenu2.setText("Contas à pagar");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenu4.add(jMenu2);

        jMenu9.setBackground(new java.awt.Color(204, 204, 204));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/receber.png"))); // NOI18N
        jMenu9.setText("Contas à receber");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem2.setText("jMenuItem2");
        jMenu9.add(jMenuItem2);

        jMenuItem4.setText("jMenuItem4");
        jMenu9.add(jMenuItem4);

        jMenu4.add(jMenu9);

        jMenu10.setBackground(new java.awt.Color(204, 204, 204));
        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balanco.png"))); // NOI18N
        jMenu10.setText("Balanço");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu4.add(jMenu10);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(204, 204, 204));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jMenu5.setText("Relatórios|");
        jMenu5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jMenu14.setText("jMenu14");
        jMenu5.add(jMenu14);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(telaFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaFundo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadHospedes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadHospedes1ActionPerformed
        TelaCadHospedes tela = new TelaCadHospedes();
        telaFundo.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_menuCadHospedes1ActionPerformed

    private void menuCadHospedes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadHospedes1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadHospedes1MouseClicked

    private void jLabel14PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel14PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14PropertyChange

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

		Date data = new Date();
		DateFormat formataData = DateFormat.getDateInstance(DateFormat.SHORT);
                lbData.setText(formataData.format(data));
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JMenu CadReserva;
    private javax.swing.JMenu ConReserva;
    private javax.swing.JMenu FinReserva;
    private javax.swing.JMenu Fornecedores;
    private javax.swing.JMenu Funcionarios;
    private javax.swing.JMenu Produtos;
    private javax.swing.JMenu Produtos1;
    private javax.swing.JMenu Servicos;
    private javax.swing.JMenu Servicos1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JCalendar jCalendar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbData;
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
    private javax.swing.JDesktopPane telaFundo;
    // End of variables declaration//GEN-END:variables

    private JLabel setText(String format) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
