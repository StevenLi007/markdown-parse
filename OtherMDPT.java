import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class OtherMDPT {
    @Test
    public void testSnippet1() throws IOException{
        Path fileName = Path.of("./snippet-1.md");
        String contents = Files.readString(fileName);
        List<String> list1 = List.of("url.com", "`google.com", "google.com", "ucsd.edu");
        assertEquals(list1, OtherMDP.getLinks(contents));
    }

    @Test
    public void testSnippet2() throws IOException{
        Path fileName = Path.of("./snippet-2.md");
        String contents = Files.readString(fileName);
        List<String> list2 = List.of("a.com", "b.com", "a.com(())", "example.com");
        assertEquals(list2, OtherMDP.getLinks(contents));
    }

    @Test
    public void testSnippet3() throws IOException{
        Path fileName = Path.of("./snippet-3.md");
        String contents = Files.readString(fileName);
        List<String> list3 = List.of("https://twitter.com", "https://ucsd-cse15l-w22.github.io/", 
            "github.com", "https://cse.ucsd.edu/");
        assertEquals(list3, OtherMDP.getLinks(contents));
    }
}