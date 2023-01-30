
// Задан целочисленный список ArrayList.
//  Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dz_3{

    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        for(int i =0; i<4;i++){
            list.add(random.nextInt(1, 10));
        }   
        System.out.println(list);
        int max = list.get(0);
        for(int i =0; i<list.size();i++){
            
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.printf("Максимальный элемент = %d \n",max);

        int min = list.get(0);

        for(int i =0; i<list.size();i++){
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.printf("Минимальный элемент = %d \n",min);

        float sum = 0;
        float result = 0 ;
        for(int i =0; i<list.size();i++){
            sum = sum + list.get(i);
            
        }
        result = sum/list.size();
        System.out.printf("Cреднее арифметичское = %f \n",result);

        
    }



}
    
