class javaoperator{
    public static void main(String args[]) {
        int a=7;
        int b=3;
        int c=4;
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a+=5);
        System.out.println(a-=5);
        System.out.println(a/=5);
        System.out.println(a*=5);
        System.out.println(a%=2);
        System.out.println(++c);
        System.out.println(--c);
        System.out.println(b>a);
        System.out.println(b<a);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        //Ternary operator
        System.out.println((a>b)?((a>c)?a:b):((b>c)?b:c));
        //Bitwise operator
        int x=0b1010;
        int y=0b1100;
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);
        System.out.println(~x);
        System.out.println(x>>y);
        System.out.println(x<<y);
    }
}
