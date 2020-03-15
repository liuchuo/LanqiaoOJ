package provincial_2019;
/*
* N——外卖店数量
* M——订单信息
* T——时间单位
* pri——优先级
* res——T时刻有res家外卖店在优先缓存
* */
import java.util.Scanner;

public class G__TakeawayStorePriority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int pri = 0;
        int res = 0;
        if(M==0){
            pri--;
        }
        if(M>0){
            pri++;
        }
    }
}
