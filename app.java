import java.util.List;
import solution.task1;

public class app {

    public static void main(String[] args) {
        
        List<Integer> sortArr = task1.randomFill();
        List<Integer> result = task1.mergeSort(sortArr);
        System.out.println(result);


        
    }
}