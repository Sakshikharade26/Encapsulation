class New {
    int i; //(non static ) instance object size = 4 bytes

    static int j; // static characterstics


    void fun(){

        System.out.println("Inside instance method"); // instance method (non static)
    }

    static void gun(){
 System.out.println("Inside static method"); // static method

    }

}

class Encapsulation{    

    public static void main(String args[]){
 
        New.j=51;
        System.out.println("Static characterstic accessed by class name:"+New.j);
        New obj = new New();
        New obj2 = new New();
        New obj3 = new New();
        
        obj.i = 21;
        obj.j=37;
        System.out.println("Static members accessed through object"+obj.j);
        New.gun();
        obj.gun();



        obj.i=11;
        obj2.j=35;
        System.out.println("Instance variable by obj:"+obj.i);
        System.out.println("Instance variable by obj2:"+obj2.j);
        obj.fun();
    }
}


