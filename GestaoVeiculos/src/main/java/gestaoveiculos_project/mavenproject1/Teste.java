/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoveiculos_project.mavenproject1;

/**
 *
 * @author Veronica
 */
public class Teste {

    public static void main(String[] args) throws VelocException, VeicExistException {

        java.awt.EventQueue.invokeLater(() -> {
            new FormGestao().setVisible(true); 
        });
        /*System.out.println("Por favor, informar o numero de alguma funcionalidade abaixo:");
        boolean run = true;
        while (run) {
            String entrada = JOptionPane.showInputDialog(null,
                    "1. Cadastrar Veiculo de Passeio\n2. Cadastrar Veiculo de Carga\n3. Imprimir Todos os Veiculos de Passeio\n4. Imprimir Todos os Veiculos de Carga\n5. Imprimir Veiculo de Passeio pela Placa\n6. Imprimir Veiculo de Carga pela Placa\n7. Excluir Veiculo de Passeio pela Placa\n8. Excluir Veiculo de Carga pela Placa\n9. Sair do Sistema",
                    "Digite um numero da opcao desejada: ",
                    JOptionPane.INFORMATION_MESSAGE);
            switch (entrada) {
                case "1" -> {
                    String cadast = "s";
                    boolean percorre = true;
                    try {
                        while (percorre) {
                            if (cadast.equalsIgnoreCase("s")) {
                                System.out.println("CADASTRO PASSEIO");
                                String placa = JOptionPane.showInputDialog("Digite o numero da placa: ");
                                
                                if (!placaExiste(placa)) {
                                    passeio = new Passeio();
                                    passeio.setPlaca(placa);
                                    passeio.setMarca(JOptionPane.showInputDialog("Informe a marca: "));
                                    passeio.setModelo(JOptionPane.showInputDialog("Informe o modelo: "));
                                    passeio.setCor(JOptionPane.showInputDialog("Informe a cor do veiculo: "));
                                    try {
                                        float vel = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade maxima: "));
                                        if (vel < 80 || vel > 110) {
                                            passeio.setVelocMax(100);
                                            throw new VelocException();
                                        } else {
                                            passeio.setVelocMax(vel);
                                        }
                                        
                                    } catch (VelocException ve) {
                                        String nomeClasse = ve.getClass().getName();
                                        System.out.println("NOME da CLASSE..: " + nomeClasse);
                                    }
                                    passeio.setQtdRodas(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de rodas: ")));
                                    passeio.setQtdPassageiros(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade passageiros: ")));
                                    passeio.calcVel(passeio.getVelocMax());
                                    passeio.calcular();
                                    bdVeiculos.getListaPasseio().add(passeio);
                                    
                                    cadast = JOptionPane.showInputDialog("Gostaria de efetuar mais um cadastro? (S/N): ");
                                } else {
                                    throw new VeicExistException();
                                }
                            } else if (cadast.equalsIgnoreCase("n")) {
                                percorre = false;
                            } else {
                                cadast = JOptionPane.showInputDialog("Opcao incorreta!");
                            }
                        }
                    } finally {
                        
                    }
                }
                
                case "2" -> {
                    String cadast = "s";
                    boolean percorre = true;
                    try {
                        while (percorre) {
                            if (cadast.equalsIgnoreCase("s")) {
                                System.out.println("CADASTRO CARGA");
                                String placa = JOptionPane.showInputDialog("Digite o numero da placa: ");
                                if (!placaExiste(placa)) {
                                    carga = new Carga();
                                    carga.setPlaca(placa);
                                    carga.setMarca(JOptionPane.showInputDialog("Informe a marca: "));
                                    carga.setModelo(JOptionPane.showInputDialog("Informe o modelo: "));
                                    carga.setCor(JOptionPane.showInputDialog("Informe a cor do veiculo: "));
                                    try {
                                        float vel = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade maxima: "));
                                        if (vel < 80 || vel > 110) {
                                            carga.setVelocMax(90);
                                            throw new VelocException();
                                        } else {
                                            carga.setVelocMax(vel);
                                        }
                                        
                                    } catch (VelocException ve) {
                                        String nomeClasse = ve.getClass().getName();
                                        System.out.println("NOME da CLASSE..: " + nomeClasse);
                                    }
                                    carga.setQtdRodas(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de rodas: ")));
                                    carga.setCargaMax(Integer.parseInt(JOptionPane.showInputDialog("Informe o total da carga MAX.: ")));
                                    carga.setTara(Integer.parseInt(JOptionPane.showInputDialog("Informe o total tara: ")));
                                    carga.calcVel(carga.getVelocMax());
                                    carga.calcular();
                                    bdVeiculos.getListaCarga().add(carga);
                                    
                                    cadast = JOptionPane.showInputDialog("Gostaria de efetuar mais um cadastro? (S/N): ");
                                } else {
                                    throw new VeicExistException();
                                }
                                
                            } else if (cadast.equalsIgnoreCase("n")) {
                                percorre = false;
                            } else {
                                cadast = JOptionPane.showInputDialog("Opcao incorreta!");
                            }
                        }
                    } finally {
                        
                    }
                }
                
                case "3" -> {
                    System.out.println("TODOS VEICULOS CADASTRADOS DE PASSEIO");
                    for (Passeio p : bdVeiculos.getListaPasseio()) {
                        System.out.println(
                                "PLACA ..: " + p.getPlaca()
                                + "\nMODELO ..: " + p.getModelo()
                                + "\nCOR ..: " + p.getCor()
                                + "\nMAXIMO VEL ..: " + p.getVelocMax()
                                + "\nTOTAL RODAS ..: " + p.getQtdRodas()
                                + "\nQUANTIDADE PASSAGEIROS ..: " + p.getQtdPassageiros()
                                + "\nTOTAL PISTOES ..: " + p.getMotor().getQtdPist()
                                + "\nPOTENCIA ..: " + p.getMotor().getPotencia()
                                + "\nVELOCIDADE CALCULADA ..: " + p.calcVel(p.getVelocMax())
                                + "\nSOMA DE PALAVRAS REGISTRADAS ..: " + p.calcular()
                                + "\n-----------------------------------------------------"
                        );
                    }
                }
                case "4" -> {
                    System.out.println("TODOS VEICULOS CADASTRADOS DE CARGA");
                    for (Carga c : bdVeiculos.getListaCarga()) {
                        System.out.println(
                                "PLACA ..: " + c.getPlaca()
                                + "\nMODELO ..: " + c.getModelo()
                                + "\nCOR ..: " + c.getCor()
                                + "\nMAXIMO VEL ..: " + c.getVelocMax()
                                + "\nTOTAL RODAS ..: " + c.getQtdRodas()
                                + "\nCARGA MAX..: " + c.getCargaMax()
                                + "\nQUANTIDADE TARA ..: " + c.getTara()
                                + "\nVELOCIDADE CALCULADA ..: " + c.calcVel(c.getVelocMax())
                                + "\nSOMA DE TODOS OS ATRIBUTOS NUMERICOS ..: " + c.calcular()
                                + "\n-----------------------------------------------------"
                        );
                    }
                }
                case "5" -> {
                    boolean placaExists = false;
                    System.out.println("BUSCA DA PLACA DO VEICULO PASSEIO");
                    String placa = JOptionPane.showInputDialog("Digite o numero da placa procurada: ");
                    for (Passeio p : bdVeiculos.getListaPasseio()) {
                        if (placa.equalsIgnoreCase(p.getPlaca())) {
                            System.out.println(
                                    "PLACA ..: " + p.getPlaca()
                                    + "\nMODELO ..: " + p.getModelo()
                                    + "\nCOR ..: " + p.getCor()
                                    + "\nMAXIMO VEL ..: " + p.getVelocMax()
                                    + "\nTOTAL RODAS ..: " + p.getQtdRodas()
                                    + "\nQUANTIDADE PASSAGEIROS ..: " + p.getQtdPassageiros()
                                    + "\nVELOCIDADE CALCULADA ..: " + p.calcVel(p.getVelocMax())
                                    + "\nSOMA DE PALAVRAS REGISTRADAS ..: " + p.calcular()
                            );
                            placaExists = true;
                            break;
                        }
                    }
                    if (!placaExists) {
                        System.out.println("Placa nao cadastrada.");
                    }
                }
                case "6" -> {
                    boolean placaExists = false;
                    System.out.println("BUSCA DA PLACA DO VEICULO CARGA");
                    String placa = JOptionPane.showInputDialog("Digite o numero da placa procurada: ");
                    for (Carga c : bdVeiculos.getListaCarga()) {
                        if (placa.equalsIgnoreCase(c.getPlaca())) {
                            System.out.println(
                                    "PLACA ..: " + c.getPlaca()
                                    + "\nMODELO ..: " + c.getModelo()
                                    + "\nCOR ..: " + c.getCor()
                                    + "\nMAXIMO VEL ..: " + c.getVelocMax()
                                    + "\nTOTAL RODAS ..: " + c.getQtdRodas()
                                    + "\nCARGA MAX..: " + c.getCargaMax()
                                    + "\nQUANTIDADE TARA ..: " + c.getTara()
                                    + "\nVELOCIDADE CALCULADA ..: " + c.calcVel(c.getVelocMax())
                                    + "\nSOMA DE TODOS OS ATRIBUTOS NUMERICOS ..: " + c.calcular()
                            );
                            placaExists = true;
                            break;
                        }
                    }
                    if (!placaExists) {
                        System.out.println("Placa nao cadastrada.");
                    }
                }
                case "7" -> {
                    System.out.println("EXCLUSAO DE VEICULO DE PASSEIO");
                    String placa = JOptionPane.showInputDialog("Digite o numero da placa: ");
                    if (placaExiste(placa)) {
                        for (int i = 0; i < bdVeiculos.getListaPasseio().size(); i++) {
                            if (bdVeiculos.getListaPasseio().get(i).getPlaca().equalsIgnoreCase(placa)) {
                                bdVeiculos.getListaPasseio().remove(i);
                                System.out.println("Veiculo de passeio excluido com sucesso!");
                            }
                        }
                    } else {
                        System.out.println("Nenhum veiculo identificado com a placa para ser removido");
                    }
                }
                case "8" -> {
                    System.out.println("EXCLUSAO DE VEICULO DE CARGA");
                    String placa = JOptionPane.showInputDialog("Digite o numero da placa: ");
                    if (placaExiste(placa)) {
                        for (int i = 0; i < bdVeiculos.getListaCarga().size(); i++) {
                            if (bdVeiculos.getListaCarga().get(i).getPlaca().equalsIgnoreCase(placa)) {
                                bdVeiculos.getListaCarga().remove(i);
                                System.out.println("Veiculo de carga excluido com sucesso!");
                            }
                        }
                    } else {
                        System.out.println("Nenhum veiculo identificado com a placa para ser removido");
                    }
                }
                
                case "9" -> {
                    System.out.println("Sessao encerrada.");
                    run = false;
                    break;
                }
                default ->
                    System.out.println("Opcao invalida!");
            }
            
        }*/

    }

}
