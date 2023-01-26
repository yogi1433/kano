class Constant4
{
static void area()
{int r=5;
final double pi=3.142;
double res=pi*r*r;
System.out.println(res);
}
}
class Constant5
{
public static void main(String[] args)
{Constant4.area();
}
}