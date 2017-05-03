import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;

 public class Movie {
   private String name;
   private int yearOfRelease;
   private String aboutMovie;
   private String description;
   private int id;
   private int rating;
   private String image;
   private int categoryId;

    public Movie(String name, int yearOfRelease, String aboutMovie, String description, int rating, String image, int categoryId){
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.aboutMovie = aboutMovie;
        this.description = description;
        this.rating = rating ;
        this.image = image;
        this.categoryId = categoryId;
     }
     public String getName() {
       return name;
     }
// This Return the year the movie was released
     public int getYearOfRelease() {
       return yearOfRelease;
     }
// This return brief description about the movie
     public String getAboutMovie() {
       return aboutMovie;
     }
// This return full Description about the movie
     public String getDescription() {
       return description;
     }
// This return the movie rating
     public int getRating() {
       return rating;
     }
// This return image
     public String getImage() {
       return image;
     }
// This returns the category id
     public int getCategoryId() {
       return categoryId;
     }
 }
