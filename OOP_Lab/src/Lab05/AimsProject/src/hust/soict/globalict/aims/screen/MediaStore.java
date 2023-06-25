package Lab05.AimsProject.src.hust.soict.globalict.aims.screen;

import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Book;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Media;
import Lab05.AimsProject.src.hust.soict.globalict.aims.media.Playable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName() , Font.PLAIN , 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton addButton = new JButton("Add to cart");
        addButton.addActionListener(new handleAddButton());
        container.add(addButton);

        JButton playButton = new JButton("Play");
        playButton.addActionListener(new handlePlayButton());
        if(media instanceof Playable) container.add(playButton);

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

     private class handlePlayButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){

        }

     }

     private class handleAddButton implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent e){

         }
     }
}
