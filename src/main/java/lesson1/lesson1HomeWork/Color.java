package lesson1.lesson1HomeWork;

public class Color {
    private int r, g, b;
    private double r1, b1, g1;
    private double maxC, minC, delta;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;

        double r1 = (double) r/255;
        double g1 = (double) g/255;
        double b1 = (double) b/255;

        minC = Math.min(Math.min(r1, g1), b1);
        maxC = Math.max(Math.max(r1, g1), b1);

        delta = maxC - minC;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getL(){
        return ((minC + maxC) / 2);
    }

    public double getS() {
        return  (delta == 0) ? 0 :  (delta / (1 - Math.abs(2 * getL() - 1)));
    }

    public double getH_old() {


        int h = 0;
        if (delta != 0) {
            if (maxC == r1) {
                h = (int) (((g1 - b1) / delta) + ((g1 < b1) ? 6 : 0));
            } else if (maxC == g1) {
                h = (int) ((b1 - r1) / delta + 2);
            } else if (maxC == b1) {
                h = (int) ((int) (r1 - g1) / delta + 4);
            }
            h *= 60;
        }
        return h;
    }

    public double getH(){
        if (delta == 0)
            return 0;
        if (maxC == r1)
            return 60*(((g1-b1)/delta) %6);
        if (maxC == g1)
            return 60*(((b1-r1)/delta) + 2);
        if (maxC == b1)
            return 60*(((r1-g1)/delta)+4);
        return 0;
    }

    public String getHSL(){

    return String.format("%3.2f, %3.2f, %3.2f", getH_old(), getS(), getL());
    }

    public static void main(String[] args) {
        Color color = new Color(0, 255, 255);
        System.out.println(color.getHSL());

        Color color1 = new Color(192, 192, 192);
        System.out.println(color1.getHSL());

        Color color2 = new Color(0, 128, 128);
        System.out.println(color2.getHSL());

    }
}
