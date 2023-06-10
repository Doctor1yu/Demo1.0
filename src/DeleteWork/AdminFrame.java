/*
package LoginScreen;
//管理员界面
//登录按钮

import javax.swing.*;

public class AdminFrame extends JFrame {
    public AdminFrame() {
        setTitle("管理员");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // 创建账号和密码标签和文本框
        JLabel accountLabel = new JLabel("账号");
        JLabel passwordLabel = new JLabel("密码");
        JTextField accountField = new JTextField();
        JTextField passwordField = new JTextField();
        accountLabel.setBounds(50, 200, 50, 30);
        passwordLabel.setBounds(50, 250, 50, 30);
        accountField.setBounds(100, 200, 200, 30);
        passwordField.setBounds(100, 250, 200, 30);
        add(accountLabel);
        add(passwordLabel);
        add(accountField);
        add(passwordField);

        // 创建登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(150, 300, 100, 30);
        add(loginButton);

        // 添加登录按钮点击事件
        loginButton.addActionListener(e -> {
            String account = accountField.getText();
            String password = passwordField.getText();
            // TODO: 处理登录逻辑
        });

        // 设置布局为null，手动布置组件位置
        setLayout(null);
    }

    public static void main(String[] args) {
        UserFrame frame = new UserFrame();
        frame.setVisible(true);
    }
}
*/
