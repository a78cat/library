package com.shrewd.singlelogon;

import javafx.scene.text.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ClientUI extends JFrame {

    // 功能按钮
    private static final String LOGIN = "登入";
    private static final String REGISTER = "注册";
    private static final String EXIT = "退出";

    // 可输入文本框
    private JTextField txtInstruction;
    private JTextField txtUser;
    private JTextField txtPassWord;

    // 子页面
    private SingleLogonGUI objLogon = null;

    public ClientUI() {
        super("图书馆管理系统");

        JButton btnConnect = new JButton(LOGIN);
        JButton btnExit = new JButton(EXIT);
        btnConnect.setMnemonic(KeyEvent.VK_S);
        btnExit.setMnemonic(KeyEvent.VK_X);

        ButtonHandler vf = new ButtonHandler();
        btnConnect.addActionListener(vf);
        btnExit.addActionListener(vf);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.gray);
        buttonPanel.add(btnConnect);
        buttonPanel.add(btnExit);

        txtInstruction = new JTextField("Click to get a connection");
        txtInstruction.setBackground(Color.gray);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(buttonPanel, "South");
        contentPane.add(txtInstruction, "Center");
        setSize(320, 120);
        setVisible(true);
    }
    private void issueWarning(){
        txtInstruction.setText("Error. You cannot start a second connection.");
    }
    class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals(EXIT)) {
                System.exit(1);
            } else if (e.getActionCommand().equals(LOGIN)) {
                //my change
                if (objLogon != null && objLogon.isVisible()) {
                    issueWarning();
                } else {
                    objLogon = SingleLogonGUI.getInstance();
                    objLogon.setVisible(true);
                }
                //else
                //  issueWarning();
            }
        }
    }
    public static void main(String[]  args) {
        ClientUI connection = new  ClientUI();
    }
}// end of class

