public class ClassvsLocal {

    int number;



    public void printNumber(){
         int number = 4;

        System.out.println(this.number);  // this keyword is used in instance context, with instance variables and methods
    }





    public void m2(){
         this.m3();  // we can also use this to refer to the methods of the current class
         this.m3(4);
    }

    public void m3(){

    }

    public void m3(int i){

    }



    public static void main(String[] args) {
        ClassvsLocal cs = new ClassvsLocal();

        cs.printNumber(); // 0
    }


}
