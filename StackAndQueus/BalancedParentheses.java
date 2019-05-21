package StackAndQueus;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {

        String[] brackets =new  Scanner(System.in).nextLine().split("");

        ArrayDeque<String> in = new ArrayDeque<>();
        int lenght = brackets.length;
        boolean isTrue = true;
        if(lenght%2==0) {
            for (int i = 1; i <=lenght; i++) {
                if(brackets[i-1].equals("(") || brackets[i-1].equals("{") || brackets[i-1].equals("[") ) {
                    in.push(brackets[i-1]);
                }else{
                    if(in.size()>=1) {
                        String test = in.pop();

                        if((test.equals("(") && brackets[i-1].equals(")") ) || (test.equals("[") && brackets[i-1].equals("]") ) || (test.equals("{") && brackets[i-1].equals("}"))){
                                continue;
                        }else{
                            isTrue= false;
                            break;
                        }
                    }else{
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }else{
            isTrue=false;
        }
        if(isTrue){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
