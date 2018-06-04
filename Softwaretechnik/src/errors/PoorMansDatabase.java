package errors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * This class represents a very basic database that
 * just can save and load strings in a file using
 * a key. There are no further database functions like
 * relations, multiple attributes, transactions and so on.
 * 
 *  The class just serves as example to practice exception
 *  handling since it occasionally/randomly generates errors/
 *  exceptions
 *   
 * @author DrCJ
 * @version 0.1 2006-04-24
 *
 */
public class PoorMansDatabase {
  private File file;
  
  /**
   * Constructor creating file, FileReader and FileWriter
   * @param filename sth like c:\\temp\\mydatabase.csv
   * @throws IOException if file cannot be created or found
   */
  public PoorMansDatabase(String filename) throws IOException {
    file = new File(filename);
  }

  /**
   * Saves Strings in the DB (File)
   * @param key the "primary key"
   * @param value the value to be saved
   * @throws IOException --
   */
  public void save(int key, String value) throws IOException {
    FileReader fileReader = new FileReader(file);
    BufferedReader reader = new BufferedReader(fileReader);
    StringBuffer fileContent = new StringBuffer();
    boolean keyFound = false;;

    while (reader.ready()) {
      String line = reader.readLine();
      StringTokenizer toki = new StringTokenizer(line, ",");
      int key0 = Integer.parseInt(toki.nextToken());
      if (key == key0) {
        //there is already content with that key: replace it
        fileContent.append(key + "," + value + "\n");
        keyFound = true;
      }  else {
        fileContent.append(line + "\n");
      }
    }
    
    if (!keyFound){
      //content is new
      fileContent.append(key + "," + value + "\n");
    }
    
    reader.close();

    FileWriter writer = new FileWriter(file);
    writer.write(fileContent.toString());
    writer.flush();
    writer.close();
  }
  
  /**
   * Retrieves values from DB (file)
   * @param key the search key (primary key)
   * @return the value found with given key. Is <code>
   * null</code> if no value is found
   * @throws IOException --
   */
  public String load (int key) throws IOException {
    throwRandomError();
    FileReader fileReader = new FileReader(file);
    BufferedReader reader = new BufferedReader(fileReader);
    String foundContent= null;
    while (reader.ready()) {
      String line = reader.readLine();
      StringTokenizer toki = new StringTokenizer(line, ",");
      int key0 = Integer.parseInt(toki.nextToken());
      String value = toki.nextToken();
      if (key == key0) {
        foundContent = value;
      }
    }
    reader.close();
    return foundContent;
  }
  
  /**
   * Method simulates random database errors
   * @throws FileNotFoundException --
   */
  private void throwRandomError() throws FileNotFoundException {
    Random random = new Random();
    double number = random.nextGaussian() * 100;
    int intnumber = new Double(number).intValue();
    if ((intnumber % 4) == 0) {
      throw new FileNotFoundException("Problem number ;-) " + intnumber);
    }
  }
}