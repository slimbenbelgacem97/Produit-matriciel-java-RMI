
public class Fact {
	public static void main(String[] args) {
		int f =1;
		try {
			int n=Integer.parseInt(args[0]);
			if(n<0) {
				throw new ExceptionNegatif(n);
			}
			if(n>20) {
				throw new ExceptionGrand(n+"est un entier trop grand");
			}else {
				for(int i=2;i<=n;i++) {
					f*=i;
				}
				System.out.printf("%d!=%d\n",n,f);
			}
		}catch (ExceptionGrand e) {
			System.out.println(e);
		}catch (ExceptionNegatif e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println("l'argument doit être un entier.");
		}
		
		
		
	}
}
