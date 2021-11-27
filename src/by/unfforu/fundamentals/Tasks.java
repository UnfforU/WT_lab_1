package by.unfforu.fundamentals;


import java.util.Scanner;

public class Tasks {
    private Scanner in = new Scanner(System.in);


    public void task_1()
    {
        System.out.print("X = ");
        double x = in.nextDouble();

        System.out.print("Y = ");
        double y = in.nextDouble();

        double result = (1 + Math.pow(Math.sin(x+y), 2)) / (2 + Math.abs(x - 2*x / (1 + x*x*y*y))) + x;
        System.out.println("Result = " + result);
    }

    public void task_2(){
        System.out.print("X = ");
        double x = in.nextDouble();

        System.out.print("Y = ");
        double y = in.nextDouble();

        final int x1 = 4;
        final int x2 = 6;
        final int y1 = 5;
        final int y2 = -3;

        if (y < 0){
            System.out.println((y > y2) && (Math.abs(x) < x2) ? ("true") : ("false"));
        }
        else
        {
            System.out.println((y < y1) && (Math.abs(x) < x1) ? ("true") : ("false"));
        }
    }

    public void task_3()
    {
        System.out.print("A = ");
        double a = in.nextDouble();

        System.out.print("B = ");
        double b = in.nextDouble();

        System.out.print("H = ");
        double h = in.nextDouble();

        double x = a;
        while (x < b)
        {
            System.out.print(x + " " + Math.tan(x) + "\n");
            x += h;
        }
    }

    public void task_4()
    {
        int[] mass = GetArray();
        int len = mass.length;

        System.out.println("Result: ");
        for(int i = 0;i < len; i++)
        {
            boolean isSimple = true;
            for (int j = 2; j < Math.round(Math.sqrt(mass[i])) + 1; j++)
            {
                if (mass[i] % j == 0){ isSimple = false; }
            }
            if (isSimple) { System.out.println(i); }
        }
    }

    public void task_5()
    {
        int[] mass = GetArray();
        int len = mass.length;

        boolean isUp;
        int currPos;
        int maxLen = 0;
        for(int i = 0; i < len; i++)
        {
            isUp = true;
            currPos = 1;
            for(int j = i + 1; (j < len) && isUp; j++)
            {
                if(mass[j - 1] < mass[j]) {currPos++;}
                else {isUp = false;}
            }

            maxLen = (maxLen > currPos) ? maxLen : currPos;
        }

        System.out.println(maxLen);
    }

    public void task_6()
    {
        int[] mass = GetArray();
        int len = mass.length;

        int pos = 0;
        for (int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                System.out.print(mass[(j+pos) % len]);
            }
            pos++;
            System.out.println();
        }
    }

    public void task_7()
    {
        System.out.print("len=");
        int len = in.nextInt();
        double[] arr = new double[len];
        System.out.print("array[]=");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextDouble();
        }

        int i = 0;
        while (i < len-1)
        {
            if(arr[i] <= arr[i + 1])
                i++;
            else
            {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                if(i != 0)
                    i--;
            }
        }

        for (i = 0; i < len; i++)
        {
            System.out.print(arr[i]);
            System.out.print("  ");
        }
    }

    public void task_8() {
        System.out.print("len A=");
        int lenA = in.nextInt();
        double[] arrA = new double[lenA];
        System.out.print("array A[]=");
        for (int i = 0; i < lenA; i++) {
            arrA[i] = in.nextDouble();
        }

        System.out.print("len B=");
        int lenB = in.nextInt();
        double[] arrB = new double[lenB];
        System.out.print("array B[]=");
        for (int i = 0; i < lenB; i++) {
            arrB[i] = in.nextDouble();
        }


        int posA = 0, posB = 0, index = 0;

        while (posA < lenA) {
            if (arrB[posB] < arrA[posA]) {
                System.out.print(index);
                System.out.print("  ");
                posB++;
            } else {
                posA++;
                index++;
            }

        }

        while (posB != lenB) {
            System.out.print(index);
            System.out.print("  ");
            posB++;
        }
    }

    private int[] GetArray()
    {
        System.out.print("len = ");
        int len = in.nextInt();
        int[] result = new int[len];
        System.out.println("array[] = ");
        for (int i = 0; i < len; i++) { result[i] = in.nextInt(); }

        return result;
    }

}
