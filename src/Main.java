import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        addOne(998);
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

}
