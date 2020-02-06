package defence;

public class Shield extends Defence {

    private String size;

    public Shield(int protectionLevel, String size) {
        super(protectionLevel);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String protect() {
        return "Protect with a " + getSize() + " shield! Reduce damage by " + getProtectionLevel() + ".";
    }
}
