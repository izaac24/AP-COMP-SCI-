package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b;
        numRatings = c;
        revenue = d;
    }
    public void movieToString(){
       
        System.out.println("Moive: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
        
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public void addRating(double a){
        rating = rating * numRatings;
        rating = rating + a;
        numRatings = numRatings + 1;
        rating = rating/numRatings;
    }
    
    public boolean compareRatings(Movie a){
        if(a.getRating() < rating){
            return true;
        }
        return false;
        
    }


}
