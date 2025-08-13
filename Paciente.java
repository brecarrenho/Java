import java.util.Scanner;

public class Paciente {

    String nome;
    String endereco;
    String cpf;
    char sexo;
    String nivelEscolaridade;
    String email;
    String dataNascimento;
    String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }
    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Paciente paciente = new Paciente();

        System.out.println("Digite o nome:");
        paciente.setNome(scanner.nextLine());

        System.out.println("Digite o endereço:");
        paciente.setEndereco(scanner.nextLine());

        System.out.println("Digite o CPF:");
        paciente.setCpf(scanner.nextLine());

        System.out.println("Digite o Sexo (M/F):");
        paciente.setSexo(scanner.next().charAt(0));
        scanner.nextLine(); // consumir a quebra de linha

        System.out.println("Digite o seu nível de escolaridade:");
        paciente.setNivelEscolaridade(scanner.nextLine());

        System.out.println("Digite o seu email:");
        paciente.setEmail(scanner.nextLine());

        System.out.println("Digite a sua data de nascimento (dd/mm/aaaa):");
        paciente.setDataNascimento(scanner.nextLine());

        System.out.println("Digite o seu telefone:");
        paciente.setTelefone(scanner.nextLine());

        System.out.println("\n-- Dados do Paciente --");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Endereço: " + paciente.getEndereco());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Sexo: " + paciente.getSexo());
        System.out.println("Nível de Escolaridade: " + paciente.getNivelEscolaridade());
        System.out.println("Email: " + paciente.getEmail());
        System.out.println("Data de Nascimento: " + paciente.getDataNascimento());
        System.out.println("Telefone: " + paciente.getTelefone());

        scanner.close();
    }
}