public class city_plaza {
//    if statement how used different ways
    public static int max(int a,int b){
        return (a>b) ? a:b; //this is if and else statement
    }
    public static void leap() { //This method Check in intelligen Idea
        for (int year = 1; year <= 50; year++) {
            int i = (year % 4 == 0) ? year : year;
            System.out.println(i);
            if (year % 4 == 0){
                System.out.println(year);
            }
        }
    }
    public static void main(String[] args){
//        while(1){ //this condition parduces Error
//        System.out.println("hello");
//    }
        System.out.println(max(6,5));

            leap();
//        leap year print 1 to 50

        }
}
