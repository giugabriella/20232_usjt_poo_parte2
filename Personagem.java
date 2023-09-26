public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;

    // métodos têm tipo de retorno (void), nome, lista de parâmetros "()"" e corpo "{}".

    void cacar(){
        if (energia >=2 ){
            energia = energia - 2;
            System.out.println(nome + " está caçando");
        }
        else{
            System.out.println(nome + " está sem energia pata caçar");
        }
        fome = Math.min(fome + 1,10);
        sono = sono + 1 > 10 ? 10 : sono + 1;
    }

    void comer(){
        if (fome >= 1){
            fome = fome - 1;
            energia = Math.min(energia + 1, 10);
            System.out.printf("%s está comendo\n", nome);
        }
        else{
            System.out.println(nome + " está sem fome");
        }
    }
    void dormir(){
        if (sono >= 1){
            System.out.print(nome + " está dormindo\n");
            sono --;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
        else{
            System.out.println(nome + " está sem sono");
        }
    }

    void exibirEstado(){
        System.out.printf("%s: e: %d, f: %d, s: %d\n", nome, energia, fome, sono);
    }
}