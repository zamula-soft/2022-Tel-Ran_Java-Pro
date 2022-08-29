package lesson3.homework;

public enum Cru {
    BASE(80), PREMIER(90), GRAND(100);

    private int quality;

    Cru(int quality) {
        this.quality = quality;
    }
}
