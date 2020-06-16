//package modelos.utilidades;
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//import java.awt.Desktop;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import modelos.classes.Colaborador;
//
//public class GerarContrato {
//
//    private Colaborador colaborador = null;
//    private String caminho = "";
//    private String nomeContratoPDF = "";
//
//    public GerarContrato(Colaborador colaborador) {
//        this.colaborador = colaborador;
//    }
//
//    public Colaborador getColaborador() {
//        return colaborador;
//    }
//
//    public void setColaborador(Colaborador colaborador) {
//        this.colaborador = colaborador;
//    }
//
//    public String getCaminho() {
//        return caminho;
//    }
//
//    public void setCaminho(String caminho) {
//        this.caminho = caminho;
//    }
//
//    public String getNomeContratoPDF() {
//        return nomeContratoPDF;
//    }
//
//    public void setNomeContratoPDF(String nomeContratoPDF) {
//        this.nomeContratoPDF = nomeContratoPDF;
//    }
//
//    private String textoDoContrato
//            = "                               Contrato para empréstimo de livros\n"
//            + "                                Contrato: " + this.colaborador.getMatricula() + this.colaborador.getId()
//            + "\nContratante locador: Razão Social: SISTEMA GESTOR DA BIBLIOTECA DA ADVOCACIA e ASSOCIADOS (SGBAA)\n"
//            + "Endereço: RUA 227 A N 95 UNIVERSITARIO Bairro: UNIVERSITARIO CEP: 74610-060 Cidade: GOIANIA UF: GO\n"
//            + "Fone: 62 3255-5655 Representada por: José Luis Godofredo Cargo: DIRETOR Responsável pelo sistema: Marcos\n"
//            + "Daniel Anadinho do Nascimento Cargo: Administrador.\n"
//            + "Contratante locatário: Nome:" + this.colaborador.getNome() + ", Código Identificador No.: " + this.colaborador.getId() + "\n"
//            + "Cargo:. " + this.colaborador.getTipoDeColaborador() + ", E-mail:. " + this.colaborador.getEmail() + "\n"
//            + "\n"
//            + "Pelo presente instrumento particular de locação de coisas, têm justo e contratado o seguinte:\n"
//            + "CLÁUSULA 1ª - O LOCADOR, afirma ser o proprietário legítimo dos livros da empresa Advocaciade e Associados,\n"
//            + "CNPJ: 87.225.077/0001-48. De acordo com as leis: LEI Nº 9.610, DE 19 DE FEVEREIRO DE 1998,  LEI\n"
//            + "Nº 12.853, DE 14 DE AGOSTO DE 2013 e LEI No 10.753, DE 30 DE OUTUBRO DE 2003, os livros\n"
//            + "disponibilizados para empréstimo em conformidade com as cláusulas deste contrato.\n"
//            + "CLÁUSULA 2ª - O empréstimo será efetuado mediante confirmação do vinculo com a empresa ou locador. Vinculo\n"
//            + "esse, sócio ou empregado.\n"
//            + "CLÁUSULA 3ª - O empréstimo deverá ser oferecido gratuitamente pelo período de 7(sete) dias renováveis com\n"
//            + "antecedência de 2(dois) dias antes do vencimento do prazo do empréstimo. Caso o prazo do empréstimo seja excedido,\n"
//            + "será cobrado multa devido a manutenção do sistema de R$ 2,00 por livro e dia de atraso na entrega do(s) livro(s), será \n"
//            + "adicionada a multa os próximos débitos após a partir  do primeiro dia de atraso e o locatário ficará com a autorização\n"
//            + "para empréstimos suspensa até a quitação do débito.  Multa essa, deverá ser paga na administração da biblioteca.\n"
//            + "CLÁUSULA 4ª - O(s) livro(s) encontram-se em perfeito estado de conservação, ficando o LOCATÁRIO responsável \n"
//            + "pela(s) devolução(s), no mesmo estado e condições a partir da assinatura.\n"
//            + "CLÁUSULA 5ª - O LOCATÁRIO utilizará o(s) livro(s) do melhor modo que lhe atender, sendo responsável por consertos\n"
//            + "e manutenção que advirem de seu uso. Em caso de extravio será o valor integral do(s) exemplar(es).\n"
//            + "§1º – Caso o(s) objeto(s) da locação forem subtraídos do locatário, poderá ser justificado a perda mediante boletim de \n"
//            + "ocorrência devidamente registrado numa delegacia de policia.\n"
//            + "CLÁUSULA 6ª - O LOCATÁRIO não deverá ceder, emprestar ou sublocar o(s) livro(s) sem o consentimento LOCADOR.\n"
//            + "CLÁUSULA 7ª - Fica estipulado conforme o Art. 105 da Lei nº 9.610/98, o locatário ao descumprir o firmado nesse\n"
//            + "documento, será multado pelo valor estipulado pelo(a/s/as) autor(a/es/as)  caso não haja acordo o locatário será\n"
//            + "acionado na justiça.\n"
//            + "CLÁUSULA 8ª - O LOCATÁRIO terá como fonte de informações o E-mail e número de telefone declarados pelo mesmo,\n"
//            + "Da mesma forma entrará em contato com a biblioteca. Informações como, confirmação do cadastro/descadastro,\n"
//            + "locações, devoluções, comunicação de atrasos e débito.\n"
//            + "CLÁUSULA 9ª - O locatário receberá um cupom após todas as locações para que o sistema da biblioteca, usando como\n"
//            + "referência o código identificador, tenha acesso as informações do locatário e dos itens que estão sendo locados.\n"
//            + "CLÁUSULA 10ª -O locatário poderá fazer reservas dos livros que deseja locar somente de forma presencial.\n"
//            + "§1º – A reserva de um livro expira em 1(um) dia após o livro ficar disponível.\n"
//            + "CLÁUSULA 11ª - A biblioteca deve fornecer os livros em perfeito estado. Caso não se cumpra, o locatário poderá\n"
//            + "recorrer a administração para a manutenção do livro em questão.\n"
//            + "CLÁUSULA 12ª - Fica eleito o foro de (Cidade) para dirimir quaisquer dúvidas referentes a este contrato.\n"
//            + "E assim, por estarem contratados na forma acima, assinam o presente instrumento na presença de testemunhas que a\n"
//            + "tudo assistiram e conhecimento tiveram e em duas vias de igual teor.\n";
//
//    public String getTextoDoContrato() {
//        return textoDoContrato;
//    }
//    public String textoDoContratoother = "                               Contrato para empréstimo de livros\n";
//
//    public void setTextoDoContrato(String textoDoContrato) {
//        this.textoDoContrato = textoDoContrato;
//    }
//
//    public void gerarContrato() throws FileNotFoundException, DocumentException, IOException {
//        Document documento = new Document();
//        PdfWriter.getInstance(documento, new FileOutputStream("./contratos/" + colaborador.getNome() + ".pdf"));
//
//        documento.open();
//        documento.add(new Paragraph(textoDoContrato));
//        Desktop.getDesktop().open(new File("./contratos/" + colaborador.getNome() + ".pdf"));
//    }
//
//    @Override
//    public String toString() {
//        return textoDoContrato;
//    }
//
//}
