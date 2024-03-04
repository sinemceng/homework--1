import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Integer> times = new ArrayList<>();
    private List<String> names = new ArrayList<>();
    private int x = 0;
    private int b = 0;
    private int c = 0;
    public void addPerson(int time, String name ){
        times.add(time);
        names.add(name);
        sort();
    }

    private void sort(){
        for (int i = 0; i < times.size(); i++) {
            for (int j = i+1; j < times.size(); j++) {
                if(times.get(j)< times.get(i)){
                    Integer temp = times.get(i);
                    String now = names.get(i);
                    times.set(i, times.get(j));
                    times.set(j,temp);
                    names.set(i, names.get(j));
                    names.set(j,now);
                }
            }
        }
    }

    public void writeString(){
        System.out.println(times.toString());
        System.out.println(names.toString());
    }

    public int bestTime(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }

        return min;
    }

    public String getName(int sure){
        int index = 0;
        for (int i = 0; i < times.size(); i++) {
            if(sure == times.get(i)){
                index = i;
            }
        }
        return names.get(index);
    }

    public int secondTime(int[] array){
        int min1 = bestTime(array);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min && array[i]>min1){
                min = array[i];
            }
        }

        return min;
    }
    public int thirdTime(int[] array){
        int min1 = secondTime(array);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min && array[i]>min1){
                min = array[i];
            }
        }

        return min;
    }

    public void allTimes(){
        for (int i = 0; i < times.size(); i++) {
            if (times.get(i)<300&& times.get(i)>199){
                x++;
            }
            if (times.get(i)<400&& times.get(i)>299){
                b++;
            }
            if (times.get(i)>399){
                c++;
            }
        }
        System.out.println("A->"+ x);
        System.out.println("B->"+b);
        System.out.println("C->"+c);
    }
    public void bestOfThree(){
        System.out.println("Birinci: "+ names.get(0)+" "+ times.get(0)+"'");
        System.out.println("Ikinci: "+ names.get(1)+" "+ times.get(1)+"'");
        System.out.println("Üçüncü: "+ names.get(2)+" "+ times.get(2)+"'");
    }
}


