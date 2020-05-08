package adaptive;

/**
 * @author chenyh
 * @date 2020-05-08
 */
public class Wheel {
    private final String type;

    public Wheel(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
