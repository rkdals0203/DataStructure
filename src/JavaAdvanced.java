import java.util.*;
public class JavaAdvanced{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int d = Integer.decode(input.nextLine());
        @SuppressWarnings("unchecked")
        ArrayList<Integer> list[] = new ArrayList[20000];
        for(int i = 0; i<d ; i++){
            list[i]=new ArrayList<Integer>();
            String[] inputData = input.nextLine().split(" ");
            for(int j = 0; j < inputData.length; j ++){
               list[i].add(Integer.decode((inputData[j])));
            }
        }
        int q = input.nextInt();
        int x, y;
        for(int i = 0; i<q; i++){
            x = input.nextInt();
            y = input.nextInt();
            if(d<x || y>list[x-1].size()-1){
                System.out.println("Error!");
            }
            else{
                System.out.println(list[x-1].get(y));
            }
        }
    }
}
