package Figures;

import java.awt.*;

public class Square extends Shape{
    public Square(Color color, Point position) { super(color, position);
    }

    @Override
    public void draw(Graphics g) { Graphics2D g2d = (Graphics2D) g; g2d.setColor(super.color); g2d.fillRect(
            super.position.getX(), super.position.getY(), 30, 30);
    }
}
