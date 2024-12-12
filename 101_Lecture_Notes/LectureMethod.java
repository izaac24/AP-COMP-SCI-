/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        double num = raise(6000,6);
        num = raise(num,6);
        num = raise(num,6);
        num = raise(num,6);
        num = raise(num,6);
        num = raise(num,6);
        num = raise(num,6);
        num = raise(num,6);
        num = raise(num,6);
        num = raise(num,6);
        System.out.print(num);
	}
	public static void printAnimal(){
	    System.out.println("  _      _      _");
	    System.out.println(">(.)__ <(.)__ =(.)_");
	    System.out.println(" (___/  (___/  (___/");
	    return;
	}
	public static void greeting(String name){
	    System.out.print("Salutations " + name);
	}
	public static double raise(double salary, int percent){
	    double newSalary = salary + (salary*(salary/100.0));
	    return newSalary;
	}
}