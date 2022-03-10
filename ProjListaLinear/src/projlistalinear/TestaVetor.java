package projlistalinear;

public class TestaVetor {
   
    public static void main(String[] args) throws Exception {
        
        
     
        Vetor gamers = new Vetor(10);
        int buscaPos = 0;
        
        /*Box<String> nome = new Box<>();
        Box<Integer> score = new Box<>();
        
        nome.add("mike");
        nome.add("mike");
        nome.add("mike");
        nome.add("mike");
        nome.add("mike");
        
        score.add(1105);
        score.add(1105);
        score.add(1105);
        score.add(1105);
        score.add(1105);*/
        
        gamers.add(buscaPos, new Gamer("Mike",1105));
        gamers.add(buscaPos, new Gamer("Rob",750));
        gamers.add(buscaPos, new Gamer("Paul",720));
        gamers.add(buscaPos, new Gamer("Anna",660));
        gamers.add(buscaPos, new Gamer("Rose",590));
        gamers.add(buscaPos, new Gamer("Jack",510));
     
        int achou = gamers.search("cAFÉ");
        if (achou == -1){
            System.out.println("Item inexistente!");
        } 
        else{
            gamers.remove(achou);
        }
        
        String[] teste = gamers.getArray();
        
        for (int i = 0; i < gamers.size(); i++){
            System.out.println(gamers.get(i));
        }
        
    }
    
}
