

/*
 * JavaBean has empty constructor, getters and setters with getX, setX, isFlag
 */

// extends Object if you don't code it
public class JavaBean extends Object {

    private boolean flag;
    private String name;

    // behind the scenes if you don't code it
    public JavaBean() {
        // Calls super() if you don't code it
        super();
    }

    // getters and setters for variables


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
