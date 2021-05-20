public class MyLanguage {
public static int func(int name1, int name2) {
int c = name1;
int d = name2;

System.out.println(c - d);
return c - d;

}
public static void main(String[] args) {

int a = 10;
int b;
b = (int) Math.pow(10, 3) + 5;
MyLanguage.func(a, b);
if(a > b) {
for(int i = 1; i < a; i++ ) {
b = b + i;

}
}
a = (int) Math.pow(5 * (b - 3), 2);
System.out.println(a);
}
}