import java.util.*;

/*
����򵥵�С�����Ϊ������ѧ�����java������
@2018/3/31
@author ����չ
*/
public class InputPractice {
	public static void main(String[] args){
		   //����Scanner���󣬲��롰��׼��������System.in����
		   Scanner in = new Scanner(System.in);

		   //��ȡ���ܰ����ո�������в���ӡ
		   System.out.print("Whats your name?");
		   String name = in.nextLine();
		   System.out.println("The name is " + name + ".");
		   
		   //��ȡ�������ո���ַ�������ӡ
		   System.out.print("Please input a word:");
		   String word = in.next();
		   System.out.println("The word is " + word + ".");

		   //��ȡ��������ӡ
		   System.out.print("How old are you?");
		   int age = in.nextInt();
		   System.out.println("You are " + age + " years old" + ".");

		   //��ȡʵ������ӡ
		   System.out.print("����������أ���ȷ��С�����һλ:");
		   double weight = in.nextDouble();
		   System.out.println("Your weight is " + weight + ".");
    }
}
