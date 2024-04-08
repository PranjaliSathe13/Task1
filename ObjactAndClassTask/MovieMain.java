/*Task 3:In a movie review website, a "Movie" class is a blueprint used to create an instance of a movie. It defines properties, behaviour, and functions that an object created from the Movie class will have. Here is a detailed description of the Movie class including its attributes and methods.
Attributes:1. Movie Title – It is a property that holds the name of the movie.2. Director – It refers to the name of the person who directed the movie.3. Release Year – It represents the year in which the movie was released.4. Genre – It is the category or type of the movie (e.g. action, romance, drama, etc.)5. Average Rating – It represents the mean rating of the movie posted by viewers on the website
*/

import java.util.ArrayList;
class Movie{

private String movieTitle;
private String director;
private int yearOfRelease;
private String genre;
private double averageRating;
private ArrayList<Double> ratings;


public Movie(String movieTitle ,String director,int yearOfRelease,String genre)
{
this.movieTitle=movieTitle;
this.director=director;
this.yearOfRelease=yearOfRelease;
this.genre=genre;
this.averageRating=0.0;
this.ratings=new ArrayList<>();
}

private void updateAverageRating(){
double sum=0;
for(double rating:ratings){
sum+=rating;
}
this.averageRating=sum/ratings.size();
}

void addReview(double rating){
ratings.add(rating);
updateAverageRating();

}
public String getMovieDetails()
{
String details=("Movie Title :"+movieTitle+"\nDirector"+director+"\nRelease year:"+yearOfRelease+"\nGenre"+genre+"\nRating:"+averageRating);
return details;
}


}
class MovieMain{
public static void main(String[] arg)
{
 Movie movie=new Movie("Learning Movie","Directors name 1",2024,"Sci/Fi");

movie.addReview(2);
movie.addReview(4.5);
movie.addReview(5);

System.out.println("Movie Details :"+movie.getMovieDetails());


}
}