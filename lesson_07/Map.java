import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {

    public static final int GAME_MODE_HVH = 0;
    public static final int GAME_MODE_HVA = 1;

    Map() {
        setBackground(Color.BLACK);
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("game mode: %d\nfieldSize: %d\nwinLength: %d\n", gameMode, fieldSizeX, winLength);

        drawGrid(this.getGraphics(), fieldSizeX);
    }

    public void drawGrid(Graphics g, int fieldSize) {
        g.setColor(Color.white);
        int panelSize = this.getWidth();
        int cellSize = panelSize / fieldSize;

        for (int i = 0; i < fieldSize; i++) {
            g.drawLine(0, cellSize * i, panelSize, cellSize * i);
            g.drawLine(cellSize * i, 0, cellSize * i, panelSize);
        }
    }
}
