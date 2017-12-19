import java.util.Scanner;

/**
 * PA1Main.java, PA1-Gradenator assignment
 * 
 * Driver for the Gradenator assignment. This program expects input from
 * standard input.
 * 
 * Each line should be in the following format: <code>
 *      <string with no commas>, <int>%, <int> <int> ...
 * 
 * </code> Specifically a string with any characters except a comma, a comma, an
 * integer in the inclusive range 0 to 100 [0,100], a comma, and one or more
 * integers in the inclusive range 0 to 100 [0,100] separated by one or more
 * spaces. The line will end in a newline (FIXME: does Java Scanner class handle
 * different line endings on different machines?).
 * 
 * Example input: <code>
 *      final, 20%, 80
 *      programming assignments, 25%, 90 60 80
 * </code>
 * 
 * An overall grade will be calculated by averaging the grades listed at the end
 * of each line (e.g. avg(90 60 80) ==> 76.67) and then computing a total grade
 * based on the percentages indicated on each line (e.g. 0.20*80 + 0.25*76.67
 * ==> 35.17). Note that if the input percentages do not add up 100%, then the
 * total grade will not be out of 100%. In the example above the best possible
 * grade would be 20% + 25% ==> 45%.
 *
 * The output will be the average grade per line and a total line. Example
 * output: <code>
 *      final, 20%, 80
 *      programming assignments, 25%, 76.67 (FIXME: default float format?)
 *      TOTAL = 35.17% out of 45%
 * </code>
 * 
 * This program assumes that all input follows the format. Any input that does
 * not follow the input format will result in undefined behavior.
 * 
 * ------------- Decomposition ------------- Using static methods within a
 * single class. <code>
 *      main:   will read each line from standard input, call routines to 
 *              process each line, and maintain overall grade
 *      
 *      label:  given the string for a line of input, returns the label string
 *              (e.g., label("programming assignments, 25%, 90 60 80") 
 *                  ==> "programming assignments"
 *      
 *      weight: given the string for a line will determine the percentage
 *              weight and will return it as a decimal 
 *              (e.g., weight("final, 20%, 80") ==> 0.20)
 *      
 *      avgGrade: given the string for a line will average the grades listed
 *              at the end of the line (e.g., avgGrade("programming assignments, 
 *              25%, 90 60 80") ==> 76.67)
 *</code>
 */

/**
 * @author mstrout
 *
 */
public class PA1Main {

    /**
     * @param args
     *            Command-line arguments are not being used.
     */
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            float overall_grade = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
