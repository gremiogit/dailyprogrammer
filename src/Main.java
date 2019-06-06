import java.util.*;

public class Main {

    public static void main(String[] args){

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

    private static boolean balanced(String str){
        if(str.isEmpty()){
            return true;
        }
        int xCount = 0;
        int yCount = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x'){
                xCount++;
            }
            if(str.charAt(i) == 'y'){
                yCount++;
            }
        }

        return xCount == yCount;
    }

    private static boolean balanced_bonus(String str){
        if(str.isEmpty()){
            return true;
        }else if(str.length() == 1){
            return true;
        }

        boolean balanced = true;
        char[] letters = str.toCharArray();

        char firstLetter = letters[0];
        int firstLetterCount = 0;

        for(char letter : letters){
            if(letter == firstLetter){
                firstLetterCount++;
            }
        }

        for(int i = 1; i < str.length(); i++){
            int letterCount = 0;
            for(char letter : letters){
                if(letter == letters[i]){
                    letterCount++;
                }
            }
            if(letterCount != firstLetterCount){
                balanced = false;
            }
        }
        return balanced;

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

    private static boolean funnel(String str1, String str2){
        boolean result = false;

        for(int i = 0; i < str1.length(); i++){
            StringBuilder tmp = new StringBuilder(str1);
            tmp.deleteCharAt(i);

            if(tmp.toString().equals(str2)){
                result = true;
            }
        }
        return result;
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

//    ***************************************************************************************************
//    ***************************************************************************************************

//    [2018-06-11] Challenge #363 - I before E except after C

//    "I before E except after C" is perhaps the most famous English spelling rule.
//    For the purpose of this challenge, the rule says:
//
//    If "ei" appears in a word, it must immediately follow "c".
//    If "ie" appears in a word, it must not immediately follow "c".
//    A word also follows the rule if neither "ei" nor "ie" appears anywhere in the word.
//    Examples of words that follow this rule are:
//
//    fiery hierarchy hieroglyphic
//    ceiling inconceivable receipt
//    daily programmer one two three

//    There are many exceptions that don't follow this rule, such as:
//
//    sleigh stein fahrenheit
//    deifies either nuclei reimburse
//    ancient juicier societies

//    Challenge:

//    Write a function that tells you whether or not a given word follows the "I before E except after C" rule.
//
//    check("a") => true
//    check("zombie") => true
//    check("transceiver") => true
//    check("veil") => false
//    check("icier") => false

    private static boolean check(String str){

    }

//    ***************************************************************************************************
//    ***************************************************************************************************

//    [2018-05-14] Challenge #361 - Tally Program

//    5 Friends (let's call them a, b, c, d and e) are playing a game and need to keep track of the scores.
//    Each time someone scores a point, the letter of his name is typed in lowercase.
//    If someone loses a point, the letter of his name is typed in uppercase.
//    Give the resulting score from highest to lowest.
//
//    Input Description: A series of characters indicating who scored a point.
//
//    Examples:
//
//    abcde
//    dbbaCEDbdAacCEAadcB

//    Output Description:

//    The score of every player, sorted from highest to lowest. Examples:
//
//    a:1, b:1, c:1, d:1, e:1
//    b:2, d:2, a:1, c:0, e:-2

//    Challenge Input:
//    EbAAdbBEaBaaBBdAccbeebaec

    private static void tallyScores(String str){
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;
        int scoreD = 0;
        int scoreE = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                scoreA++;
            }else if(str.charAt(i) == 'A'){
                scoreA--;
            }else if(str.charAt(i) == 'b'){
                scoreB++;
            }else if(str.charAt(i) == 'B'){
                scoreB--;
            }else if(str.charAt(i) == 'c'){
                scoreC++;
            }else if(str.charAt(i) == 'C'){
                scoreC--;
            }else if(str.charAt(i) == 'd'){
                scoreD++;
            }else if(str.charAt(i) == 'D'){
                scoreD--;
            }else if(str.charAt(i) == 'e'){
                scoreE++;
            }else if(str.charAt(i) == 'E'){
                scoreE--;
            }
        }

        System.out.println("a:" + scoreA + ", " + "b:" + scoreB + ", " + "c:" + scoreC + ", " + "d:" + scoreD + ", " + "e:" + scoreE);
    }

}
