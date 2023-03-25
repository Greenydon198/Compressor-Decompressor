package GUI;

import Compress_Decompress.Compress;
import Compress_Decompress.Decompress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class App_Frame extends JFrame implements ActionListener {

    public JButton CompressButton;
    public JButton DecompressButton;

    App_Frame() {
        CompressButton = new JButton("Select file to Compress");
        CompressButton.setBounds(50, 100, 200, 50);
        CompressButton.addActionListener(this);
        add(CompressButton);

        DecompressButton = new JButton("Select file to DeCompress");
        DecompressButton.setBounds(300, 100, 200, 50);
        DecompressButton.addActionListener(this);
        add(DecompressButton);

        setLayout(null);
        setLocation(50, 50);
        getContentPane().setBackground(Color.blue);
        setSize(550, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent a) {

        if(a.getSource() == CompressButton){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                try {
                    Compress.convert(file);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e.toString());
                }
            }

        }

        if(a.getSource() == DecompressButton){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                try {
                    Decompress.convert(file);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,e.toString());
                }
            }
        }

    }

    public static void main(String[] args) {

        new App_Frame();

    }
}
