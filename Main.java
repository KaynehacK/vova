import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        out.printf("Enter a code of task in accordance with a table:\n" +
                "Task code:\t| 1 | 2 | 3 | 4 |  5 | 6 | 7 | 8 | 9 | 10 | 11| 12| 13| 14| 15 | 16| 17| 18| 19| 20 |\n" +
                "Task number:|1.2|1.4|1.6|1.8|1.10|2.2|2.4|2.6|2.8|2.10|3.2|3.4|3.6|3.8|3.10|4.2|4.4|4.6|4.8|4.10|\n" +
                "Code of task: ");
        int task = m.InputInt(1,20);
        switch (task)
        {
            case 1:{
                out.printf("Task 1.2: Calculation the sum of last two digits of number. \n" +
                        "Enter a whole number: ");
                int a = m.InputInt();
                out.println("The sum of last two digits of number: " + m.sumLastNums(a));
                break;
            }
            case 2:{
                out.printf("Task 1.4: Determination of positivity of a number. \n" +
                        "Enter a whole number: ");
                int a = m.InputInt();
                out.println("The response is: " + m.isPositive(a));
                break;
            }
            case 3:{
                out.printf("Task 1.6: Determination whether the character is Upper-cased Latin letter.\n" +
                        "Enter Latin character: ");
                String s = m.InputString(1,1);
                char c = s.charAt(0);
                out.println("The response is: " + m.isUpperCase(c));
                break;
            }
            case 4:{
                out.printf("Task 1.8: Determination whether one of two numbers is a divisor of the other.\n" +
                        "Enter the first whole number: ");
                int a = m.InputInt();
                out.printf("Enter the second whole number: ");
                int b = m.InputInt();
                out.println("The response is: " + m.isDivisor(a, b));
                break;
            }
            case 5:{
                out.printf("Task 1.10: Calculation the sum of last digits of five number.\n" +
                           "1. Enter a whole number: ");
                int Res = m.InputInt();
                for (int i = 2; i < 6; i ++) {
                    out.printf(i + ". Enter a whole number: ");
                    Res = m.lastNumSum(Res, m.InputInt());
                    out.println(" Intermediate result is: " + Res);
                }
                out.printf("The overall result is: " + Res);
                break;
            }
            case 6:{
                out.printf("Task 2.2: Safe division one number by another.\n" +
                        "Enter the divisible (whole number): ");
                int x = m.InputInt();
                out.printf("Enter the divisor (whole number): ");
                int y = m.InputInt();
                out.printf("The response is: " + m.safeDiv(x,y));
                break;
            }
            case 7:{
                out.printf("Task 2.4: Comparing two numbers.\n" +
                        "Enter the first whole number: ");
                int x = m.InputInt();
                out.printf("Enter the second whole number: ");
                int y = m.InputInt();
                out.printf("The response is: " + m.makeDecision(x,y));
                break;
            }
            case 8:{
                out.printf("Task 2.6: Determination whether the sum of any two numbers is equal to the third number.\n" +
                        "Enter the first whole number: ");
                int x = m.InputInt();
                out.printf("Enter the second whole number: ");
                int y = m.InputInt();
                out.printf("Enter the third whole number: ");
                int z = m.InputInt();
                out.printf("The response is: " + m.sum3(x,y,z));
                break;
            }
            case 9:{
                out.printf("Task 2.8: Determining the appropriate form of the word \"year\".\n" +
                        "Enter a whole number of years: ");
                int x = m.InputInt();
                out.printf("The response is: " + m.age(x));
                break;
            }
            case 10: {out.printf("Task 2.10: Printing all days of the week starting with the entered.\n" +
                    "Enter the name of a day of the week: ");
                m.printDays(m.InputString(0,Integer.MAX_VALUE));
                break;
            }
            case 11: {
                out.printf("Task 3.2: Printing all whole numbers from the entered to zero.\n" +
                        "Enter a whole number: ");
                int x = m.InputInt();
                out.println("The response is: \n"+m.reverseListNums(x));
                break;
            }
            case 12: {
                out.printf("Task 3.4: Exponentiation of a number.\n" +
                        "Enter a whole number to be raised to a power: ");
                int x = m.InputInt();
                out.printf("Enter a whole number to be an exponent: ");
                int y = m.InputInt(0,Integer.MAX_VALUE);
                out.println("The response is: "+m.pow(x,y));
                break;
            }
            case 13: {
                out.printf("Task 3.6: Determination whether all the digits in a number are the same. \n" +
                        "Enter the whole number: ");
                int x = m.InputInt();
                out.printf(String.valueOf("The response is: "+m.equalNum(x)));
                break;
            }
            case 14: {
                out.printf("Task 3.8: Printing a triangle of characters with inputed value of height \n" +
                        "Enter the positive whole number: ");
                m.leftTriangle(m.InputInt(0,Integer.MAX_VALUE));
                break;
            }
            case 15: {
                out.println("Task 3.10. Guess a number between 0 and 9. \n" +
                        "Enter the whole number between 0 and 9: ");
                m.guessGame();
                break;
            }
            case 16: {
                out.printf("Task 4.2: Determination an index of the last entering of a number into an array. \n" +
                        "Enter the array of whole numbers splitted by spaces: ");
                int[] arr = m.InputIntArray();
                out.printf("Enter the whole number to be found in the array: ");
                int x = m.InputInt();
                out.printf("The response is: "+String.valueOf(m.findLast(arr,x)));
                break;
            }
            case 17: {
                out.printf("Task 4.4: Adding a given number to a given array in a given position. \n" +
                        "Enter the array of whole numbers splitted by spaces: ");
                int[] arr = m.InputIntArray();
                out.printf("Enter the whole number to be added in the array: ");
                int x = m.InputInt();
                out.printf("Enter the integer value of the position where the number will be inserted: ");
                int pos = m.InputInt(0,arr.length);
                int[] res = m.add(arr,x,pos);
                out.println("Changed array:");
                for (int i = 0; i < res.length; i ++) {out.printf(String.valueOf(res[i])+" ");}
                break;
            }
            case 18: {
                out.printf("Task 4.6: Reversing the positions of values of an array. \n" +
                        "Enter the array of whole numbers splitted by spaces: ");
                int[] arr = m.InputIntArray();
                m.reverse(arr);
                out.println("The response is: ");
                for (int i = 0; i < arr.length; i ++) {out.printf(String.valueOf(arr[i])+" ");}
                break;
            }
            case 19: {
                out.printf("Task 4.8: Reversing the positions of values of an array. \n" +
                        "Enter the first array of whole numbers splitted by spaces: ");
                int[] arr1 = m.InputIntArray();
                out.printf("Enter the second array of whole numbers splitted by spaces: ");
                int[] arr2 = m.InputIntArray();
                int[] res = m.concat(arr1,arr2);
                out.println("The response is: ");
                for (int i = 0; i < res.length; i ++) {out.printf(String.valueOf(res[i])+" ");}
                break;
            }
            case 20: {
                out.printf("Task 4.10: Removing all the negative values from the given array. \n" +
                    "Enter the array of whole numbers splitted by spaces: ");
                int[] arr = m.InputIntArray();
                int[] res = m.deleteNegative(arr);
                out.println("The response is: ");
                for (int i = 0; i < res.length; i ++) {out.printf(String.valueOf(res[i])+" ");}
                break;
            }
        }
    }

    public int InputInt() {
        return InputInt(Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public int InputInt(int LoLim, int HiLim) {
        Scanner in = new Scanner(System.in);
        int Res;
        while (true) {
            String input = in.nextLine();
            try {
                Res = Integer.parseInt(input);
                if ( LoLim <= Res && Res <= HiLim ) return Res;
                else {
                    out.printf("The number is out of bounds. Please try again.\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                out.printf("Invalid input. Please try again.\n");
                continue;
            }
        }
    }

    public String InputString(int LoLim, int HiLim){
        Scanner in = new Scanner(System.in);
        String Res;
        while (true)
        {
            Res = in.nextLine();
            if (Res.length() >= LoLim && Res.length() <= HiLim) return Res;
            else
            {
                out.printf("Invalid count of characters. Please try again.\n");
                continue;
            }
        }
    }

    public int[] InputIntArray() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String input = in.nextLine();
            String[] words = input.split(" ");
            int count = 0;
            for (String word : words) {
                if (isNumber(word)) {count++;}
            }
            int[] numbers = new int[count];
            int index = 0;
            for (String word : words) {
                if (isNumber(word)) {
                    numbers[index++] = Integer.parseInt(word);
                }
            }
            if (numbers.length != 0) return numbers;
            else out.printf("Invalid input. Please try again.\n");
        }
    }

    private static boolean isNumber(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    //Task 1.2
    public int sumLastNums (int x) {
        return x%10 + x/10%10;
    }
    //Task 1.4
    public boolean isPositive (int x) {
        if (x>0) return true;
        else return false;
    }
    //Task 1.6
    public boolean isUpperCase (char x) {
        if (x>=65 && x <= 90) return true;
        else return false;
    }
    //Task 1.8
    public boolean isDivisor (int x, int y) {
        if (x==0 & y==0) return true;
        else if ((x==0 && y!=0) || (x!=0 && y==0)) return false;
        return (x%y==0 || y%x==0);
    }
    //Task 1.10
    public int lastNumSum(int a, int b) {
        return  Math.abs(a)%10 + Math.abs(b)%10;
    }
    //Task 2.2
    public double safeDiv (int x, int y) {
        if (y!=0) return 1.0*x/y;
        else return 0;
    }
    //Task 2.4
    public String makeDecision (int x, int y) {
        if (x>y) return String.valueOf(x)+" > "+String.valueOf(y);
        else if (x<y) return String.valueOf(x)+" < "+String.valueOf(y);
        else return String.valueOf(x)+" = "+String.valueOf(y);
    }
    //Task 2.6
    public boolean sum3 (int x, int y, int z) {
        return ( x+y == z || x+z == y || y+z == x);
    }
    //Task 2.8
    public String age (int x) {
        switch (Math.abs(x%10)) {
            case 1: {
                if (x!=11) return String.valueOf(x)+" год (roD) (god)";
                break;
            }
            case 2,3,4: {
                if (x!=12 && x!=13 && x!=14) return String.valueOf(x)+" года (roDa) (goda)";
                break;
            }
        }
        return String.valueOf(x)+" лет (JleT) (Let)";
    }
    //Task 2.10
    public void printDays (String x) {
        switch (x) {
            case "Monday","monday","MONDAY","Понедельник","понедельник","ПОНЕДЕЛЬНИК": {;
                printDay(0);
                break;
            }
            case "Tuesday","tuesday","TUESDAY","Вторник","вторник","ВТОРНИК": {
                printDay(1);
                break;
            }
            case "Wednesday","wednesday","WEDNESDAY","Среда","среда","СРЕДА": {
                printDay(2);
                break;
            }
            case "Thursday","thursday","THURSDAY","Четверг","четверг","ЧЕТВЕРГ": {
                printDay(3);
                break;
            }
            case "Friday","friday","FRIDAY","Пятница","пятница","ПЯТНИЦА": {
                printDay(4);
                break;
            }
            case "Saturday","saturday","SATURDAY","Суббота","субота","СУББОТА": {
                printDay(5);
                break;
            }
            case "Sunday","sunday","SUNDAY","Восресенье","воскресенье","ВОСКРЕСЕНЬЕ": {
                printDay(6);
                break;
            }
            default: {
                out.printf("This is not a day of the week.");
            }
        }
    }
    public void printDay(int x){
        if (x <= 0) out.println("Monday");
        if (x <= 1) out.println("Tuesday");
        if (x <= 2) out.println("Wednesday");
        if (x <= 3) out.println("Thursday");
        if (x <= 4) out.println("Friday");
        if (x <= 5) out.println("Saturday");
        if (x <= 6) out.println("Sunday");
    }
    //Task 3.2
    public String reverseListNums (int x) {
        String Res = String.valueOf(x)+" ";
        if (x==0) return Res;
        do {
            x -= x/Math.abs(x);
            Res += String.valueOf(x)+" ";
        } while (x!=0);
        return Res;
    }
    //Task 3.4
    public int pow (int x, int y) {
        int Res = 1;
        for (int i = 0; i<y; i++) Res *= x;
        return Res;
    }
    //Task 3.6
    public boolean equalNum (int x) {
        while (x/10!=0) {
            if (x%10 == (x/10)%10) x %= 10;
            else return false;
        }
        return true;
    }
    //Task 3.8
    public void leftTriangle (int x) {
        for (int i = 0; i<=x; i++) {
            for (int j=0; j<i; j++) {out.printf("*");}
            out.printf("\n");
        }
    }
    //Task 3.10
    public void guessGame() {
        Random rand = new Random();
        int x = rand.nextInt(10), y = -1, count = 0;
        while (x != y) {
            y = InputInt(0,9);
            count ++;
            if (x != y) out.println("Wrong. Try again.");
        }
        out.println("Number was guessed.  It took "+count+" attempts.");
    }
    //Task 4.2
    public int findLast (int[] arr, int x) {
        for (int i = arr.length-1; i >= 0; i--) {if (arr[i] == x) return i;}
        return -1;
    }
    //Task 4.4
    public int[] add (int[] arr, int x, int pos) {
        int[] res = new int[arr.length+1];
        int index = 0;
        for (int i = 0; i < pos; i++) {
            res[index++] = arr[i];
        }
        res[index++] = x;
        for (int i = index; i < arr.length+1; i++) {
            res[index++] = arr[i-1];
        }
        return res;
    }
    //Task 4.6
    public void reverse (int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    //Task 4.8
    public int[] concat (int[] arr1,int[] arr2) {
        int[] res = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {res[i] = arr1[i];}
        for (int i = 0; i < arr2.length; i++) {res[arr1.length+i] = arr2[i];}
        return res;
    }
    //Task 4.10
    public int[] deleteNegative (int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n>=0) count++;
        }
        int[] res = new int[count];
        count = 0;
        for (int n : arr) {
            if (n>=0) res[count++] = n;
        }
        return res;
    }
}