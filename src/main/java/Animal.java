public class Animal {
    private String nome;
    private Tutor tutor;

    public Animal(String nome, Tutor tutor) {
        this.nome = nome;
        this.tutor = tutor;
    }

    public String obterAnimal() {
        return "Animal{" +
                "nome='" + this.nome + '\'' +
                ", nomeTutor='" + tutor.getNome() + '\'' +
                ", cpfTutor='" + tutor.getCpf() + '\'' +
                '}';
    }
}
