package PJFabricaDeCarrosV2.View;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

        public static String solicitarModelo() {

            String[] modelos = {"Panamera", "Cayenne", "Boxster"};
                
            JComboBox<String> comboBox = new JComboBox<>(modelos);
            comboBox.setSelectedIndex(0);
                
            int resultado;
            do {
                resultado = JOptionPane.showConfirmDialog(null, comboBox, 
                        "Selecione o modelo do carro", JOptionPane.OK_CANCEL_OPTION);

                if (resultado != JOptionPane.OK_OPTION) {
                    JOptionPane.showMessageDialog(null, 
                            "Você deve selecionar um modelo para continuar.", 
                            "Seleção Obrigatória", JOptionPane.WARNING_MESSAGE);
                }

            } while (resultado != JOptionPane.OK_OPTION); 
            return (String) comboBox.getSelectedItem();
    }
        public static String solicitarcor(){
            String[] cor = {"Preto", "Branco", "Vermelho"};
            JComboBox<String> comboBox = new JComboBox<>(cor);
            comboBox.setSelectedIndex(0);
            int resultado;
            do{
                resultado =JOptionPane.showConfirmDialog(null, comboBox, "Selecione a cor do carro", JOptionPane.OK_CANCEL_OPTION);
                if(resultado != JOptionPane.OK_OPTION){
                    JOptionPane.showConfirmDialog(null, "Você deve selecionar uma cor para continuar.", "Seleção Obrigatoria", JOptionPane.WARNING_MESSAGE);
                }
            }while(resultado == JOptionPane.OK_CANCEL_OPTION);
            return(String) comboBox.getSelectedItem();
    }
        public static String solicitarAnoFabricacao() {
            String[] anoFabricacao = {"2024/2024","2024/2025","2025/2025"};
        JComboBox<String> comboBox = new JComboBox<>(anoFabricacao);
        comboBox.setSelectedIndex(0);
        int resultado;
        do{
            resultado=JOptionPane.showConfirmDialog(null, comboBox, "Selecione o ano de fabricação do carro", JOptionPane.OK_CANCEL_OPTION);
            if(resultado!= JOptionPane.OK_OPTION){
                JOptionPane.showMessageDialog(null, "Voce deve selecionar um ano para continuar.", "Seleção obrigatoria", JOptionPane.WARNING_MESSAGE);
            }
        }while(resultado != JOptionPane.OK_OPTION);
        return(String) comboBox.getSelectedItem();
    }
    //////////////////////////////////////////////////fim solicitações get e set//////////////////////////////////////////////////////////////
    public static int solicitarOperacao(){
        String[] opcoes= {"Fabricar Carro","Ver informações do carro","Vender Carro","Sair do programa"};
        JComboBox<String> menu = new JComboBox<String>(opcoes);
        JOptionPane.showConfirmDialog(null,menu,"Selecione a opção desejada",JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }
    public static void exibiMsgEncerraPrograma(){
        JOptionPane.showMessageDialog(null,"O programa será encerrado!");
    }
    public static int solicitarQuantidade(){
        int quantidade;
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros você deseja criar"));
        return quantidade;
    }
}
