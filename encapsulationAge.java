 class Person{

    String Name;
    int Age;
    String Country;

    public String getName() //create method\function
    {
        return Name;
    }
    
    public void setName(String name)//using this we can assing value to the name
    {
        this.Name = name;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int age)
    {
        this.Age = age;
    }

    public String getCountry()
    {
        return Country;
    }

    public void setCountry(String country)
    {
        this.Country = country;

    } 
}

public class encapsulationAge{

    public static void main(String args[]){

        Person pobj = new Person();

        pobj.setName("Sanika");
        pobj.setAge(18);
        pobj.setCountry("Pune");


        String Name = pobj.getName();
       int Age = pobj.getAge();
        String Country = pobj.getCountry();

        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Country:" + Country);






    }
}
