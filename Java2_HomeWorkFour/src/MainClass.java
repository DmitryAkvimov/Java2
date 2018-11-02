import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {

        //нужно для работы в потоке интерфейса + ананимный класс)))
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyWindow();
            }
        });
    }
}
