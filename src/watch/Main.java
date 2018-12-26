package watch;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.util.Date;
public class Main extends JFrame {

    public static void main(String[] args) throws IOException {
        new Main().launch();
    }

    public Main() throws IOException {
        Watch watch = new Watch(new Date().getSeconds(), new Date().getMinutes(), new Date().getHours());
        WatchDisplay watchDisplay = new WatchDisplay(background());
        WatchPresenter watchPresenter = new WatchPresenter(watch, watchDisplay);
        this.init();
        this.add(watchDisplay);
    }
    
    

    private static Image background() throws IOException  {
        return ImageIO.read(new File("background.jpg"));            
    }

    private void launch() {
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Watch");
        this.setSize(400,400);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
