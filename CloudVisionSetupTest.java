import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This code allows you to test if your setup for
 * Google Cloud Vision is working.
 */
public class CloudVisionSetupTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Prompt the user for the filename or URL
        // using a JOptionPane here since IntelliJ's console input for URLs causes problems
        String filenameOrURL = JOptionPane.showInputDialog("Enter image filename or URL:");

        // Call the (static) detectImageLabels method with the specified filename or URL
        // which returns an ArrayList of Strings which are the labels (objects)
        // detected in the image by Google Cloud Vision
        ArrayList<String> labels = GoogleCloudVision.detectImageLabels(filenameOrURL);

        // Display the ArrayList of labels to the user
        JOptionPane.showMessageDialog(null, labels);
    } // end main

} // end class CloudVisionSetupTest
