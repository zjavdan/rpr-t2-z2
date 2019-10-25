package ba.unsa.etf.rpr.tutorijal02;

public class Interval {

    private double gg, dg;
    private boolean d, g;

    public Interval(double dgranica, double ggranica, boolean donja, boolean gornja) throws IllegalArgumentException{
        if(dgranica > ggranica) throw new IllegalArgumentException("Pocetna tacka veca od kranje");
        dg = dgranica;
        gg = ggranica;
        d = donja;
        g = gornja;
    }


    public Interval(){
        dg = 0;
        gg = 0;
        d = false;
        g = false;
    }

    public boolean isNull(Interval i){
        if(i.gg == 0 && i.dg == 0 && i.d == false && i.g == false) return true;
        return false;
    }

    public boolean isIn(double x){
        if(this.d == true && this.g == true){
            if(x >= this.dg && x <= this.gg ) return true;
        }
        else if(this.d == true && this.g == false){
            if(x >= this.dg && x < this.gg ) return true;
        }
        else if(this.d == false && this.g == true){
            if(x > this.dg && x <= this.gg ) return true;
        }
        else if(this.d == false && this.g == false) {
            if (x > this.dg && x < this.gg) return true;
        }
        return false;
    }









}
