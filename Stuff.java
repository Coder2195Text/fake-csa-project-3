public class Stuff {
    private int idk;
    public void setIdk(int idk) {
        this.idk = idk;
    }

    public String toString() {
        return "Stuff with idk: " + idk;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Stuff) {
            return idk == ((Stuff) obj).idk;
        }
        return false;
    }
}
