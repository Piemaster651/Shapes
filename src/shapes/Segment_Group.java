package shapes;
import java.util.*;
abstract class Segment_Group{
    
    public final ArrayList<Segment> segments;
    private final double[][] sg;
    
    Segment_Group(){
        segments = new ArrayList<>();
        sg = new double[1][1];
    }
    
    Segment_Group(ArrayList<Segment> segments){
        this.segments = segments;
        sg = new double[segments.size()*2][2];
        for(int i = 0;i<sg.length;i+=2){
            sg[i][0]=segments.get(i).get()[0][0];
            sg[i+1][0]=segments.get(i).get()[1][0];
        }
    }
}
