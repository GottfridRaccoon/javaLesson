import java.awt.*;
import javax.swing.*; 

public class Ellipse extends Figure {
    public double rad1 = 100;
    public double rad2 = 100;
    private double centerDot = 1;

        public  void createEllipse(double weight, double height) {

           //double result = Math.sqrt(r1*r1/1*1+r2*r2/2*2);
         //  return result;
         Graphics g ;
         g.setColor(Color.blue);
         g.drawOval(rad1,rad2,weight,height);

        }
        public static  void main(String args []) {
         
            createEllipse(100, 100);
        }

}
