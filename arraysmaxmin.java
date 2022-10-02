import java.util.Arrays;
public class arraysmaxmin {

	public static void main(String[] args) {
int a;
	int list[]= {10,78,25487,4,5};
	Arrays.sort(list);
	System.out.println(Arrays.toString(list));
	a=list.length;
	
	System.out.println("En küçük sayı: "+list[0]);
	System.out.println("En küçük sayıya en yakın sayı: "+list[1]);
	System.out.println("En büyük sayı: "+list[a-1]);
	System.out.println("En büyük sayıya en yakın sayı: "+list[a-2]);
	}

}
