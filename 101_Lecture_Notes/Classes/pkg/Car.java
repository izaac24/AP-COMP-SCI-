/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    String model;
    double maxSpeed;
    boolean isElectric;
    String color;
    
    public Car(){
        model = "bus";
        maxSpeed = 1.1;
        isElectric = false;
        color = "blue & red";
    }
    public Car(String m, double s, String c){
        model = m;
        maxSpeed = s;
        isElectric = false;
        color = c;
    }
    public void paint(String c){
        color = c;
    }
    public void vroom(){
        int count = 0;
        while(count < maxSpeed){
            System.out.print(model + " goes VROOOOOOM");
            count = count + 10;
        }
    }
}