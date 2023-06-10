/*
package LoginScreen;
//ѡ���û��˻��ǹ���Ա

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserInterface extends JFrame{

    public UserInterface() {
        setTitle("ְ����������ϵͳ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // ����һ��JLabel������ʾ����ͼƬ
        ImageIcon backgroundIcon = new ImageIcon("G:\\Java\\Java�ļ�\\ClassProject\\Class_Project\\images\\Enter.jpg");
        JLabel backgroundLabel = new JLabel(backgroundIcon);
        backgroundLabel.setBounds(0, 0, getWidth(), getHeight());

        // ����һ��JPanel���ڷ��ð�ť
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setOpaque(false);

        // ����������ť
        JButton jb1 = new JButton("�û���");
        JButton jb2 = new JButton("����Ա");

        //����¼���ť��ɫ�͵����ɫ
        Color color = new Color(127, 195, 225);
        jb1.setBackground(color);
        jb1.setForeground(Color.WHITE);
        jb2.setBackground(color);
        jb2.setForeground(Color.WHITE);

        UIManager.put("Button.focus", new ColorUIResource(new Color(0, 0, 0, 0)));

        //����¼�1���û���
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserFrame userFrame = new UserFrame();
                userFrame.setTitle("�û���");
                userFrame.setVisible(true);
                userFrame.setLocationRelativeTo(null);
                dispose();
            }
        });

        //����¼�2������Ա
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminFrame adminFrame = new AdminFrame();
                adminFrame.setTitle("����Ա");
                adminFrame.setVisible(true);
                adminFrame.setLocationRelativeTo(null);
                dispose();
            }
        });


        // ����ť��ӵ�JPanel����
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(jb1);
        buttonPanel.add(Box.createHorizontalStrut(20));
        buttonPanel.add(jb2);
        buttonPanel.add(Box.createHorizontalGlue());

        // ���ñ�����ǩΪ���ݴ���
        setContentPane(backgroundLabel);

        // ��JPanel��ӵ�������ǩ��
        backgroundLabel.setLayout(new BorderLayout());
        backgroundLabel.add(buttonPanel, BorderLayout.CENTER);

        // ��JPanel��ӵ����ڵ������������
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(Box.createVerticalGlue(), BorderLayout.NORTH);
        contentPane.add(Box.createVerticalGlue(), BorderLayout.SOUTH);
        contentPane.add(Box.createHorizontalGlue(), BorderLayout.WEST);
        contentPane.add(Box.createHorizontalGlue(), BorderLayout.EAST);
        contentPane.add(buttonPanel, BorderLayout.CENTER);
    }
}
*/
