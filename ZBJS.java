//理论板层数计算：
import java.util.Scanner;
public class ZBJS
{
public static void main(String args[])
	{
     System.out.println("此程序用于理论板层数计算");
	 Scanner reader =new Scanner(System.in);
	 System.out.println("请输入进料状态（q值）");
	 double q= reader.nextDouble();
	 System.out.println("请输入相对挥发度（a）");
	 double a= reader.nextDouble();
	 System.out.println("请输入回流比（R）");
	 double R= reader.nextDouble();
	 System.out.println("请输入进料轻组分浓度");
	 double xf= reader.nextDouble();
	 System.out.println("请输入塔顶馏出液轻组分浓度");
	 double xd= reader.nextDouble();
	 System.out.println("请输入釜液中轻组分浓度");
	 double xw= reader.nextDouble();
	 double ja=R/(R+1);
	 double jb=xd/(R+1);
	 double qa=q/(q-1);
	 double qb=xf/(q-1);
	 double xq=(qb+jb)/(qa-ja);
	 double yq=ja*xq+jb;
	 double ta=(yq-xw)/(xq-xw);
	 double tb=xw*(1-ta);
	 double xnj=1;
	 double xnt=1;
	 double y=xd;
	 double x=1;
	 double couterj=1;
	 double coutert=1;
 	 while(xnj>xf)
 	     { x=y/(a-a*y+y);
		   y=ja*x+jb;
		   x=y/(a-a*y+y);
		   xnj=x;
		   couterj=couterj+1.5;
		 }
	 while(xnt>xw)
 	     { x=y/(a-a*y+y);
		   y=ta*x+tb;
		   x=y/(a-a*y+y);
		   xnt=x;
		   coutert=coutert+1.5;
		 }
		double n=couterj+coutert;
		System.out.println("理论板数"+n);

    }
}
