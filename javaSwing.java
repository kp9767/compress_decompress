import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class javaSwing  implements ActionListener {
    JFrame frame;
    JButton compressButton;
    JButton decompressButton;
    JButton chooseButton;
    javaSwing(){
        frame=new JFrame("COMPRESS_OR_DECOMPRESS");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);

        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressButton=new JButton("Select file to compress");
        compressButton.setBounds(180,100,200,30);
       // compressButton.setBackground(Color.yellow);
        compressButton.addActionListener(this);
       // compressButton.setLocation(400,400);

        decompressButton=new JButton("Select file to decompress");
        decompressButton.setBounds(400,100,200,30);
        decompressButton.addActionListener(this);

        chooseButton=new JButton("Select one");
        chooseButton.setBounds(290,50,200,30);
        frame.add(chooseButton);
        frame.add(compressButton);
        frame.add(decompressButton);
        frame.setSize(800,500);
      //  this.getContentPane().setBackground(Color.yellow);
        frame.setVisible(true);

    }

    public static void main (String[] args){

        javaSwing obj=new javaSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==decompressButton){
            JFileChooser fileChooser=new JFileChooser();
            int responce = fileChooser.showSaveDialog(null);
            if(responce==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,e.toString());
                }
            }
        }
        if(e.getSource()==compressButton){
            JFileChooser fileChooser=new JFileChooser();
            int responce = fileChooser.showSaveDialog(null);
            if(responce==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,e.toString());
                }
            }
        }
    }
}
