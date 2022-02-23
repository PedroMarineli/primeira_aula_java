public class ola{
    private static int soma(int a, int b) {
        if(a>30){
            return a + b;      
        }else{
            return a - b;
        }
     
    }

    public static void main(String[] args){
        System.out.println("Olá Mundo!!!");
        System.out.println(soma(3, 5));
    }
}