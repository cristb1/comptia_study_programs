public class thing {

    void asterisksPrinter(int i) {	
        if (i > 1) {
          asterisksPrinter(i / 2);	
          asterisksPrinter(i / 2);	
        }	
        System.out.print("*");
      }


      public int mystery(int n, int a, int d){
        if(n == 1){
            return a;
        }else{
            return d + mystery(n - 1, a, d);
        }
      }

      public int result(int n) {
        if (n == 1)
          return 2;
        else
          return 2 * result(n - 1);
      }

      public long foo(long x) { 
        if(x == 1 || x == 3)
          return x;
        else
          return x * foo(x-1);
      }

    public static void main(String[] args){
        thing thing = new thing();
        //System.out.println(thing.foo(thing.foo(3)+thing.foo(4)));
        //System.out.println(thing.result(3));
        System.out.println(thing.mystery(6,5, 5));
        thing.asterisksPrinter(2);
    }


    
}
