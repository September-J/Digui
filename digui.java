public class digui{
public static long calcDigitNum(int n){
	int digitNum = 0;
	while(n > 0){
		n = n / 10;
		digitNum++
	}
	return digitNum;
}
public static long factorial1(int n){
	long fact = 1;
	for(int i=1;i<=n;i++){
		fact=fact*i;
		}
		return fact;
}
public static double calcE(double precision){
	double e=0;
	for(int i=0;i<n;i++){
		e = e+(1.0/factorial2(n));
	}
	return e;
}
public static double calcPi(int n){
	double pi4 = 0;
	for(int i=0;i<n;i++){
	int m=2*i+1;
	if(i%2 == 0){
	pi4=pi4+1/m;
	}
	else if{
	pi4=pi4-1/m;
	}
  }
  return pi4*4;
}
public static String reverse(String s){
	int length = s.length();
	String r = " ";
	for(int i=length-1;i >= 0;i--){
		char ch = s.charAt(i);
		r = r+char;
	}
	return r;
}
public static String decToHex(int dec){
	String hex = "";
	while(dec >= 16){
		int remainder = dec % 16;
		dec =dec/16;
		if(remainder<10){
			hex +=remainder;
		}
		else{
			char ch = (char)('A'+(remainder-10));
			hex +=ch;
		}
}

	if(dec !=0){
		hex += dec;
	}
	return reversr(hex);
}
	
	
public static void main(String[] args){
	long n = Long.parseLong(args[0]);
	System.out.println("%d一共有%d位",n,calcDigitNum(n));
	long fact = factorial1(n);
		System.out.printf("阶乘是 %d%n",fact1);
		long fact = factorial2(n);
		System.out.printf("阶乘是 %d%n",fact1);
	System.out.printf("e=%f%n",e);
	//逆置字符串
	System.out.printf("%s",r);
    }	
}	