package shapes;
public class Point{
    public final double x;
    public final double y;
    private final double[] p;
    
    Point(double x, double y){
        this.x = x;
        this.y = y;
        p = new double[]{x,y};
    }
    
    public double[] get(){
        return p;
    }
    
    @Override
    public String toString(){
        return "P:["+x+","+y+"]";
    }
    
    public boolean equals(Point that){
        return this.x==that.x && this.y==that.y;
    }
}
