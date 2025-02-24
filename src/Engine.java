public class Engine {
    private String engineParts;
    private int cylindersAmount;
    public Engine(String engineParts, int cylindersAmount) {
        this.engineParts = engineParts;
        this.cylindersAmount = cylindersAmount;
    }
    public void info(){
        System.out.println("EngineParts: " + engineParts);
        System.out.println("CylindersAmount: " + cylindersAmount);
    }
    public String getEngineParts() {
        return engineParts;
    }
    public int getCylindersAmount() {
        return cylindersAmount;
    }
}
