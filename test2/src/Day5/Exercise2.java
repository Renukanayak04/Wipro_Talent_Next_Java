package Day5;

import java.io.File;
import java.io.FilenameFilter;

public class Exercise2 {

    public static void main(String a[]) {
        // Create a File object for the directory E:\
        File file = new File("E:\\");
        
        // Use the list method with a FilenameFilter to get only files that end with ".py"
        String[] list = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                // Accept only files with ".py" extension (case insensitive)
                if (name.toLowerCase().endsWith(".py")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        
        // Print all the filenames that match the filter
        for (String f : list) {
            System.out.println(f);
        }
    }
}
