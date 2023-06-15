import java.util.Collections;
import java.util.List;
import solution.task1;
import solution.task2;
import solution.task3;

public class app {

    public static void main(String[] args) {

        //Task1

        List<Integer> sortArr = task1.randomFill();
        List<Integer> result = task1.mergeSort(sortArr);
        System.out.println(result);

        //Task2

        List<Integer> mass = task2.randomFill();
        task2.getOddNumberList(mass);

        //Task3

        List<Integer> arr = task3.randomFill();

        System.out.println("Task3");
        System.out.println(arr);
        System.out.println("Максимальный элемент равен: " + Collections.max(arr));
        System.out.println("Минимальный элемент равен: " + Collections.min(arr));

        task3.getAverageAndMedian(arr);
    }
}