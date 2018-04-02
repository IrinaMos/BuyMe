import javafx.scene.control.Button;

import java.awt.*;
import java.awt.event.InputEvent;
public class Mobile12 {

    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(630, 420);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.mousePress(InputEvent.BUTTON2_MASK);
        robot.mouseRelease(InputEvent.BUTTON2_MASK);
    }
}
