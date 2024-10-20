public class Main {
    public static void main(String[] args) {
        Object[] a = new Object[10];

        a[0]="Kunal";
        a[1]=1234;
        a[2]='a';
        a[3]=true;
        a[5]=false;
        a[6]=1.23;
        a[7]=12212l;
        a[8]=null;
        a[9]=2.3433d;

        for (Object b: a){
            System.out.println(b);
        }
        Thread t = new Thread();
        String s = t.getName();
        System.out.println(s);


    }




    class  Enumeration <T>{



    }



}