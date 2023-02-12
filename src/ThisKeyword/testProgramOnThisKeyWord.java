package ThisKeyword;

public class testProgramOnThisKeyWord {
    int x = 6;

    testProgramOnThisKeyWord(int x) {
        this.x = x;


    }

    public static void main(String[] args) {

        testProgramOnThisKeyWord t = new testProgramOnThisKeyWord(5);
        System.out.println(t.x);

    }
}
