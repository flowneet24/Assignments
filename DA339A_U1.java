/*
* Author: <full namne>
* Id: <computer id from Mau>
* Study program: <Sys/DT/...>
*/
import java.util.Scanner;

public class DA339A_U1 {
  static Scanner input = new Scanner(System.in); //can be removed if another solution is used that does not require this scanner-object
  static int passingGradeThreshold = 20; //change as you need when testing                                                 
  
  // an array to use for testing, replace as needed to test your code
  static String[][] resultsList = {{"Adam Ason", "14","U"},
                                 {"Berta Bson", "25","G"},
                                 {"Ceasar Cson", "17","U"},
                                 {"","",""},
                                 {"Diva Dson","20","G"},
                                 {"","",""},
                                 {"Evert Eson","",""},
                                 {"","",""},
                                 {"","",""},
                                 {"","",""},
                               };

 /*For testing at presentation do not erase this block
                                {{"Adam Ason", "14","U"},
                                 {"Berta Bson", "25","G"},
                                 {"Ceasar Cson", "17","U"},
                                 {"","",""},
                                 {"Diva Dson","20","G"},
                                 {"","",""},
                                 {"Evert Eson","",""},
                                 {"","",""},
                                 {"","",""},
                                 {"","",""},
                               };                            
 */


 /* Parameters for methods below may NOT be changed and HAVE TO BE USED as intended for a passing grade.*/

  /**
   * This method makes sure to print the information about the persons in the result list 
   * (name, score and grade) from the result list in the terminal for the user. 
   * The print out shall show name, score (if set), grade (if set) and a number representing the person's place in the result list. 
   * Empty places in the result list will NOT be shown.
   */
  public static void printPersonsInformation() {
    System.out.println("You chose to print the information of the persons in the result list"); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method makes sure to print the whole result list in the terminal for the user. 
   * If a place in the result list contains data for a person the person's name, score (if set) and grade (if set) is shown. 
   * If a place in the result list is empty a text stating that the place in empty is shown. 
   * In both cases a number representing the place in the result list is shown.
   */
  public static void printResultList() {
    System.out.println("You chose to print the result list"); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method makes sure to print statistics about the result list to the user. 
   * The following statistics shall be shown:
   * -	Total number of persons taking the test in the list regardless of whether a score is set or not
   * -	Total number of persons with a passing grade G
   * -	Total number of persons that failed grade U
   * -	The highest score and namne of the person with that score and the given grade
   * -	The lowest score and namne of the person with that score and the given grade
   */
  public static void printStatistics() {
    System.out.println("You chose to print statistics"); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method adds a person to the result list. 
   * The information that is added to the result list is defined in the method parameters. 
   * If a user tries to add a person to a full result list an error messages informing the user 
   * about this will be shown and no person added to the list.
   * @param name The name of the person to add
   * @param score The score of the person to add as an int, if this is a negative value no score is set.
   */
  public static void addPerson(String name, int score) {
    System.out.println("You chose to add a person"); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method changes the name of a specific person in the result list. 
   * Which persons's name is changed is decided by a method parameter. 
   * If a user tries to change the name at a place in the list that has 
   * no current person an error message informing the user about this 
   * will be shown and no data in the result list is changed.
   * @param index The index of the person whose name shall be changed.
   * @param newName The new name of the person at place given by index.
   */
  public static void changeNameOfPerson(int index, String newName) {
    System.out.println("You chose to change the name of a person"); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method changes the score for a specific person in the result list. 
   * Which person's score is changed is decided by a method parameter. 
   * If a user tries to change the score at a place in the list that has 
   * no current person an error message informing the user about this 
   * will be shown and no data in the result list is changed.
   * @param index The index of the person whose score shall be changed.
   * @param newScore The new score, as an int, of the person at place given by index. If this is a negative value no score is set.
   */
  public static void changeScoreForPerson(int index, int newScore) {
    System.out.println("You chose to change the score of a person"); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method removes a person at a given index from the result list. 
   * The data at this index is replaced by empty Strings. 
   * If no person exists at the given index an error message informing 
   * the user about this will be shown and no data in the result list is changed.
   * @param index The index of the place where a person is to be removed.
   */
  public static void removePerson(int index) {
    System.out.println("You chose to remove a person"); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method changes places in the result list for the data existing 
   * at those places given by the parameters. It is possible to change 
   * places between data even if one or both places contains empty strings. 
   * This gives the user the possibility to change the place of one person 
   * to an empty place in the result list.  
   * If the two parameters have the same value an error message informing 
   * the user about this will be shown and no data in the result list is changed.
   * @param index1 First index involved in the change of places
   * @param index2 Second index involved in the change of places
   */
  public static void changePlaces(int index1, int index2) {
    System.out.println("You chose to switch places between index "+index1+" and "+index2); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method prints the program menu in the terminal for the user to view.
   * This printout shall also inform the user about the threshold for a passing grade
   * stored in variable passingGradeThreshold.
   */
  public static void printMenu() {
    System.out.println("Program menu"); //you don't need to keep this line
    // Add your code here
  }

  /**
   * This method reads the menu choice from the user and returns the choice the user made as an integer.
   * @return The menu choice made by the user represented by an integer value of type int.
   */
  public static int readMenuChoice() {
    System.out.println("Make menu choice"); //you don't need to keep this line
    // Add your code here
    return 0; //line can be removed later if needed, needed like this to compile the code template
  }


  public static void main(String[] args) {
    System.out.println("You started the program"); //this line can be removed
     // Add you code here with the loop that handles the user's menu choices.
     // Do not forget to read the threshold of the passing grade as the program starts 
     // and store it in the variable passingGradeThreshold.
  }
}
