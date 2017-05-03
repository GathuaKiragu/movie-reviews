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

  @Test
  public void Movie_instantiatesCorrectly_true() {
    assertEquals(true, myMovie instanceof Movie);
  }
}
