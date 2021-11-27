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
        System.out.print("len = ");
        int len = in.nextInt();
        int[] mass = new int[len];
        System.out.println("array[] = ");
        for (int i = 0; i < len; i++)
        {
            mass[i] = in.nextInt();
        }
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

    }
}
