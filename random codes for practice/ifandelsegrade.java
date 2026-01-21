import java.util.Scanner;
class ConditionStatement
{
 public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 for(int i=1;i<=10;i++)
 {
 int a=sc.nextInt();
 if(a<50)
 {
 System.out.println("fail");
 }
 else if(a>=50 && a<60)
 {
 System.out.println("D");
 } 
 else if(a>=60 && a<70)
 {
 System.out.println("C");
 }
 else if(a>=70 && a<80)
 {
 System.out.println("B");
 }
 else if(a>=80 && a<90)
 {
 System.out.println("A");
 }
 else if(a>=90 && a<100)
 {
 System.out.println("O");
 }
 }
 }
 }