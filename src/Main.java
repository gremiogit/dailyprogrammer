import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

//    ***************************************************************************************************
//                            REDDIT DAILY PROGRAMMING CHALLENGES (reddit.com/r/dailyprogrammer/)
//    ***************************************************************************************************

//    [2019-04-08] Challenge #377 - Axis-aligned crate packing

//    You have a 2-dimensional rectangular crate of size X by Y, and a bunch of boxes, each of size x by y.
//    The dimensions are all positive integers.

//    Given X, Y, x, and y, determine how many boxes can fit into a single crate if they have to be placed so that
//    the x-axis of the boxes is aligned with the x-axis of the crate, and the y-axis of the boxes is aligned with
//    the y-axis of the crate.
//    That is, you can't rotate the boxes. The best you can do is to build a rectangle of boxes as large as possible
//    in each dimension.
//
//    For instance, if the crate is size X = 25 by Y = 18, and the boxes are size x = 6 by y = 5, then the answer is 12.
//    You can fit 4 boxes along the x-axis (because 6*4 <= 25), and 3 boxes along the y-axis (because 5*3 <= 18), so in
//    total you can fit 4*3 = 12 boxes in a rectangle.

//    Examples:

//    fit1(25, 18, 6, 5) => 12
//    fit1(10, 10, 1, 1) => 100
//    fit1(12, 34, 5, 6) => 10
//    fit1(12345, 678910, 1112, 1314) => 5676
//    fit1(5, 100, 6, 1) => 0

    private static int fit1(int crateX, int crateY, int boxX, int boxY){
        int resultX = crateX / boxX;
        int resultY = crateY / boxY;
        return resultX * resultY;
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    [2019-02-11] Challenge #375 - Print a new number by adding one to each of its digit

//    A number is input in computer then a new no should get printed by adding one to each of its digit.
//    If you encounter a 9, insert a 10 (don't carry over, just shift things around).
//
//    For example, 998 becomes 10109.
//
//    Bonus:
//
//    This challenge is trivial to do if you map it to a string to iterate over the input,
//    operate, and then cast it back.
//    Instead, try doing it without casting it as a string at any point,
//    keep it numeric (int, float if you need it) only.

    private static void addOne(int n){

        ArrayList<Integer> nums = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        while(n > 0){
            st.push(n % 10);
            n /= 10;
        }

        while(!st.empty()){
            nums.add(st.pop());
        }

        for(int i = 0; i < nums.size(); i++){
            nums.set(i, nums.get(i) + 1);
            System.out.print(nums.get(i));
        }
    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    [2019-01-28] Challenge #374 - Additive Persistence

//    Today's challenge is to calculate the additive persistence of a number,
//    defined as how many loops you have to do summing its digits until you get a single digit number.

//    Take an integer N:
//
//    Add its digits
//    Repeat until the result has 1 digit
//    The total number of iterations is the additive persistence of N.
//
//    Your challenge today is to implement a function that calculates the additive persistence of a number.
//
//    Examples:
//        13 -> 1
//        1234 -> 2
//        9876 -> 2
//        199 -> 3

//    Bonus:
//    The really easy solution manipulates the input to convert the number to a string and iterate over it.
//    Try it without making the number a strong, decomposing it into digits while keeping it a number.
//
//    On some platforms and languages, if you try and find ever larger persistence values you'll
//    quickly learn about your platform's big integer interfaces (e.g. 64 bit numbers).

    private static void additivePers(int n){

    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    [2019-01-14] Challenge #372 - Perfectly balanced

//    Given a string containing only the characters x and y, find whether there are the same number of x's and y's.
//
//    balanced("xxxyyy") => true
//    balanced("yyyxxx") => true
//    balanced("xxxyyyy") => false
//    balanced("yyxyxxyxxyyyyxxxyxyx") => true
//    balanced("xyxxxxyyyxyxxyxxyy") => false
//    balanced("") => true
//    balanced("x") => false

//    Optional bonus:

//    Given a string containing only lowercase letters, find whether every letter that appears
//    in the string appears the same number of times. Don't forget to handle the empty string ("") correctly!
//
//    balanced_bonus("xxxyyyzzz") => true
//    balanced_bonus("abccbaabccba") => true
//    balanced_bonus("xxxyyyzzzz") => false
//    balanced_bonus("abcdefghijklmnopqrstuvwxyz") => true
//    balanced_bonus("pqq") => false
//    balanced_bonus("fdedfdeffeddefeeeefddf") => false
//    balanced_bonus("www") => true
//    balanced_bonus("x") => true
//    balanced_bonus("") => true

    private static void balanced(String str){

    }

    private static void balanced_bonus(String str){

    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    [2018-11-26] Challenge #369 - Hex colors
//
//    One common way for software specifications such as HTML to specify colors is with a hexadecimal string.
//    For instance the color aquamarine is represented by the string "#7FFFD4". Here's how the string breaks down:
//
//    The first character is always "#".
//    The second and third character are the red channel value, represented as a hexadecimal value between 00 and FF.

//    In this example, the red channel value is 127, which in hexadecimal is 7F.
//    The fourth and fifth character are the green channel value, represented the same way.

//    In this example, the green channel value is 255, which in hexadecimal is FF.
//    The sixth and seventh character are the blue channel value, represented the same way.

//    In this example, the blue channel value is 212, which in hexadecimal is D4.
//    All three channel values must be an integer between 0 (minimum brightness) and 255 (maximum brightness).

//    In all cases the hex values are two digits each, including a leading 0 if necessary.
//    See the Wikipedia page for more examples, and a link for how to convert a number to hexadecimal.

//    Challenge:
//
//    Given three integers between 0 and 255, corresponding to the red, green, and blue channel values of a color,
//    find the hex string for that color. You may use anything built into your programming language,
//    such as for base conversion, but you can also do it manually.

//    Examples:

//    hexcolor(255, 99, 71) => "#FF6347"  (Tomato)
//    hexcolor(184, 134, 11) => "#B8860B"  (DarkGoldenrod)
//    hexcolor(189, 183, 107) => "#BDB76B"  (DarkKhaki)
//    hexcolor(0, 0, 205) => "#0000CD"  (MediumBlue)

//    Optional bonus: color blending

//    Given a list of hex color strings, produce the hex color string you get from averaging their RGB values together.
//    You'll need to round channel values to integers.
//
//    blend({"#000000", "#778899"}) => "#3C444C"
//    blend({"#E6E6FA", "#FF69B4", "#B0C4DE"}) => "#DCB1D9"

    private static void hexcolor(int red, int green, int blue){

    }

    private static void blend(String color1, String color2){

    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    [2018-08-20] Challenge #366 - Word funnel 1

//    Given two strings of letters, determine whether the second can be made from the first by removing one letter.
//    The remaining letters must stay in the same order.

//    Examples:

//    funnel("leave", "eave") => true
//    funnel("reset", "rest") => true
//    funnel("dragoon", "dragon") => true
//    funnel("eave", "leave") => false
//    funnel("sleet", "lets") => false
//    funnel("skiff", "ski") => false

    private static void funnel(String str1, String str2){

    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    [2018-06-18] Challenge #364 - Create a Dice Roller

//    Input description:

//    Your input will contain one or more lines, where each line will be in the form of "NdM"; for example:
//
//            3d6
//            4d12
//            1d10
//            5d4
//
//    The first number is the number of dice to roll, the d just means "dice",
//    it's just used to split up the two numbers, and the second number is how many sides the dice have.
//    So the above example of "3d6" means "roll 3 6-sided dice". Also, just in case you didn't know, in D&D,
//    not all the dice we roll are the normal cubes. A d6 is a cube, because it's a 6-sided die,
//    but a d20 has twenty sides, so it looks a lot closer to a ball than a cube.
//
//    The first number, the number of dice to roll, can be any integer between 1 and 100, inclusive.
//
//    The second number, the number of sides of the dice, can be any integer between 2 and 100, inclusive.
//
//    Output description:

//    You should output the sum of all the rolls of that specified die, each on their own line.
//    so if your input is "3d6", the output should look something like:
//
//    14

//    Just a single number, you rolled 3 6-sided dice, and they added up to 14.
//
//    Challenge Input:

//        5d12
//        6d4
//        1d2
//        1d8
//        3d6
//        4d20
//        100d100

//    Challenge Output:

//    [some number between 5 and 60, probably closer to 32 or 33]
//    [some number between 6 and 24, probably around 15]
//    [you get the idea]
//
//    Bonus:
//
//    In addition to the sum of all dice rolls for your output, print out the result of each roll on the same line,
//    using a format that looks something like
//
//        14: 6 3 5
//        22: 10 7 1 4
//        9: 9
//        11: 3 2 2 1 3

//    You could also try setting it up so that you can manually input more rolls,
//    that way you can just leave the program open and every time you want to roll more dice,
//    you just type it in and hit enter.

    private static void diceRoll(String roll){
        
    }
}
