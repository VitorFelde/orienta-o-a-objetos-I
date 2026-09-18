import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sistema1 {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Companhia c1 = new Companhia();
        
        public void menu () throws Exception{
        String opcao = "";
            while (!opcao.equals("4")) {
                System.out.println("1) Cadastrar novo vôo");
                System.out.println("2) Listar todos os vôos");
                System.out.println("3) Consultar vôo");
                System.out.println("4) Sair do programa");
                opcao = this.reader.readLine();
            
                switch (opcao) {
                    case "1":
                        cadastrarVoo();
                    break;
                    
                    case "2":
                        listarVoo();
                    break;
                    
                    case "3":
                        consultarVoo();
                    break;
                    
                    case "4":
                        System.out.println("Saindo do programa");
                    break;
            }
            }
        }
        
            private void cadastrarVoo() throws Exception{
                Voos v1 = new Voos();
                
                System.out.println("Digite a origem do vôo: ");
                v1.setOrigem(reader.readLine());
                
                System.out.println("Digite o destino do vôo: ");
                v1.setDestino(reader.readLine());
                
                System.out.println("Digite a data do vôo: ");
                v1.setData(reader.readLine());
                
                System.out.println("Digite a hora do vôo: ");
                v1.setHora(reader.readLine());
            }
            
            private void listarVoo(){
                for (int i = 0; i < c1.getQtdeVoos(); i++) {
                    Voos c2 = c1.getVoos(i);
                    System.out.println(
                    "Origem do vôo " + i + " :" + c2.getOrigem() + 
                    "Destino do vôo " + i + " :" + c2.getDestino() + 
                    "Data do vôo " + i + " :" + c2.getData() + 
                    "Hora do vôo " + i + " :" + c2.getHora());
                }
            }
            
            private void consultarVoo() throws Exception{
                System.out.println("Digite o id do Vôo desejado: ");
                int idVoo = Integer.parseInt(reader.readLine());
                boolean encontrou = false;
                for (int i = 0; i < c1.getQtdeVoos(); i++) {
                    Voos v3 = c1.getVoos(i);
                    if(v3.getIdVoo() == idVoo){
                    int posVoo = 0;
                        String fera = "Origem: " + v3.getOrigem()
                            + " - Destino: " + v3.getDestino()
                            + " - Data: " + v3.getData() +
                            "Hora: " + v3.getHora();
                        System.out.println(fera);
                        posVoo++;
                    
                
                encontrou = true;
                break;
            }
        }
    }
}

