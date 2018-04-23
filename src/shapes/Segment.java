package shapes;
public class Segment{
    
    public final Point p1;
    public final Point p2;
    private final double[][] s;
    
    Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
        s = new double[][]{p1.get(),p2.get()};
    }
    
    public Segment compose(Segment that){
        if(this.p2.equals(that.p1))return new Segment(this.p1,that.p2);
        else return null;
    }
    
    public double[][] get(){
        return s;
    }
    
    @Override
    public String toString(){
        return "S:["+round(p1.x)+" "+round(p2.x)+"]\n  ["+round(p1.y)+" "+round(p2.y)+"]";
    }
    
    private String round(double a){
         return Math.floor(a*100)/100+"";
    }
    
}
