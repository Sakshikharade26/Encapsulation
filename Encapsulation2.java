 class Demo{

    int a;//non static variable (instance object size 4 bytes)

    static int b;
    
    void name(){

        System.out.println("Value of a"); // Instance method
    }

    static void game(){
        System.out.println("Value of  b"); //static method
    }
}


class Encapsulation2{

    public static void main(String args[]){

        Demo.b = 37;
         
        System.out.println(" value of b is:"+ Demo.b);
        Demo obj = new Demo();
        Demo obj2 = new Demo();
        Demo obj3= new Demo();

          obj.a =78;
         obj.b = 45;
         System.out.println("Static member accesed through object: " + obj.b);

         obj.game();
         obj.game();

         obj.a=11;
         obj.b=35;
         System.out.println("Instance variable by obj:"+obj.a);
         System.out.println("Instance variable by obj2:"+obj2.b);
         obj.name();
    }
}
