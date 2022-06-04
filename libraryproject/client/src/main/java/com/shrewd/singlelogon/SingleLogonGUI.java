package com.shrewd.singlelogon;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shrewd.service.UserService;
import com.shrewd.utils.ServiceUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SingleLogonGUI extends JFrame {
   public static final String LOGON = "Log On";
   public static final String EXIT = "Exit";
   private JTextField txtUser;
   private JTextField txtPassWord;
   private static SingleLogonGUI[] instance = {null,null};
   private static int n=0;
   private JTextField txtInstruction;

   private SingleLogonGUI(int i) {
	    super("SingleLogonGUI - Singleton"+i);
	    initializeGUI();
    }
    public static synchronized SingleLogonGUI getInstance() {
    	  n=n+1; if (n>2) n=1;
	      if (n==1 && instance[0] == null)
		      instance[0] = new SingleLogonGUI(1);
	      if (n==2 && instance[1] == null)
		      instance[1] = new SingleLogonGUI(2);
	      return instance[n-1];
    }
   public void initializeGUI()  {
      JLabel lblUsrName = new JLabel("User Name");
      JLabel lblPassWord = new JLabel("Password");
      txtUser = new JTextField("shrewd");
      txtPassWord = new JTextField("test123");
      JButton btnLogon = new JButton(LOGON);
      btnLogon.setMnemonic(KeyEvent.VK_S);
      JButton btnExit = new JButton(EXIT);
      btnExit.setMnemonic(KeyEvent.VK_X);
      ButtonHandler vf = new ButtonHandler();
      btnLogon.addActionListener(vf);
      btnExit.addActionListener(vf);
      JPanel buttonPanel = new JPanel();
      GridBagLayout gridbag = new GridBagLayout();
      buttonPanel.setLayout(gridbag);
      GridBagConstraints gbc = new GridBagConstraints();

      buttonPanel.add(lblUsrName);
      buttonPanel.add(txtUser);
      buttonPanel.add(lblPassWord);
      buttonPanel.add(txtPassWord);
      buttonPanel.add(btnLogon);
      buttonPanel.add(btnExit);
      gbc.insets.top = 5;
      gbc.insets.bottom = 5;
      gbc.insets.left = 5;
      gbc.insets.right = 5;
      gbc.gridx = 0;
      gbc.gridy = 0;
      gridbag.setConstraints(lblUsrName, gbc);
      gbc.anchor = GridBagConstraints.WEST;
      gbc.gridx = 1;
      gbc.gridy = 0;
      gridbag.setConstraints(txtUser, gbc);
      gbc.gridx = 0;
	  gbc.gridy = 1;
	  gridbag.setConstraints(lblPassWord, gbc);
	  gbc.anchor = GridBagConstraints.WEST;
	  gbc.gridx = 1;
	  gbc.gridy = 1;
      gridbag.setConstraints(txtPassWord, gbc);
      gbc.anchor = GridBagConstraints.EAST;
      gbc.insets.left = 2;
      gbc.insets.right = 2;
      gbc.insets.top = 40;
      gbc.gridx = 0;
      gbc.gridy = 6;
      gridbag.setConstraints(btnLogon, gbc);
      gbc.anchor = GridBagConstraints.WEST;
      gbc.gridx = 1;
      gbc.gridy = 6;
      gridbag.setConstraints(btnExit, gbc);

      Container contentPane = getContentPane();
      contentPane.add(buttonPanel, BorderLayout.CENTER);
      txtInstruction = new JTextField();
      txtInstruction.setBackground(Color.pink);

      contentPane.add( txtInstruction, BorderLayout.NORTH);
      setSize(400, 200);
      setVisible(true);
   }
   // 登录判断
   public boolean isValideCustomer() {
       // 从GUI上获取参数
	  String usr = txtUser.getText();
	  String pwd = txtPassWord.getText();
      // 获取服务
      UserService userService = ServiceUtils.getUserService();
      // 调用服务并取得结果
      String res = userService.findUser_uname_uword(usr, pwd);
       System.out.println(res);
       if (!"null".equals(res)) {
          //处理结果
          JSONObject jsonObject = JSON.parseObject(res);
          return true;
      }
       return false;

   }
   private void issueWarning(){
         txtInstruction.setText("Invalide user name or password.");
	}
   private void issueSuccess(){
	     txtInstruction.setText("You have been successfully connected to the web.");
	}
   class ButtonHandler implements ActionListener  {
      public void actionPerformed(ActionEvent e) {
         if (e.getActionCommand().equals(EXIT)) {
            System.exit(1);
         }
         if (e.getActionCommand().equals(LOGON)) {
			 boolean isValideCus = isValideCustomer();
             if(isValideCus == false){ //logon failed
                 issueWarning();
			 }
             else{ //logon successfully
				 issueSuccess();
		     }
      }
    }
  }
}// end of class

