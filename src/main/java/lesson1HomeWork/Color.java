package lesson1HomeWork;

public class Color {
    private int r;
    private int g;
    private int b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
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

    public String getHSL(){

        float r1 = (float) getR()/255;
        float g1 = (float) getG()/255;
        float b1 = (float) getB()/255;

        double minC = Math.min(r1, g1);
        minC = Math.min(minC, b1);

        double maxC = Math.max(r1, g1);
        maxC = Math.max(maxC, b1);

        double delta = maxC - minC;

        int h = 0;
        if (delta!=0){
            if (maxC == r1) {
                h = (int) (((g1 - b1) / delta) + ((g1 < b1) ? 6 : 0));
            } else if (maxC == g1) {
                h = (int) ((b1 - r1) / delta + 2);
            } else if (maxC == b1) {
                h = (int) ((int) (r1 - g1) / delta + 4);
            }
            h *=60;
        }


        int l = (int) ((minC + maxC) / 2 * 100);
        int s = (delta == 0) ? 0 : (int) (delta / (1 - Math.abs(2 * l - 1)));


    return String.format("%d,%d,%d", h,s,l);
    }

    public static void main(String[] args) {
        Color color = new Color(255, 255, 255);
        System.out.println(color.getHSL());

        Color color1 = new Color(192, 192, 192);
        System.out.println(color1.getHSL());

        Color color2 = new Color(0, 0, 0);
        System.out.println(color2.getHSL());

    }
}
