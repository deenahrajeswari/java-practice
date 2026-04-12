class Rectangles{
    public float length;
    public float width;
     public double calculateArea(){
        double area=length*width;
        double result1=Math.round(area*100.0)/100.0;
        return result1;

     }
      public double calculatePerimeter(){
        double perimeter=2*(length+width);
        double result2=Math.round(perimeter*100.0)/100.0;
        return result2;
        
     }
}
public class Rectangle {
    
    public static void main(String[] args) {
        Rectangles rectangle=new Rectangles();
        rectangle.length=12f;
        rectangle.width=5f;

        double areaRectangle=rectangle.calculateArea();
        double perimeterRectangle=rectangle.calculatePerimeter();

        System.out.println(areaRectangle);
        System.out.println(perimeterRectangle);

        
    }
}

    

