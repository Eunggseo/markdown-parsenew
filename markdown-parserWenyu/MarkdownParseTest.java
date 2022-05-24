import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
  public void testGetLinks() throws IOException{
         Path fileName = Path.of("test-file.md");
         String content = Files.readString(fileName);
         ArrayList<String> links = MarkdownParse.getLinks(content);
         assertEquals(List.of("https://something.com", "some-thing.html"),links);
     }

}