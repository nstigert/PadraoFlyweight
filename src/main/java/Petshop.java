import java.util.ArrayList;
import java.util.List;

public class Petshop {
    private List<Animal> animais = new ArrayList<>();

    public void cadastrar(String nomeAnimal, String cpf, String nomeTutor) {
        Tutor tutor = TutorFactory.getTutor(cpf, nomeTutor);
        Animal animal = new Animal(nomeAnimal, tutor);
        animais.add(animal);
    }

    public List<String> obterAnimais() {
        List<String> saida = new ArrayList<>();
        for (Animal animal : this.animais) {
            saida.add(animal.obterAnimal());
        }
        return saida;
    }
}
