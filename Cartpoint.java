public class Cartpoint{
    private double x;
    private double y;

    public Cartpoint(){
        this.x=0;
        this.y=0;
    }

    public Cartpoint(double x){
        this.x=x;
        this.y=0;
    }

    public Cartpoint(double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "("+x+" , "+y+")";
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }

    public Cartpoint translate(Cartpoint q){
        Cartpoint res=new Cartpoint();
        res.x=this.x+q.x;
        res.y=this.y+q.y;
        return res;

    }
    public Polairepoint toPolaire(){
        Polairepoint res=new Polairepoint();
        res.setR(Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2)));
        res.setO(Math.atan2(this.y, this.x));
        return res;
    }
    public Cartpoint rotate(double o){
        Polairepoint p= this.toPolaire();
        return p.rotate(o).toCart();

    }
}