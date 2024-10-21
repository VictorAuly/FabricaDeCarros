package PJFabricaDeCarrosV2.Model;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Fabrica {
    ArrayList<Carro> listaDeCarros = new ArrayList<>();
    public ArrayList<Carro> getListaDeCarros() {
        return listaDeCarros;
        }
        
        public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
        this.listaDeCarros = listaDeCarros;
        }
    public void fabricarCarro(Carro carro){
        
        listaDeCarros.add(carro); 
    }
    public void venderCarro(){

        if(listaDeCarros.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não há carros disponíveis para venda!");
            return;
        }
        JComboBox<Carro> modelosCarros = new JComboBox<>();
        for(Carro carro : listaDeCarros){           
            modelosCarros.addItem(carro);
         }

        int opcao = JOptionPane.showConfirmDialog(null, modelosCarros, "Selecione o carro para vender", JOptionPane.OK_CANCEL_OPTION);
    
        if (opcao == JOptionPane.OK_OPTION) {
            Carro carroSelecionado = (Carro) modelosCarros.getSelectedItem();

            if (carroSelecionado != null) {
                int confirmarVenda = JOptionPane.showConfirmDialog(null, 
                    "Você tem certeza que deseja vender o carro:\n" + "Modelo: " + carroSelecionado.getModelo() + "\n" +
                    "Cor: " + carroSelecionado.getCor() + "\n" + "Ano: " + carroSelecionado.getAnoFabricacao() + "?", 
                    "Confirmação de Venda", JOptionPane.YES_NO_OPTION);   

                    if (confirmarVenda == JOptionPane.YES_OPTION) {

                        //confirmação
                        JOptionPane.showMessageDialog(null, 
                        "O carro " + carroSelecionado.getModelo() + " - " + carroSelecionado.getCor() + " - " + carroSelecionado.getAnoFabricacao() + 
                        " foi vendido!");
    
                        // remover o carro do arraylist
                        listaDeCarros.remove(carroSelecionado);
                    }else {
                        JOptionPane.showMessageDialog(null, "Nenhum carro foi selecionado, e a venda foi cancelada.");
                    }
            }
        }
    }

    public void mostrarCarrosFabricados(){
        StringBuilder construtor = new StringBuilder();
        if (listaDeCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não ha carros para ver");
                    
        }
            for(int x = 0; x < listaDeCarros.size(); x++){
                Carro carro = listaDeCarros.get(x);
                construtor.append(x+1+"°) "+carro.getModelo()+"-"+carro.getAnoFabricacao()+"-"+carro.getCor()+"\n");
            }         
            JOptionPane.showMessageDialog(null, construtor.toString());  
    }
    
}
