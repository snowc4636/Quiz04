
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        // welcome to the restaurant
        System.out.println(" Welcome to Chip's Fast Food Emporium ");
        // what burger do you want
        System.out.println(" Please enter a burger choice ");
        int burger =input.nextInt();
        
        if (burger == 1) {
            burger= 461;
        }
        if (burger ==2) {
            burger =431;
        }
        if (burger == 3) {
            burger=420;
        }
        if (burger ==4) {
            burger= 0;
        }
        // what side do you want
        System.out.println(" Please enter a side order choice ");
        int side = input.nextInt();
        if (side==1) {
            side=100;
        }
        if (side ==2) {
            side=57;
        }
        if (side ==3) {
            side= 70;
        }
        if (side ==4) {
            side=0;
        }
        //what drink do you want
        System.out.println(" Please enter a drink choice");
        int  drink = input.nextInt();
        if (drink ==1) {
            drink= 130;
        }
        if (drink ==2) {
            drink =160;
        }
        if (drink ==3) {
            drink =118;
        }
        if (drink ==4) {
            drink= 0;
        }
        //what dessert do you want
        System.out.println(" Please enter a dessert choice");
        int dessert = input.nextInt();
        if (dessert ==1) {
            dessert =167;
        }
        if (dessert ==2) {
            dessert =266;
        }
        if (dessert ==3) {
            dessert =75;
        }
        if (dessert ==4) {
            dessert =0;
        }
        //total calories
        int TotalCalories;
        TotalCalories = burger + side + drink + dessert;
        //calorie count
        System.out.println(" Your total calorie count is " + TotalCalories + ".");
                
    }
       
        
}
