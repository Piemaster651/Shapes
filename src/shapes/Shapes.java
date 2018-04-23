package shapes;
public class Shapes{
    public static void main(String[] args){
       Point p0 = new Point(-1,Math.sqrt(3));
       Point p1 = new Point(-2,0);
       Point p2 = new Point(-1,-Math.sqrt(3.0));
       Point p3 = new Point(1,Math.sqrt(3.0));
       Point p4 = new Point(2,0);
       Point p5 = new Point(1,-Math.sqrt(3.0));
       Segment s1 = new Segment(p0,p1);
       Segment s2 = new Segment(p1,p2);
       Segment s3 = s1.compose(s2);
       System.out.println(s3);
    }    
}
