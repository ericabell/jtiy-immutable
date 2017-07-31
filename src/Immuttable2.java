/**
 * Created by gilpratte on 7/31/17.
 */
public class Immuttable2 {

    private boolean flag;
    private String name;

    public Immuttable2(boolean flag, String name) {
        this.flag = flag;
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }
}
