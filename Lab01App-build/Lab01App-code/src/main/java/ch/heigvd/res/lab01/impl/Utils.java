package ch.heigvd.res.lab01.impl;

import java.util.logging.Logger;

/**
 *
 * @author Olivier Liechti
 * @author Maxime Guillod
 */
public class Utils {

  private static final Logger LOG = Logger.getLogger(Utils.class.getName());

  /**
   * This method looks for the next new line separators (\r, \n, \r\n) to extract
   * the next line in the string passed in arguments. 
   * 
   * @param lines a string that may contain 0, 1 or more lines
   * @return an array with 2 elements; the first element is the next line with
   * the line separator, the second element is the remaining text. If the argument does not
   * contain any line separator, then the first element is an empty string.
   */
  public static String[] getNextLine(String lines) {
    String sepearateurs[] = {"\n", "\r", "\r\n"};
    
    int cusrsor ;
    
    for (String sep : sepearateurs) {
      cusrsor = lines.indexOf(sep) ; 
      if(cusrsor > 0) {
        String[] retour = {
          lines.substring(0,cusrsor + sep.length()),
          lines.substring(cusrsor + sep.length(), lines.length())
        };
        return retour;
      } 
    }
    
    return new String[]{"",lines};
  }

}
