package Basic.Day04_029_Modifier;

public class Parent {
    public int id = 999;
    private String parentType = "parentType";
    // 同包下可以访问，子类中可访问
    protected String name = "parent Name";
    // 只能同包下可访问
    String age = "缺省 age";

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }
}
