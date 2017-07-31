/**
 * Created by gilpratte on 7/31/17.
 */
public final class Immuttable1 {

    final private boolean flag;
    final private String name;

    public Immuttable1(boolean flag, String name) {
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
