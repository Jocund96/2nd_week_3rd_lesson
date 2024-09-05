//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* A class describes what an object knows
and
what an object does
and
how it does*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        TV rc1= new TV();
        int j = 0;
        System.out.println("Please press the button");
        System.out.println("Firstly turn on the TV with button !" +
                "\npress z or Z to exit");
        Scanner input = new Scanner(System.in);
        String mainInput = input.next();
        int[] x= toChar(mainInput);
        //System.out.println("\nHow works toChar");
        //System.out.println(x);
        //System.out.println("How works toStr");
        String[] y = toStr(x);
        //System.out.println("\nPrint y:");
        //for(int i=0;i<y.length;i++){
        //    System.out.print(y[i]);
        //}
        int result =0;
        if (x[0]==33){
            while ( j==0) {
                    rc1.turnOn();
                    String mainInput1 = input.next();
                    //System.out.println("Please press the button or choose the channel");
                    x= toChar(mainInput1);
                    //System.out.println("\nHow works toChar");
                    //System.out.println(x);
                    //System.out.println("How works toStr");
                    y = toStr(x);
                    //System.out.println("\nPrint y:");
                    //System.out.println("x0 is"+x[0]);
                    //for(int i=0;i<y.length;i++){
                    //    System.out.print(y[i]);
                    //}
                    for(int i=0; i<x.length;i++){
                        if (x[i]>=48 && x[i]<=57) {
                            StringBuilder sb = new StringBuilder();
                            for (String s : y){
                                sb.append(s);
                            }
                            //System.out.println("\nsb\n"+sb);
                            result=toInt(new StringBuilder(sb));
                            //System.out.println("x is "+x[i]);
                            //System.out.println(" ");
                            //rc1.outChannelNumber(result);
                        } else if (x[0] == 43) {// press +
                            rc1.volumeUp();
                        } else if (x[0] == 45) {// press -
                            rc1.volumeDown();
                        } else if (x[0] == 62) {// press >
                            rc1.channelUp();
                        } else if (x[0]==60) {// press <
                            rc1.channelDown();
                        }else if (x[0] ==122 || x[0]==90) {//press z or Z to exit
                            rc1.turnOff();
                            j=1;
                        }
                    }
                rc1.setChannel(result);
            }

        }else if (x[0]==120 || x[0]==88) {
                rc1.turnOff();
            }
    }
    static int[] toChar(String character){
        int[] res = new int[character.length()];
        for (int i=0; i<character.length();i++){
            res[i] = character.toCharArray()[i];
            }
        //System.out.print(Arrays.toString(res));
        return res;
    }
    static String[] toStr(int[] arrNumber){
        String[] res = new String[arrNumber.length];
        for (int i = 0; (i < arrNumber.length); i++){
            res[i] = String.valueOf((char) arrNumber[i]);
            //System.out.print(res[i]+"\n");
        }
        return res;
    }
    static int toInt (StringBuilder sb){
        //System.out.println("\nInteger is "+result);
        return Integer.parseInt(sb.toString());
    }
}


