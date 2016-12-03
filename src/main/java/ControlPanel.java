import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControlPanel extends JPanel{

    private final int WIDTH = 390;
    private final int HEIGHT = 790;

    public interface ControlPanelListener {
        void onBuyRoad();
        void onBuySettlement();
        void onBuyCity();
        void onBuyDevCard();

        void onPlayDevCard();

        void onTradePlayers();
        void onTradeBank();

        void onStartTurn();
        void onEndTurn();
        void onExitGame();
    };

    private ControlPanelListener controlPanelListener;

    public void setControlPanelListener(ControlPanelListener listener) {
        this.controlPanelListener= listener;
    }

    private GameState currentState;

    public ControlPanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
}
