

class Dog7 {

   
    int age;
    String name;

    Dog7() {

        System.out.println("......Default Constructor.....");
        age = 2; //default age to all dogs


    }

    Dog7(int a, String n) {
        age = a;
        name = n;
        
         this.age=age;
        if(age>0)
        {
       
        if(age<=12){
            System.out.println("Dog eating:"+age+""+name);
        }
        else{
            String errorMsg="wrong value for age:"+age;
        throw new IllegalArgumentException(errorMsg);
        }
        
        
        }else{
            String errorMsg="wrong value for age:"+age;
        throw new IllegalArgumentException(errorMsg);
        }
       
    }

    void eat2() {

        System.out.println(" Dog eating:" + age + "+name");

    }
}

class DogTest {

    public static void main(String[] args) {


        Dog7 d1 = new Dog7(10,"Tommy");
       
            }
}
