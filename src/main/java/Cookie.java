import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Cookie {


    public void generateCookie() throws IOException {
        Path path = Paths.get("src/cookie_file.txt");
        File file = path.toFile(); //convert to file from path

        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();


    }
}
