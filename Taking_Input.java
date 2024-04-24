class TakingInput{

public static void main(String args[])
{
float num1;
System.out.println("enter the input:\n"+args[0]+args[1]);

 num1 =Integer.parseInt(args[0])+Integer.parseInt(args[1]);
System.out.println("Addition of aand b=\n"+num1);
 num1 =Integer.parseInt(args[0])*Integer.parseInt(args[1]);
System.out.println("muliplication of a and b=\n"+num1);
 num1 =Integer.parseInt(args[0])-Integer.parseInt(args[1]);
System.out.println("Substract of a and b=\n"+num1);
 num1 =Float.parseFloat(args[0])/Float.parseFloat(args[1]);



System.out.println("Divide of a and b=\n"+num1);

}
}
