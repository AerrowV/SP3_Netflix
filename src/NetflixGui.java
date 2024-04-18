import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class NetflixGui extends JFrame {

    private ArrayList<ImageIcon> images;
    private int currentIndex;
    private JLabel imageLabel;

    public NetflixGui() {
        images = new ArrayList<>();
        currentIndex = 0;

        // Add your images to the ArrayList
        images.add(new ImageIcon("p1.jpg"));
        images.add(resizeImageIcon(new ImageIcon("p2.png"), 530, 560));
        images.add(resizeImageIcon(new ImageIcon("v1.jpg"), 500, 560));
        images.add(resizeImageIcon(new ImageIcon("s1.jpg"), 500, 560));


        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        showCurrentImage();

        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");
        JButton watchButton = new JButton("Watch");


        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousImage();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage();
            }
        });


        watchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Watching now..");
                dispose();

            }

        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(watchButton);

        getContentPane().setBackground((Color.BLACK));
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(imageLabel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Netflix");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    private void showCurrentImage() {
        ImageIcon currentImage = images.get(currentIndex);
        imageLabel.setIcon(currentImage);
    }

    private void showNextImage() {
        currentIndex = (currentIndex + 1) % images.size();
        showCurrentImage();
    }

    private void showPreviousImage() {
        currentIndex = (currentIndex - 1 + images.size()) % images.size();
        showCurrentImage();
    }
    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }


}
