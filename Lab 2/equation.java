public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
       double dusckrim = b*b-4*a*c;
        if(a==0 && c!=0 && b!=0)
        {
            double x3=-c/b;
            System.out.println("x1=" + x3);
            System.out.println("x2=" + x3);
        }
        else if(b==0 && c!=0)
        {
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else if(c==0 && b!=0)
        {
            double x3=c/b;
            System.out.println("x1=" + x3);
            System.out.println("x2=" + x3);
        }
        else if(dusckrim<0 || (a==0&&b==0&&c==0))
        {
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else if(dusckrim == 0)
        {
            double x = (-b)/(2*a);
            System.out.println("x1=" + x);
            System.out.println("x2=" + x);
        }
        else if(dusckrim>0)
        {
            double dscr1 = Math.sqrt(dusckrim);
            double x1 = (-b+dscr1)/(2*a);
            double x2 = (-b-dscr1)/(2*a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }

}