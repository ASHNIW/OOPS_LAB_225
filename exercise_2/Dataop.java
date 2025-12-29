public class Dataop
{
public static void main(String[] args)
{
int a=2;
int b=1;
int add=a+b;
int sub=a-b;
int mul=a*b;
int div=a/b;
int mod=a%b;
System.out.println(a+"<"+b+"="+(a<b));
System.out.println(a+">"+b+"="+(a>b));
System.out.println(a+"<="+b+"="+(a<=b));
System.out.println(a+">="+b+"="+(a>=b));
System.out.println(a+"!="+b+"="+(a!=b));
System.out.println(a+"=="+b+"="+(a==b));
System.out.println(a+"+"+b+"="+add);
System.out.println(a+"-"+b+"="+sub);
System.out.println(a+"*"+b+"="+mul);
System.out.println(a+"/"+b+"="+div);
System.out.println(a+"%"+b+"="+mod);
System.out.println(a+"++"+"="+ ++a);
System.out.println(a+"--"+"="+ --a);
System.out.println("(a > 0) && (b > 0) = " + ((a>0) && (b>0)));
System.out.println("(a > 0) || (b > 0) = " + ((a>0) || (b>0)));
System.out.println("!(a > 0) && (b > 0) = " + (!(a>0) && (b>0)));
}
}
