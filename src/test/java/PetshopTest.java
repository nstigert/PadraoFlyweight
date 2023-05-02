import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PetshopTest {
    @Test
    void deveRetornarAnimais() {
        Petshop petshop = new Petshop();
        petshop.cadastrar("Marie", "11111111111", "Nathalia");
        petshop.cadastrar("Nina", "11111111111", "Nathalia");
        petshop.cadastrar("Bela", "22222222222", "Bruno");

        List<String> saida = Arrays.asList(
                "Animal{nome='Marie', nomeTutor='Nathalia', cpfTutor='11111111111'}",
                "Animal{nome='Nina', nomeTutor='Nathalia', cpfTutor='11111111111'}",
                "Animal{nome='Bela', nomeTutor='Bruno', cpfTutor='22222222222'}");

        assertEquals(saida, petshop.obterAnimais());
    }

    @Test
    void deveRetornarTotalTutores() {
        Petshop petshop = new Petshop();
        petshop.cadastrar("Marie", "11111111111", "Nathalia");
        petshop.cadastrar("Nina", "11111111111", "Nathalia");
        petshop.cadastrar("Bela", "22222222222", "Bruno");

        assertEquals(2, TutorFactory.getTotalTutores());
    }
}