/*
package LoginScreen;
//选择用户端还是管理员

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserInterface extends JFrame{

    public UserInterface() {
        setTitle("职工档案管理系统");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // 创建一个JLabel用于显示背景图片
        ImageIcon backgroundIcon = new ImageIcon("G:\\Java\\Java文件\\ClassProject\\Class_Project\\images\\Enter.jpg");
        JLabel backgroundLabel = new JLabel(backgroundIcon);
        backgroundLabel.setBounds(0, 0, getWidth(), getHeight());

        // 创建一个JPanel用于放置按钮
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setOpaque(false);

        // 创建两个按钮
        JButton jb1 = new JButton("用户端");
        JButton jb2 = new JButton("管理员");

        //点击事件按钮颜色和点击颜色
        Color color = new Color(127, 195, 225);
        jb1.setBackground(color);
        jb1.setForeground(Color.WHITE);
        jb2.setBackground(color);
        jb2.setForeground(Color.WHITE);

        UIManager.put("Button.focus", new ColorUIResource(new Color(0, 0, 0, 0)));

        //点击事件1：用户端
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserFrame userFrame = new UserFrame();
                userFrame.setTitle("用户端");
                userFrame.setVisible(true);
                userFrame.setLocationRelativeTo(null);
                dispose();
            }
        });

        //点击事件2：管理员
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminFrame adminFrame = new AdminFrame();
                adminFrame.setTitle("管理员");
                adminFrame.setVisible(true);
                adminFrame.setLocationRelativeTo(null);
                dispose();
            }
        });


        // 将按钮添加到JPanel中心
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(jb1);
        buttonPanel.add(Box.createHorizontalStrut(20));
        buttonPanel.add(jb2);
        buttonPanel.add(Box.createHorizontalGlue());

        // 设置背景标签为内容窗格
        setContentPane(backgroundLabel);

        // 将JPanel添加到背景标签上
        backgroundLabel.setLayout(new BorderLayout());
        backgroundLabel.add(buttonPanel, BorderLayout.CENTER);

        // 将JPanel添加到窗口的内容面板中心
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
