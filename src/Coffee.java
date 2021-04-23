public class Coffee {

    String origin;
    String roast;
    boolean isDecaf;
    boolean isGround;
    boolean isOrganic;
    boolean isEthicallySourced;

    public Coffee(){
       this("Sumatra", "Dark", true, true,true,true);
    }


    public Coffee(String origin) {

        // call the constructor   public Coffee(String roast, boolean isDecaf, boolean isGround)
        this("Dark", true, true);


        this.origin = origin;

    }

    public Coffee(String roast, boolean isDecaf, boolean isGround) {

        this.roast = roast;
        this.isDecaf = isDecaf;
        this.isGround = isGround;
    }

    public Coffee(boolean isOrganic, boolean isEthicallySourced) {
        this.isOrganic = isOrganic;
        this.isEthicallySourced = isEthicallySourced;
    }

    public Coffee(String origin, String roast, boolean isDecaf, boolean isGround, boolean isOrganic, boolean isEthicallySourced) {
        this.origin = origin;
        this.roast = roast;
        this.isDecaf = isDecaf;
        this.isGround = isGround;
        this.isOrganic = isOrganic;
        this.isEthicallySourced = isEthicallySourced;
    }


}
