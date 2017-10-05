/**
 * Created by Petro_Gordeichuk on 10/5/2017.
 */
public class App {
    public static void main(String[] args) {
//        int [] arr = {1,1,1,2,2,2,3,3,4,4,4};
        int [] arr = {1,1,2,2,4,3,3};
        int max = 0;
        int currentMax = 1;
        int res = -1;

        for (int i = 0; i < arr.length ; i++ ) {
            if(arr[i] == arr[i+1]){
                currentMax++;
            }else{
                if(i==0){
                    res = i;
                    break;
                }else{
                    if(max==0){
                        max=currentMax;
                    } else
                        if(currentMax < max){
                        res=i-currentMax;
                        break;
                        }else if(currentMax>max){
                            res=i-currentMax-max;
                            break;
                        }
                }
                currentMax = 1;
            }

        }
        System.out.println(res);

    }
}
