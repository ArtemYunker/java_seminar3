

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class dz_2 {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        for(int i =0; i<5;i++){
            list.add(random.nextInt(1, 10));
        }   
        System.out.println(list);

        List<Integer>new_list = new ArrayList<>();
        for(int i =0; i<list.size();i++){
            if((list.get(i))%2 != 0){
                new_list.add(list.get(i));
            }
        }
        System.out.println(new_list);
    }
}
