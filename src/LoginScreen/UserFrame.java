package LoginScreen;
//用户端界面
//登录按钮
//注册按钮
import javax.swing.*;
import java.awt.*;

public class UserFrame extends JFrame {

    public UserFrame() {
        // 设置窗口位置、大小、关闭操作和不可改变大小
        setTitle("职工管理系统-用户端");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // 创建账号和密码标签和文本框，设置位置
        JLabel accountLabel = new JLabel("账号");
        JLabel passwordLabel = new JLabel("密码");
        JTextField accountField = new JTextField();
        JTextField passwordField = new JTextField();
        accountLabel.setBounds(170, 130, 50, 30);
        passwordLabel.setBounds(170, 180, 50, 30);
        accountField.setBounds(220, 130, 200, 30);
        passwordField.setBounds(220, 180, 200, 30);
        add(accountLabel);
        add(passwordLabel);
        add(accountField);
        add(passwordField);

        // 创建登录和注册按钮，设置位置
        JButton loginButton = new JButton("登录");
        JButton registerButton = new JButton("注册");
        loginButton.setBounds(350, 250, 100, 30);
        registerButton.setBounds(150, 250, 100, 30);
        add(loginButton);
        add(registerButton);

        // 添加登录按钮点击事件
        loginButton.addActionListener(e -> {
            String account = accountField.getText();
            String password = passwordField.getText();
            // TODO: 处理登录逻辑
        });

        // 添加注册按钮点击事件
        registerButton.addActionListener(e -> {
            // 创建一个新的JFrame
            JFrame registerFrame = new JFrame("注册");
            registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            registerFrame.setSize(400, 300);
            registerFrame.setLocationRelativeTo(null);

            // 创建一个面板来包含注册表单
            JPanel registerPanel = new JPanel(new GridBagLayout());
            registerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            // 创建表单中的组件
            JLabel nameLabel = new JLabel("账号");
            JTextField nameField = new JTextField(20); // 调整文本框长度
            JLabel passwordLabelOther = new JLabel("密码");
            JPasswordField passwordFieldOther = new JPasswordField(20); // 调整文本框长度
            JLabel confirmPasswordLabel = new JLabel("确认密码");
            JPasswordField confirmPasswordField = new JPasswordField(20); // 调整文本框长度
            JButton submitButton = new JButton("完成");
            // 设置完成按钮的首选大小为 50 x 30 像素
            submitButton.setPreferredSize(new Dimension(100, 30));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.CENTER;
            registerPanel.add(nameLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            registerPanel.add(nameField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.anchor = GridBagConstraints.CENTER;
            registerPanel.add(passwordLabelOther, gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            registerPanel.add(passwordFieldOther, gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.anchor = GridBagConstraints.CENTER;
            registerPanel.add(confirmPasswordLabel, gbc);

            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            registerPanel.add(confirmPasswordField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            gbc.anchor = GridBagConstraints.CENTER;
            registerPanel.add(submitButton, gbc);

            // 将面板添加到JFrame中，并设置JFrame可见
            registerFrame.add(registerPanel);
            registerFrame.setVisible(true);

            // 注册按钮的逻辑代码
            // TODO: 处理注册逻辑
        });

//        // 添加忘记密码按钮点击事件
//        forgetButton.addActionListener(e -> {
//            // TODO: 处理忘记密码逻辑
//        });

        // 设置布局为null，手动布置组件位置
        setLayout(null);
    }

    public static void main(String[] args) {
        UserFrame frame = new UserFrame();
        frame.setVisible(true);
    }
}
