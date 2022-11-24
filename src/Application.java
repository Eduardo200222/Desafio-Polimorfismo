public class Application {

    public static void main(String[] args) {

            Funcionario funcionario = new Funcionario();
            Cabecalho cabecalho = new Cabecalho();
            Rodape rodape = new Rodape();
            funcionario.setNome("Eduardo");
            funcionario.setSalario(1210);
            funcionario.Aumento();
            cabecalho.setTexto(" primeira página ");
            rodape.setTexto1("Fim Da Página");
            funcionario.imprimir(cabecalho, rodape);


            Programador programador = new Programador();
            Cabecalho cabecalho1 = new Cabecalho();
            Rodape rodape1 = new Rodape();
            programador.setNome("Eduardo Programador");
            programador.setSalario(5000);
            programador.Aumento();
            programador.setLinguagens("PHP, Java, JavaScript");
            cabecalho1.setTexto(" primeira página ");
            rodape1.setTexto1("Fim Da Página");
            programador.imprimir(cabecalho1, rodape1);


            Gerente gerente = new Gerente();
            Cabecalho cabecalho2 = new Cabecalho();
            Rodape rodape2 = new Rodape();
            gerente.setNome("Eduardo Gerente");
            gerente.setSalario(7500);
            gerente.Aumento();
            gerente.setSubordinados("Eduardo Programador, Eduardo Secretário");
            cabecalho2.setTexto(" primeira página ");
            rodape2.setTexto1("Fim Da Página");
            gerente.imprimir(cabecalho2, rodape2);


            Secretaria secretaria = new Secretaria();
            Cabecalho cabecalho3 = new Cabecalho();
            Rodape rodape3 = new Rodape();
            secretaria.setNome("Eduardo Secretário");
            secretaria.setSalario(2000);
            secretaria.Aumento();
            secretaria.setAgenda("Seg - Sala 1, Terça - Sala 2");
            cabecalho3.setTexto(" primeira página ");
            rodape3.setTexto1("Fim Da Página");
            secretaria.imprimir(cabecalho3, rodape3);


        }

    }

