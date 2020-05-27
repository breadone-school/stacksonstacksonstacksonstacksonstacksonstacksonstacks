import java.io.Reader;

import sun.font.SunFontManager.FamilyDescription;

public class stacksonstacksonstacks {
    public static void main(String[] args) throws Exception {
        stacksonstacksonstacksonstacks();
        stacksonstacksonstacks stacks = new stacksonstacksonstacks();
    }

    public static void stacksonstacksonstacksonstacks() {         
        int stacksonstacks[] = new int[20];
        int TOS = 0;

        System.out.print("push or pop: ");

        if (System.console().readLine() == "push") {
            if (TOS == stacksonstacks.length) {
                System.out.println("stack is full");
            }  else {
                TOS += 1;
                System.out.print("what to add: ");
                stacksonstacks[TOS] = Integer.parseInt(System.console().readLine());
            } 

       } else if (System.console().readLine() == "pop") {
            if (TOS == 0) {
                System.out.println("stack empty");
            } else {
                TOS -= 1;
                System.out.println(stacksonstacks[TOS]);
            }
       }
    }

    public static void qs() {
        int[] qs = new int[20];
        boolean flag = false;
        int tail =0;

        for (int i = 0; i < qs.length; i++) {
            if (qs[i] != 0) {
                flag = false;
                break;
            }   
        }

        if (flag == false) {
            System.out.println("enter new value");
            int newitem = Integer.parseInt(System.console().readLine());
            tail += 1;

            qs[tail] = newitem;
        }
    }


}
