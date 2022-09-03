
package finalprojectgui;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


public class MainFrame extends javax.swing.JFrame {

    CardLayout cardLayout; 
    SerialPort chosenSerialPort;
    String photoLink = "E:\\4 th computer endineering\\computer interface\\Lap\\experiment assignment\\Final Project\\FinalProjectGUI\\assets\\";
    
    public MainFrame() {
        initComponents();
        cardLayout = (CardLayout) JPanel_content.getLayout();
        //change the option pane color
        UIManager.put("control", new ColorUIResource(150,187,124));
        //create default values
        jComboBox_comPort.setEnabled(true);
        jComboBox_baudRate.setSelectedItem("9600");
        jComboBox_dataBits.setSelectedItem("8");
        jComboBox_stopBits.setSelectedItem("1");
        jComboBox_parityBits.setSelectedItem("NO_PARITY");
        jProgressBar_comStatus.setValue(0);
        jButton_connect.setEnabled(true);
        jButton_disconnect.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_base = new javax.swing.JPanel();
        JPanel_sideBar = new javax.swing.JPanel();
        JButton_serialPort = new javax.swing.JButton();
        JButton_irrigationInfo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JPanel_content = new javax.swing.JPanel();
        JPanel_serialPort = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_comPort = new javax.swing.JComboBox<>();
        jComboBox_baudRate = new javax.swing.JComboBox<>();
        jComboBox_dataBits = new javax.swing.JComboBox<>();
        jComboBox_stopBits = new javax.swing.JComboBox<>();
        jComboBox_parityBits = new javax.swing.JComboBox<>();
        jProgressBar_comStatus = new javax.swing.JProgressBar();
        jButton_connect = new javax.swing.JButton();
        jButton_disconnect = new javax.swing.JButton();
        JPanel_irrigationInfo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_soilMoisureReading = new javax.swing.JLabel();
        jLabel_pumpState = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automatic Irrigation System");
        setIconImage(Toolkit.getDefaultToolkit().getImage(photoLink+"irrigation_hover.png"));
        setResizable(false);

        JPanel_base.setBackground(new java.awt.Color(150, 187, 124));

        JPanel_sideBar.setBackground(new java.awt.Color(6, 70, 53));

        JButton_serialPort.setBackground(new java.awt.Color(255, 255, 255));
        JButton_serialPort.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JButton_serialPort.setForeground(new java.awt.Color(204, 204, 204));
        JButton_serialPort.setIcon(new javax.swing.ImageIcon("E:\\4 th computer endineering\\computer interface\\Lap\\experiment assignment\\Final Project\\FinalProjectGUI\\assets\\serial_norm.png")); // NOI18N
        JButton_serialPort.setText("Serial Port");
        JButton_serialPort.setBorderPainted(false);
        JButton_serialPort.setContentAreaFilled(false);
        JButton_serialPort.setFocusPainted(false);
        JButton_serialPort.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButton_serialPort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JButton_serialPortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JButton_serialPortMouseExited(evt);
            }
        });
        JButton_serialPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_serialPortActionPerformed(evt);
            }
        });

        JButton_irrigationInfo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JButton_irrigationInfo.setForeground(new java.awt.Color(204, 204, 204));
        JButton_irrigationInfo.setIcon(new javax.swing.ImageIcon("E:\\4 th computer endineering\\computer interface\\Lap\\experiment assignment\\Final Project\\FinalProjectGUI\\assets\\irrigation_norm.png")); // NOI18N
        JButton_irrigationInfo.setText("Irrigation Info");
        JButton_irrigationInfo.setBorderPainted(false);
        JButton_irrigationInfo.setContentAreaFilled(false);
        JButton_irrigationInfo.setFocusPainted(false);
        JButton_irrigationInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JButton_irrigationInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JButton_irrigationInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JButton_irrigationInfoMouseExited(evt);
            }
        });
        JButton_irrigationInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_irrigationInfoActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\4 th computer endineering\\computer interface\\Lap\\experiment assignment\\Final Project\\FinalProjectGUI\\assets\\irrigationSystem.png")); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout JPanel_sideBarLayout = new javax.swing.GroupLayout(JPanel_sideBar);
        JPanel_sideBar.setLayout(JPanel_sideBarLayout);
        JPanel_sideBarLayout.setHorizontalGroup(
            JPanel_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_sideBarLayout.createSequentialGroup()
                .addComponent(JButton_irrigationInfo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(JButton_serialPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPanel_sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_sideBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(39, 39, 39))
        );
        JPanel_sideBarLayout.setVerticalGroup(
            JPanel_sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButton_serialPort, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButton_irrigationInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel_content.setBackground(new java.awt.Color(150, 187, 124));
        JPanel_content.setLayout(new java.awt.CardLayout());

        JPanel_serialPort.setBackground(new java.awt.Color(150, 187, 124));

        jPanel5.setBackground(new java.awt.Color(150, 187, 124));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COM PORT SETTINGS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("COM PORT");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("BAUD RATE");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("DATA BITS");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("STOP BITS");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("PARITY BITS");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("COM STATUS");

        jComboBox_comPort.setBackground(new java.awt.Color(150, 187, 124));
        jComboBox_comPort.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jComboBox_comPort.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_comPortPopupMenuWillBecomeVisible(evt);
            }
        });

        jComboBox_baudRate.setBackground(new java.awt.Color(150, 187, 124));
        jComboBox_baudRate.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jComboBox_baudRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4800", "9600", "38400", "57600", "115200" }));

        jComboBox_dataBits.setBackground(new java.awt.Color(150, 187, 124));
        jComboBox_dataBits.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jComboBox_dataBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9" }));

        jComboBox_stopBits.setBackground(new java.awt.Color(150, 187, 124));
        jComboBox_stopBits.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jComboBox_stopBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jComboBox_parityBits.setBackground(new java.awt.Color(150, 187, 124));
        jComboBox_parityBits.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jComboBox_parityBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO_PARITY", "EVEN_PARITY", "ODD_PARITY", "MARK_PARITY", "SPACE_PARITY" }));

        jProgressBar_comStatus.setBackground(new java.awt.Color(150, 187, 124));

        jButton_connect.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton_connect.setText("CONNECT");
        jButton_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_connectActionPerformed(evt);
            }
        });

        jButton_disconnect.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton_disconnect.setText("DISCONNECT");
        jButton_disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_disconnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_parityBits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.Alignment.LEADING, 0, 110, Short.MAX_VALUE)
                        .addComponent(jComboBox_comPort, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox_stopBits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_baudRate, 0, 87, Short.MAX_VALUE)
                    .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton_connect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton_disconnect)
                .addGap(88, 88, 88))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox_stopBits, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox_parityBits, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_connect, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_disconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout JPanel_serialPortLayout = new javax.swing.GroupLayout(JPanel_serialPort);
        JPanel_serialPort.setLayout(JPanel_serialPortLayout);
        JPanel_serialPortLayout.setHorizontalGroup(
            JPanel_serialPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        JPanel_serialPortLayout.setVerticalGroup(
            JPanel_serialPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JPanel_content.add(JPanel_serialPort, "serial_port_card");

        JPanel_irrigationInfo.setBackground(new java.awt.Color(150, 187, 124));
        JPanel_irrigationInfo.setPreferredSize(new java.awt.Dimension(422, 254));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("SOIL MOISTURE");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("PUMP STATE");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon("E:\\4 th computer endineering\\computer interface\\Lap\\experiment assignment\\Final Project\\FinalProjectGUI\\assets\\soilMoisture.png")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\4 th computer endineering\\computer interface\\Lap\\experiment assignment\\Final Project\\FinalProjectGUI\\assets\\pump.png")); // NOI18N

        jLabel_soilMoisureReading.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel_soilMoisureReading.setForeground(new java.awt.Color(6, 70, 53));
        jLabel_soilMoisureReading.setText("100");

        jLabel_pumpState.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel_pumpState.setForeground(new java.awt.Color(6, 70, 53));
        jLabel_pumpState.setText("OFF");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(6, 70, 53));
        jLabel14.setText("%");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        javax.swing.GroupLayout JPanel_irrigationInfoLayout = new javax.swing.GroupLayout(JPanel_irrigationInfo);
        JPanel_irrigationInfo.setLayout(JPanel_irrigationInfoLayout);
        JPanel_irrigationInfoLayout.setHorizontalGroup(
            JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_irrigationInfoLayout.createSequentialGroup()
                .addGroup(JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_irrigationInfoLayout.createSequentialGroup()
                        .addGroup(JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_irrigationInfoLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel_soilMoisureReading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14))
                            .addGroup(JPanel_irrigationInfoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7)))
                        .addGap(26, 26, 26))
                    .addGroup(JPanel_irrigationInfoLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JPanel_irrigationInfoLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_irrigationInfoLayout.createSequentialGroup()
                        .addComponent(jLabel_pumpState)
                        .addGap(42, 42, 42)))
                .addGap(48, 48, 48))
        );
        JPanel_irrigationInfoLayout.setVerticalGroup(
            JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_irrigationInfoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7))
                .addGroup(JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_irrigationInfoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_irrigationInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_soilMoisureReading)
                            .addComponent(jLabel14)))
                    .addGroup(JPanel_irrigationInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_pumpState)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_irrigationInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanel_content.add(JPanel_irrigationInfo, "irrigation_info_card");

        javax.swing.GroupLayout JPanel_baseLayout = new javax.swing.GroupLayout(JPanel_base);
        JPanel_base.setLayout(JPanel_baseLayout);
        JPanel_baseLayout.setHorizontalGroup(
            JPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_baseLayout.createSequentialGroup()
                .addComponent(JPanel_sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel_content, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
        );
        JPanel_baseLayout.setVerticalGroup(
            JPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanel_sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_serialPortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_serialPortMouseEntered
        // TODO add your handling code here:
        JButton_serialPort.setForeground(new Color(150,187,124));
        JButton_serialPort.setIcon(new ImageIcon(photoLink + "serial_hover.png"));
    }//GEN-LAST:event_JButton_serialPortMouseEntered

    private void JButton_serialPortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_serialPortMouseExited
        // TODO add your handling code here:
        JButton_serialPort.setForeground(new Color(204,204,204));
        JButton_serialPort.setIcon(new ImageIcon(photoLink + "serial_norm.png"));
    }//GEN-LAST:event_JButton_serialPortMouseExited

    private void JButton_serialPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_serialPortActionPerformed
        // TODO add your handlig code here:
        cardLayout.show(JPanel_content, "serial_port_card");
    }//GEN-LAST:event_JButton_serialPortActionPerformed

    private void JButton_irrigationInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_irrigationInfoMouseEntered
        // TODO add your handling code here:
        JButton_irrigationInfo.setForeground(new Color(150,187,124));
        JButton_irrigationInfo.setIcon(new ImageIcon(photoLink + "irrigation_hover.png"));
    }//GEN-LAST:event_JButton_irrigationInfoMouseEntered

    private void JButton_irrigationInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_irrigationInfoMouseExited
        // TODO add your handling code here:
        JButton_irrigationInfo.setForeground(new Color(204,204,204));
        JButton_irrigationInfo.setIcon(new ImageIcon(photoLink + "irrigation_norm.png"));
    }//GEN-LAST:event_JButton_irrigationInfoMouseExited

    private void JButton_irrigationInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_irrigationInfoActionPerformed
        // TODO add your handling code here:
        cardLayout.show(JPanel_content, "irrigation_info_card");
    }//GEN-LAST:event_JButton_irrigationInfoActionPerformed

    private void jComboBox_comPortPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_comPortPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        jComboBox_comPort.removeAllItems();
        SerialPort [] portList = SerialPort.getCommPorts();
        for (SerialPort serialPort : portList) {
            jComboBox_comPort.addItem(serialPort.getSystemPortName());
        }
    }//GEN-LAST:event_jComboBox_comPortPopupMenuWillBecomeVisible

    private void jButton_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_connectActionPerformed
        // TODO add your handling code here:
        try {
            SerialPort [] portList = SerialPort.getCommPorts();
            chosenSerialPort = portList[jComboBox_comPort.getSelectedIndex()];
            chosenSerialPort.setBaudRate(Integer.parseInt(jComboBox_baudRate.getSelectedItem().toString()));
            chosenSerialPort.setNumDataBits(Integer.parseInt(jComboBox_dataBits.getSelectedItem().toString()));
            chosenSerialPort.setNumStopBits(Integer.parseInt(jComboBox_stopBits.getSelectedItem().toString()));
            chosenSerialPort.setParity(jComboBox_parityBits.getSelectedIndex());

            chosenSerialPort.openPort();
            if (chosenSerialPort.isOpen()) {
                JOptionPane.showMessageDialog(this,chosenSerialPort.getDescriptivePortName() + " -- Success to OPEN !");
                jComboBox_comPort.setEnabled(false);
                jComboBox_baudRate.setEnabled(false);
                jComboBox_dataBits.setEnabled(false);
                jComboBox_stopBits.setEnabled(false);
                jComboBox_parityBits.setEnabled(false);
                jProgressBar_comStatus.setValue(100);
                jButton_connect.setEnabled(false);
                jButton_disconnect.setEnabled(true);

                serial_EventBasedReading(chosenSerialPort);
            }
            else {
                JOptionPane.showMessageDialog(this,chosenSerialPort.getDescriptivePortName() + " -- Failed to OPEN !");
            }
        }
        catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this,"Please choose COM PORT","ERROR",ERROR_MESSAGE);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage(),"ERROR",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_connectActionPerformed

    private void jButton_disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_disconnectActionPerformed
        // TODO add your handling code here:
        if (chosenSerialPort.isOpen()) {
            chosenSerialPort.closePort();
            jComboBox_comPort.setEnabled(true);
            jComboBox_baudRate.setEnabled(true);
            jComboBox_dataBits.setEnabled(true);
            jComboBox_stopBits.setEnabled(true);
            jComboBox_parityBits.setEnabled(true);
            jProgressBar_comStatus.setValue(0);
            jButton_connect.setEnabled(true);
            jButton_disconnect.setEnabled(false);
        }
    }//GEN-LAST:event_jButton_disconnectActionPerformed

    private void serial_EventBasedReading(SerialPort serialPort){
        
        serialPort.addDataListener(new SerialPortDataListener() {
            @Override
            public int getListeningEvents() {
                return serialPort.LISTENING_EVENT_DATA_RECEIVED;
            }

            @Override
            public void serialEvent(SerialPortEvent spe) {
                
                byte []newData = spe.getReceivedData();
                for (int i = 0; i < newData.length; i++) {
                    System.out.println(getSoilMoistureReading(Byte.toUnsignedInt(newData[i])));
                    jLabel_soilMoisureReading.setText(Integer.toString(getSoilMoistureReading(Byte.toUnsignedInt(newData[i]))));
                    
                    if(getPumpState(Byte.toUnsignedInt(newData[i])) == Boolean.TRUE){
                        jLabel_pumpState.setText("ON");
                    }
                    else{
                        jLabel_pumpState.setText("OFF");
                    }
                }
                
            }
        });
    }
    private Integer getSoilMoistureReading(Integer receivedData){
       return receivedData&(~(1<<7));
   }
    private Boolean getPumpState(Integer receivedData){
        Boolean pump_state;
        if ((receivedData&(1<<7))>>7 == 1) {
            pump_state = Boolean.TRUE;
        }
        else {
            pump_state = Boolean.FALSE;
        }
       return pump_state;
   }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_irrigationInfo;
    private javax.swing.JButton JButton_serialPort;
    private javax.swing.JPanel JPanel_base;
    private javax.swing.JPanel JPanel_content;
    private javax.swing.JPanel JPanel_irrigationInfo;
    private javax.swing.JPanel JPanel_serialPort;
    private javax.swing.JPanel JPanel_sideBar;
    private javax.swing.JButton jButton_connect;
    private javax.swing.JButton jButton_disconnect;
    private javax.swing.JComboBox<String> jComboBox_baudRate;
    private javax.swing.JComboBox<String> jComboBox_comPort;
    private javax.swing.JComboBox<String> jComboBox_dataBits;
    private javax.swing.JComboBox<String> jComboBox_parityBits;
    private javax.swing.JComboBox<String> jComboBox_stopBits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_pumpState;
    private javax.swing.JLabel jLabel_soilMoisureReading;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar_comStatus;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
