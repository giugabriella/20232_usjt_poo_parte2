public class JogoV1 {
    public static void main(String[] args)  {
        var p = new Personagem();
        p.nome = "Pedro";
        p.energia = 10;
        p.fome = 0;
        p.sono = 0;
        p.cacar();
        p.comer(); 
        p.dormir();
    }
}
