import java.util.HashMap;
import java.util.Map;

public class TutorFactory {
    private static Map<String, Tutor> tutores = new HashMap<>();

    public static Tutor getTutor(String cpf, String nomeTutor) {
        Tutor tutor = tutores.get(cpf);
        if (tutor == null) {
            tutor = new Tutor(nomeTutor, cpf);
            tutores.put(cpf, tutor);
        }
        return tutor;
    }

    public static int getTotalTutores() {
        return tutores.size();
    }
}
