

public class Figure
{
    public String name;
    double areaval;
    double perimeter ;


    public double getPerimeter(double param[] ) {
   
    for(int i = 0 ; i<param.length; i++){
       perimeter =  param[i]+ param[i+1];
       
        
      }
     
      return perimeter;
      
      }
      public double getArea(double area[]){
        
       for (int i = 0; i < area.length; i++) {
       areaval  =  area[i]+ area[i+1]; 
       }
        return areaval ;
      }

    
   
  
    
}