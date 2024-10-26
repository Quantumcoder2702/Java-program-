class fraction {
int num;
int denom;
fraction ()
{
num=0;
denom=1;
}
fraction(int n, int m)
{
num = n;
denom = m;
}
void showfraction(){
system.out.println(num+"1"+denom);
}
fraction add(fraction);
{
fraction temp = new fraction();
temp . num = num * f . denom + f . num * denom;
temp . denom = denom * f . denom;
return temp;
}
class fraction demon{
public static void main(String args[]){
fraction f1 = new fraction(15,12);
fraction f2 = new fraction(3,4);
fraction f3 = new fraction();
f3 = f2 . add(f1);
f3 .show fraction();
}
}
