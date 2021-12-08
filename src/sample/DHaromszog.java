package sample;

public class DHaromszog {
    private double aOldal;
    private double bOldal;
    private double cOldal;

    public DHaromszog(String sor, int sorSzam) throws Exception {
        sor.replace(',', '.');
        String[] adatok = sor.split(" ");

        this.setaOldal(Double.parseDouble(adatok[0]));
        this.setbOldal(Double.parseDouble(adatok[1]));
        this.setcOldal(Double.parseDouble(adatok[2]));
    }

    public double getaOldal() {
        return aOldal;
    }

    public double getbOldal() {
        return bOldal;
    }

    public double getcOldal() {
        return cOldal;
    }

    public void setaOldal(double aOldal) throws Exception {
        if (aOldal > 0) {
            this.aOldal = aOldal;
        } else {
            throw new Exception("A(z) 'a' oldal nem lehet nulla vagy negatív!");
        }
    }

    public void setbOldal(double bOldal) throws Exception {
        if (bOldal > 0) {
            this.bOldal = bOldal;
        } else {
            throw new Exception("A(z) 'b' oldal nem lehet nulla vagy negatív!");
        }
    }

    public void setcOldal(double cOldal) throws Exception {
        if (cOldal > 0) {
            this.cOldal = cOldal;
        } else {
            throw new Exception("A(z) 'c' oldal nem lehet nulla vagy negatív!");
        }
    }

    private boolean EllDerekszogu() {
        return Math.pow(aOldal, 2) + Math.pow(bOldal, 2) == Math.pow(cOldal, 2);
    }
}
