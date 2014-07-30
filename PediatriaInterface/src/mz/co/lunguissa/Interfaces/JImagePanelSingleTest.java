package mz.co.lunguissa.Interfaces;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JFrame;
 
import com.towel.swing.img.JImagePanel;
 
public class JImagePanelSingleTest {
    public static void main(String[] args) throws Throwable {
        JImagePanel panel = new JImagePanel(
                loadImage("C:/Users/chaOsX/workspace/HCMTESTE/PediatriaInterface/src/img1.jpg"));
 
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(100, 100));
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
 
    private static BufferedImage loadImage(String file) throws IOException {
        return ImageIO.read(new File(file));
    }
}