import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Cookie {


    public ArrayList<String> generateCookie() throws IOException {
        Path path = Paths.get("src/cookie_file.txt");
        File file = path.toFile(); //convert to file from path

        ArrayList<String> cookie_text = new ArrayList<>();

        int i = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            cookie_text.add(sc.nextLine());
        }
        sc.close();
        return cookie_text;
    }
}
