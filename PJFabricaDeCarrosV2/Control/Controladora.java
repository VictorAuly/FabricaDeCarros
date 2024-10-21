package PJFabricaDeCarrosV2.Control;
import PJFabricaDeCarrosV2.View.*;
import PJFabricaDeCarrosV2.Model.*;

public class Controladora {
    
    public void ExibirMenu(){
        int quantidade= 0;
        int opcao;
        Fabrica fabrica =new Fabrica();

            do{
                opcao = EntradaSaida.solicitarOperacao();
                switch (opcao) {
                    
                    case 0:
                        // fabricar carro
                        quantidade = EntradaSaida.solicitarQuantidade();

                        for(int x = 0; x < quantidade; x++ ){
                            Carro carro = new Carro();
                            carro.setModelo(EntradaSaida.solicitarModelo());
                            carro.setAnoFabricacao(EntradaSaida.solicitarAnoFabricacao()); 
                            carro.setCor(EntradaSaida.solicitarcor());
                            fabrica.fabricarCarro(carro);
                            }     
                    break;

                    case 1:
                        // mostrar carro
                      fabrica.mostrarCarrosFabricados();
                    break;

                    case 2:
                        // vender carro
                       fabrica.venderCarro();
                    break;
                }
            }while(opcao!=3);
            EntradaSaida.exibiMsgEncerraPrograma();
            System.exit(0);
    }
}
