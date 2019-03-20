package nl.joost.animals.covariantreturn;


public class Application {

   public static void main(String[] args) {

   }
   
   

}

class Animal {
   
   public Object sound() {
      return new Object();
   }
}


class Dog extends Animal {
   
   @Override
   public Object sound() {
      return "Woef";
   }
}


// this class contains a covariant return
class Cat extends Animal {
   
   @Override
   // this method is a covariant return since THE RETURNTYPE IN THE DECLARATION OF THE METHOD already is a subtype (String is subtype of Object)
   public String sound() {
      return "Miauw";
   }
   
   
}