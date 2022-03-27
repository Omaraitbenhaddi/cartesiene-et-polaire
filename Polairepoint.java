public class Polairepoint {
    private double r;
    private double o;

    public Polairepoint(){
        r=0;
        o=0;
    }

    public Polairepoint(double r){
        this.r=r;
        this.o=0;
    }
    public Polairepoint(double a,double b){
            r=a;
            o=b;
    }

    public double getR(){
        return r;
    }
    public double getO(){
        return o;
    }
    public void setR(double a){
        this.r=a;
    }
    public void setO(double a){
        this.o=a;
    }
    @Override
    public String toString() {
        return r+"e^i"+o;
    }
    public Polairepoint rotate(double o){
        return new Polairepoint(this.r,this.o+o);

    }
    public Cartpoint toCart(){
        Cartpoint res=new Cartpoint();
        res.setX(r* Math.cos(o));
        res.setY(r*Math.sin(o));
        return res;
    }
    public Polairepoint translate(Polairepoint q){
        Cartpoint p=new Cartpoint();
        Cartpoint q1=new Cartpoint();
        p=this.toCart();
        q1=q.toCart();      
        return p.translate(q1).toPolaire();

    }

    
}
