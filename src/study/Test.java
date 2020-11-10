package study;

// Пример использования поля JFormattedTextField

 class Test
{ 
    private  String maker ;
    private  String color ; 
    private  String body ;
    
    public Test()
{
maker = "Porsche" ;
color = "Silver" ;
body = "Coupe" ;
}
 
    public static String accelerate()
    {
        String motion ="is acceleration" ;
        return motion ;
    }       
   public void setTest(String brand, String paint, String style)
   {
       maker = brand ;
       color = paint ;
       body = style ;
   }
   public void getTest()
    {
       System.out.println(maker + " color " + color);
       System.out.println(maker + " body type " + body );
       System.out.println(maker + " " + accelerate() + "\n");
   }
}