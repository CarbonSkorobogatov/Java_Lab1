package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp; //
        int fast; //

        Medicine Film1 = new Medicine();
        System.out.println("Хотите ли вы внести новый фильм? 1 - YES");

        //Как сделать тут поинты для перехода обратно к этому коду, чтобы не быть линейным
        temp = in.nextLine();
        try {
            fast = Integer.parseInt(temp);
        }
        catch (NumberFormatException e)
        {
            fast = 0;
            System.out.println("Во время выполнения кода сработала ошибка #0001 - некоректный ввод значений, пожалуйста попробуйте ещё раз");

        }

        System.out.println(fast);



    }
}
