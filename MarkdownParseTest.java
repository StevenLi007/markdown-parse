import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void testDefaultLinkMethod() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testOneLinkMethod() throws IOException {
        Path fileName = Path.of("markdown-new-test.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("thiswillbreak.com", "thisisover.com", "peasy.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testTwoLinkMethod() throws IOException {
        Path fileName = Path.of("markdown-test-two.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("thiswillbreak.com", "thisisover.com", "peasy.html"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testThreeLinkMethod() throws IOException {
        Path fileName = Path.of("markdown-test-three.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("thiswillbreak.com", "thisisover.com", "peasy.html"), MarkdownParse.getLinks(contents));
    }

    //Tests from Joe's new repos
    @Test
    public void joesNewTestTwo() throws IOException {
        assertEquals(List.of("https://something.com", "some-page.html"), 
            MarkdownParse.getLinks(getContents("test-file2.md")));
    }
    @Test
    public void joesNewTestThree() throws IOException {
        assertEquals(List.of(), 
            MarkdownParse.getLinks(getContents("test-file3.md")));
    }
    @Test
    public void joesNewTestFour() throws IOException {
        assertEquals(new ArrayList<String>(), 
            MarkdownParse.getLinks(getContents("test-file4.md")));
    }
    @Test
    public void joesNewTestFive() throws IOException {
        assertEquals(List.of("page.com"), 
            MarkdownParse.getLinks(getContents("test-file5.md")));
    }
    @Test
    public void joesNewTestSix() throws IOException {
        assertEquals(List.of("page.com"), 
            MarkdownParse.getLinks(getContents("test-file6.md")));
    }
    @Test
    public void joesNewTestSeven() throws IOException {
        assertEquals(new ArrayList<String>(), 
            MarkdownParse.getLinks(getContents("test-file7.md")));
    }
    @Test
    public void joesNewTestEight() throws IOException {
        assertEquals(new ArrayList<String>(), 
            MarkdownParse.getLinks(getContents("test-file8.md")));
    }

    @Test
    public void failingTestForLab() throws IOException {
        assertEquals(1, 1);
    }

    @Test
    public void testNine() throws IOException {
        assertEquals(List.of("something.com"),
            MarkdownParse.getLinks(getContents("test-file9.md")));
    }
    
    @Test
    public void testSnippet1() throws IOException {
        assertEquals(List.of("url.com", "`google.com", "google.com", "ucsd.edu"), 
            MarkdownParse.getLinks(getContents("snippet-1.md")));
    }

    // @Test
    // public void testSnippet2() throws IOException {
    //     assertEquals(List.of("a.com", "b.com", "a.com(())", "example.com"), 
    //         MarkdownParse.getLinks(getContents("snippet-2.md")));
    // }

    @Test
    public void testSnippet3() throws IOException {
        assertEquals(List.of("https://twitter.com", "https://ucsd-cse15l-w22.github.io/", "github.com", "https://cse.ucsd.edu/"), 
            MarkdownParse.getLinks(getContents("snippet-3.md")));
    }

    public static String getContents(String filePath) throws IOException {
        Path fileName = Path.of(filePath);
        String contents = Files.readString(fileName);
        return contents;
    }
}