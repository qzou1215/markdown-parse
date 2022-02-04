import static org.junit.Assert.*;
import org.junit.*;
<<<<<<< HEAD
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
=======

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
>>>>>>> 25a2c4e252ef1124775cfbaaf597681f0f5e2acd

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
<<<<<<< HEAD
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
=======

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
}
>>>>>>> 25a2c4e252ef1124775cfbaaf597681f0f5e2acd
