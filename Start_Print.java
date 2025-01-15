public class Start_Print {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int a =5;
        for(int i=1;i<11;i++){
            System.out.println(a+"X"+i+"="+a*i);
        }
    }
}
