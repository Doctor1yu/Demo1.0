package LoginScreen;
//�û��˽���
//��¼��ť
//ע�ᰴť
import javax.swing.*;
import java.awt.*;

public class UserFrame extends JFrame {

    public UserFrame() {
        // ���ô���λ�á���С���رղ����Ͳ��ɸı��С
        setTitle("ְ������ϵͳ-�û���");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // �����˺ź������ǩ���ı�������λ��
        JLabel accountLabel = new JLabel("�˺�");
        JLabel passwordLabel = new JLabel("����");
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

        // ������¼��ע�ᰴť������λ��
        JButton loginButton = new JButton("��¼");
        JButton registerButton = new JButton("ע��");
        loginButton.setBounds(350, 250, 100, 30);
        registerButton.setBounds(150, 250, 100, 30);
        add(loginButton);
        add(registerButton);

        // ��ӵ�¼��ť����¼�
        loginButton.addActionListener(e -> {
            String account = accountField.getText();
            String password = passwordField.getText();
            // TODO: �����¼�߼�
        });

        // ���ע�ᰴť����¼�
        registerButton.addActionListener(e -> {
            // ����һ���µ�JFrame
            JFrame registerFrame = new JFrame("ע��");
            registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            registerFrame.setSize(400, 300);
            registerFrame.setLocationRelativeTo(null);

            // ����һ�����������ע���
            JPanel registerPanel = new JPanel(new GridBagLayout());
            registerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            // �������е����
            JLabel nameLabel = new JLabel("�˺�");
            JTextField nameField = new JTextField(20); // �����ı��򳤶�
            JLabel passwordLabelOther = new JLabel("����");
            JPasswordField passwordFieldOther = new JPasswordField(20); // �����ı��򳤶�
            JLabel confirmPasswordLabel = new JLabel("ȷ������");
            JPasswordField confirmPasswordField = new JPasswordField(20); // �����ı��򳤶�
            JButton submitButton = new JButton("���");
            // ������ɰ�ť����ѡ��СΪ 50 x 30 ����
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

            // �������ӵ�JFrame�У�������JFrame�ɼ�
            registerFrame.add(registerPanel);
            registerFrame.setVisible(true);

            // ע�ᰴť���߼�����
            // TODO: ����ע���߼�
        });

//        // ����������밴ť����¼�
//        forgetButton.addActionListener(e -> {
//            // TODO: �������������߼�
//        });

        // ���ò���Ϊnull���ֶ��������λ��
        setLayout(null);
    }

    public static void main(String[] args) {
        UserFrame frame = new UserFrame();
        frame.setVisible(true);
    }
}
