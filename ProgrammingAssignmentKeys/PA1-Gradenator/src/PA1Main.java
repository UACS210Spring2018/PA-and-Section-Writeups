import java.util.Scanner;

/**
 * PA1Main.java, PA1-Gradenator assignment
 * 
 * Driver for the Gradenator assignment. This program expects input from
 * standard input.
 * 
 * Each line should be in the following format: <code>
 *      <string with no commas>, <number>%, <number> <number> ...
 * 
 * </code> Specifically a string with any characters except a comma, a comma, an
 * double in the inclusive range 0 to 100 [0,100], a comma, and one or more
 * doubles in the inclusive range 0 to 100 [0,100] separated by one or more
 * spaces. The Java Scanner class with its nextLine() method can handle whatever
 * line ending your file system uses.
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
 *      programming assignments, 25%, 76.67
 *      TOTAL = 35.17% out of 45%
 * </code>
 * 
 * This program assumes that all input follows the format. Any input that does
 * not follow the input format will result in undefined behavior.
 * 
 * ------------- Decomposition -------------
 * 
 * Using static methods within a single class. <code>
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
            double grade_possible = 0;
            double grade_accumulated = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(label(line) + ", " + weight(line) + "%, "
                        + avgGrade(line));
                grade_possible = grade_possible + weight(line);
                grade_accumulated = grade_accumulated
                        + avgGrade(line) * weight(line) / 100;
            }
            System.out.println("TOTAL = " + grade_accumulated + "% out of "
                    + grade_possible + "%");

            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Given a string, finds the substring before the first comma.
     * 
     * @return The string before the first comma.
     */
    public static String label(String str) {
        return str.substring(0, str.indexOf(","));
    }

    /**
     * Given a string, find the number between the first comma and a percent
     * symbol. (e.g. weight("assdfff ;, 42 % whatevs") ==> 42
     * 
     * @return The number found as a double.
     */
    public static double weight(String str) {
        String strAfterComma = str.substring(str.indexOf(",") + 1);
        String strBeforePercent = strAfterComma.substring(0,
                strAfterComma.indexOf("%"));
        return Double.valueOf(strBeforePercent);
    }

    /**
     * Given a string, find the space separated doubles after the second comma,
     * add them up, and return their average (e.g. weight(",, 3 4.2 5") ==> 4.4
     * )
     * 
     * @return The average of the numbers listed after the second comma in str.
     */
    public static double avgGrade(String str) {
        int firstCommaIndex = str.indexOf(",");
        String strAfter1stComma = str.substring(firstCommaIndex + 1);
        int secondCommaIndex = strAfter1stComma.indexOf(",");
        String strAfter2ndComma = (strAfter1stComma
                .substring(secondCommaIndex + 1)).trim();
        String[] nums = strAfter2ndComma.split("\\s+");
        double sum = 0;
        int count = 0;
        for (String n : nums) {
            sum = sum + Double.valueOf(n);
            count = count + 1;
        }
        return sum / count;
    }

}
