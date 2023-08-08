public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 31; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for(int i = 30; i > -1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for(int i = 0; i < 19; i = i + 3) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for(int i = 10; i > -1; i = i - 2) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

        for(int i = 6; i > -1; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}