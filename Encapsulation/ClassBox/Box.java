package Exercise.Encapsulation.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length,double width, double height) throws IllegalAccessException {
     setLength(length);
     setWidth(width);
     setHeight(height);
    }

    /*
Volume = lwh
Lateral Surface Area = 2lh + 2wh
Surface Area = 2lw + 2lh + 2wh
  */
    public double calculateSurfaceArea(){
        return 2*length*width+2*length*height+2*width*height;
    }
    public double calculateLateralSurfaceArea(){
        return 2*length*height+2*width*height;
    }

    public double calculateVolume(){
        return length*width*height;
    }
    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth(){
        return width;
    }

    public void setHeight(double height) throws IllegalAccessException {
        if(height<=0){
            throw new IllegalAccessException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public void setLength(double length) throws IllegalAccessException {
        if(length<=0){
            throw new IllegalAccessException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public void setWidth(double width) throws IllegalAccessException {
        if(width<=0){
            throw new IllegalAccessException("Width cannot be zero or negative.");
        }
        this.width = width;
    }
}
