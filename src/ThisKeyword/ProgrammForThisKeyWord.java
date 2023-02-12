package ThisKeyword;

public class ProgrammForThisKeyWord {

    public static class test {
        int a;
        int b;

        test(int a, int b) {
            this.a = a;
            this.b = b;
        }

        void diaplay() {
            //Displaying value of variables a and b
            System.out.println("a = " + a + "  b = " + b);
        }
    }


    public static void main(String[] args) {

        test object = new test(3,3);
        object.a = 3;
        object.b = 4;
        object.diaplay();




    }

}
