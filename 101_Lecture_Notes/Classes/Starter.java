/* 
    Lecture note example - If Statements
*/
import pkg.*;

class Starter{
    public static void main(String args[]) {
        Car mobile = new Car();
        Car batMobile = new Car("Lambo",525,"Black");
        batMobile.paint("Pink");
        mobile.vroom();
        batMobile.vroom();
	}
}