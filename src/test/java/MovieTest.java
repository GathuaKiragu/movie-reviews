import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class MovieTest {
  // @Rule
  // public DatabaseRule database = new DatabaseRule();
  private Movie myMovie;
  @Before
  public void instanciate(){
  myMovie = new Movie("Breaking Bad" , 2003, "This is a good serie :)", "Best movie of all Time", 5 , "picture", 1);
  }

// Test to check instance of movie
  @Test
  public void Movie_instantiatesCorrectly_true() {
    assertEquals(true, myMovie instanceof Movie);
  }
// Test to check if movie instanciates correctly with movie name
  @Test
  public void MovieInstantiatesCorrectlywithName_true() {
    assertEquals("Breaking Bad", myMovie.getName());
  }
  // Test to check if movie instanciates correctly with movie year of Release

  @Test
  public void MovieInstantiatesCorrectlywithYear_true() {
    assertEquals(2003, myMovie.getYearOfRelease());
  }
  // Test to check if movie instanciates correctly with About information

  @Test
  public void MovieInstantiatesCorrectlywithAbout_true() {
    assertEquals("This is a good serie :)", myMovie.getAboutMovie());
  }

// Test to check if movie instanciates correctly with movie Description

  @Test
  public void MovieInstantiatesCorrectlywithDescription_true() {
    assertEquals("Best movie of all Time", myMovie.getDescription());
  }
  // Test to check if movie instanciates correctly with movie Rating

  @Test
  public void MovieInstantiatesCorrectlywithRating_true() {
    assertEquals(5, myMovie.getRating());
  }
  // Test to check if movie instanciates correctly with movie cover picture
  @Test
  public void MovieInstantiatesCorrectlywithPicture_true() {
    assertEquals("picture", myMovie.getImage());
  }
}
