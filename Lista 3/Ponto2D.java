package br.com.poo.modelo;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D outroPonto) {
        this.x = outroPonto.x;
        this.y = outroPonto.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void mover() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(Ponto2D outroPonto) {
        this.x = outroPonto.x;
        this.y = outroPonto.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ponto2D ponto2D = (Ponto2D) obj;
        return Double.compare(ponto2D.x, x) == 0 && Double.compare(ponto2D.y, y) == 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double calcularDistancia(Ponto2D outroPonto) {
        return Math.sqrt(Math.pow(outroPonto.x - this.x, 2) + Math.pow(outroPonto.y - this.y, 2));
    }

    public Ponto2D clone() {
        return new Ponto2D(this.x, this.y);
    }
}