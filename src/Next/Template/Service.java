package Next.Template;

 abstract class Service {

     void delivery(){
         Name();
         System.out.println("доставит вам посылку");
         numPhone();
     }
     abstract void Name();
     abstract void numPhone();
}
