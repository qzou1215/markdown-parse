import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testFile() throws IOException{
        String[] args = {"/Users/zouqingtong/Documents/GitHub/markdown-parse/test-file.md"};
        Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals("[https://something.com, some-page.html]", links.toString());
    }
    @Test
    public void testnewFile() throws IOException{
        String[] args = {"/Users/zouqingtong/Documents/GitHub/markdown-parse/newFile.md"};
        Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals("[No link found.]", links.toString());
    }
    @Test
    public void testanotherNewFile() throws IOException{
        String[] args = {"anotherNewFile"};
        Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals("[No link in the parenthesis.]", links.toString());
    }

}