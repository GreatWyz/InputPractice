import java.util.*;

/*
这个简单的小程序仅为帮助初学者理解java的输入
@2018/3/31
@author 吴宜展
*/
public class InputPractice {
	public static void main(String[] args){
		   //构建Scanner对象，并与“标准输入流”System.in关联
		   Scanner in = new Scanner(System.in);

		   //读取可能包含空格的输入行并打印
		   System.out.print("Whats your name?");
		   String name = in.nextLine();
		   System.out.println("The name is " + name + ".");
		   
		   //读取不包含空格的字符串并打印
		   System.out.print("Please input a word:");
		   String word = in.next();
		   System.out.println("The word is " + word + ".");

		   //读取整数并打印
		   System.out.print("How old are you?");
		   int age = in.nextInt();
		   System.out.println("You are " + age + " years old" + ".");

		   //读取实数并打印
		   System.out.print("输入你的体重，精确到小数点后一位:");
		   double weight = in.nextDouble();
		   System.out.println("Your weight is " + weight + ".");
    }
}
