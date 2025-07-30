package Day5;
import java.io.File;
import java.util.Date;
public class Exercise1 {

	public static void main(String[] args) {
			File file = new File("E:\\");
			String[] fileList = file.list();
			for (String name: fileList) {
			System.out.println(name);

	}

   }
}