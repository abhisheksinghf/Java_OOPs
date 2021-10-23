abstract class Figure{
    int x,y;
    void changePosition(int newX,int newY){}
    abstract void draw();
}
class CircleFigure extends Figure{
    @Override
    void draw(){
        System.out.println("Drawing...");
    }
}
class RectangleFigure extends Figure{
    @Override
    void draw(){
        System.out.println("Override");
    }
    void changePosition(int newX,int newY){
        System.out.println("Method Called");
    }
} 
public class Abstract02 {
    public static void main(String[] args) {
        
    }
}
