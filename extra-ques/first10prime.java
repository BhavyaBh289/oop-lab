import java.util.*;

public class first10prime {
  public static void main(String[] args) {

    int check = 0;
    int ans = 2;
    int count = 0;

    while(count != 10){
      for(int i=2; i<ans; i++){
        if(ans % i == 0){
          check = 1;
          break;
        }
      }
      if(check == 0){
        count++;
        System.out.println(ans + " ");
      }
      ans++;
      check = 0;
    }
  }
}
