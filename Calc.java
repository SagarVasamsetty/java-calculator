import java.util.*;
class Calc
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the a value");
double a = sc.nextDouble();
System.out.println("enter the b value");
double b = sc.nextDouble();
System.out.println("enter the operator +,-,*,/");
char op = sc.next().charAt(0);
double result;
switch(op)
{
case '+' :
result = a+b;
break;
case '-' :
result = a-b;
break;
case '*' :
result = a*b;
break;
case '/' :
if(b!=0)
result = a / b;
else{
System.out.println("Error:cannot divided with zero!");
return;
}
break;
default:
System.out.println("Invalid Operator");
return;
}
System.out.println("Result: "+ result);
}
}
