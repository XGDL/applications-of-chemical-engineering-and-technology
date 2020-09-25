//Colebrook公式
import java.util.Scanner;
public class 
{
public static void main(String args[])
	{
		double g=9.81;
		System.out.println("此程序针对判据小于0.005，采用二分法试差求得在工程精度要求内的λ并输出相应的u和Re");
		Scanner reader =new Scanner(System.in);
		System.out.println("请输入两截面高度差(m)");
		double z= reader.nextDouble();
		System.out.println("请输入两截面压力差(Pa)");
		//Scanner reader =new Scanner(System.in);
		double p= reader.nextDouble();
		System.out.println("请输入流体密度(Kg/m3)");
	    //Scanner reader =new Scanner(System.in);
		double ρ= reader.nextDouble();
		System.out.println("请输入管道长度（含当量长度）(m)");
	    //Scanner reader =new Scanner(System.in);
		double la= reader.nextDouble();
		System.out.println("请输入管内径d(m)");
		//Scanner reader =new Scanner(System.in);
	    double d= reader.nextDouble();
		/*System.out.println("请输入λ");
		Scanner raeder=new Scanner(System.in);
		double λ=reader.nextDouble();*/
		System.out.println("请输入黏度μ(Pa*s)");
		//Scanner reader =new Scanner(System.in);
		double μ= reader.nextDouble();
		System.out.println("请输入相对粗糙度");
		//Scanner reader =new Scanner(System.in);
		double rr= reader.nextDouble();
		double λ1=0.001;
		double λ2=0.09;
		double λ=0;
		double a1=2*g*z+2*p/ρ;
		double a2=la/d*λ+1.5;
		double a3=a1/a2;
		double u=Math.sqrt(a3);
		double re=d*u*ρ/μ;
		double b1=1/Math.sqrt(λ);
		double b2=9.35/re*b1;
		double f=1.14-2*Math.log(1+b2/rr)-b1+2*Math.log(1/rr);
		double j=1/(rr*re*Math.sqrt(λ));
		//double dλ=λ2-λ1;
		while(λ2-λ1 >0.03)
		{
	 		λ=(λ1+λ2)/2;
			a1=2*g*z+2*p/ρ;
			a2=la/d*λ+1.5;
			a3=a1/a2;
			u=Math.sqrt(a3);
			re=d*u*ρ/μ;
			b1=1/Math.sqrt(λ);
			b2=9.35/re*b1;
			f=1.14-2*Math.log(1+b2/rr)-b1+2*Math.log(1/rr);
			if(f>0)
		    {
			 λ1=λ;
			}
			else
			{
			 λ2=λ;
			}
			j=1/(rr*re*Math.sqrt(λ));
			double dλ=λ2-λ1;
		}
			System.out.println("λ="+λ+",u="+u+",Re="+re+",判据为:"+j);
	}

}
