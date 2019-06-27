package practice;

public class divisible {
	public static void main(String[] args) {
		int	i=1;
		while(i>=1&&i<=190) {
			i++;
			if((i%2==0)&&(i%3==0)&&(i%5==0)) {
				System.out.println(i);
			}
		}
		}
}
