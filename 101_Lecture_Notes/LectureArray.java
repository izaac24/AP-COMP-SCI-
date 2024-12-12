/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = new int [20];
        for(int i = 0; i <  arr.length;i++){
            arr[i] = (int)(Math.random() * 9 + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int d = (int)(Math.random() * 9 + 1);
        System.out.println("number is " + d);
        for(int i = 0; i <  arr.length; i++){
            if(arr[i] == d){
                System.out.println("dupe on " + i);
            }
        }
	}
}