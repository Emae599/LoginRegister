import java.awt.*;

public class CommonConstants {
    // file paths
    public static final String LOGIN_IMAGE_PATH = "resources/Logo.png";
    public static final String FONT_PATH = "resources/coolvetica condensed rg.otf";

    // color config
    public static final Color PRIMARY_COLOR = new Color(255,255,255);
    public static final Color SECONDARY_COLOR = new Color(0,74,173);
    public static final Color BUTTON_COLOR = new Color(56,182,255);

    // frame config
    public static final Dimension FRAME_SIZE = new Dimension(540, 890);
    public static final Dimension TEXTFIELD_SIZE = new Dimension((int) (FRAME_SIZE.width * 0.80), 50);
    public static final Dimension BUTTON_SIZE = TEXTFIELD_SIZE;

    // login config
    public static final Dimension LOGIN_IMAGE_SIZE = new Dimension(370, 340);

    // register config
    public static final Dimension REGISTER_LABEL_SIZE = new Dimension(FRAME_SIZE.width, 100);

    // result dialog config
    public static final Dimension RESULT_DIALOG_SIZE = new Dimension((int)(FRAME_SIZE.width/3), (int)(FRAME_SIZE.height/6));
}
