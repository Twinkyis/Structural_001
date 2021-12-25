package Next.Chain;

public class Box_Logger implements Logger{
        int priority;
        public Box_Logger(int priority){this.priority = priority;}

        Logger next;
        public void setNext(Logger next){this.next = next;}


      public void setClassBox(String massage, int Class_Box) {
        if(Class_Box <= priority){
            System.out.println("Box: " + massage);
        }
        if (next!=null){next.setClassBox(massage, Class_Box);}
    }
}
