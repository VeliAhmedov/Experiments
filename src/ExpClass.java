public class ExpClass {
    private int count;
    private String typeName;
    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getTypeName() {
        return typeName;
    }
    void display() {
        System.out.println("name of type " + getTypeName() + " and how many counts are "+ getCount());
    }
    @Override
    public String toString() {
        return "ExpClass{" +
                "count=" + count +
                ", typeName='" + typeName + '\'' +
                '}';
    }

}
