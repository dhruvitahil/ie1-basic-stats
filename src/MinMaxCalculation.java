import java.util.*;
  
public class MinMaxCalculation {
  
    public static Integer findMinNum(List<Integer> list)
    {
  
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }
  
    public static Integer findMaxNum(List<Integer> list)
    {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(sortedlist.size() - 1);
    }
  
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println("Minimum Value: " + findMinNum(list));
        System.out.println("Maximum Value: " + findMaxNum(list));
    }
}