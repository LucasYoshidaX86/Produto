import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Classe criada com atributos requisitados.
public class Pessoas {
    private String nomeCompleto;
    private String email;
    private double altura;
    private LocalDate dataNascimento;

    // Constructor para inicialização dos atributos, valida a data de nascimento.
    public Pessoas(String nomeCompleto, double altura, String dataNascimentoStr) {
        this.nomeCompleto = nomeCompleto;
        this.altura = altura;

        // Formato da data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Converter a string em LocalDate
        this.dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        
        // Verifica se a data de nascimento não é posterior à data atual
        if (dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A data de nascimento não pode ser posterior à data atual.");
        }

        // Criação do email, utilizando slip para dividir a String e armazena-la em um Array de string e length para acessar o último elemento. 
        String[] divide = nomeCompleto.split(" ");
        String sobrenome = divide[divide.length - 1];
        this.email = divide[0].toLowerCase() + "." + sobrenome.toLowerCase() + "@dominio.com";
    }

    // Getters para acessar atributos privados.
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public double getAltura() {
        return altura;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    //Formatação das informações para serem puxadas ao main.
    public String descricao() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + getNomeCompleto() + "\n" +
               "Altura: " + getAltura() + "\n" +
               "Data de nascimento: " + getDataNascimento().format(formatter) + "\n" +
               "Email: " + getEmail() + "\n";
    }
}