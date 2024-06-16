package br.twowatch.twowatch;

import br.twowatch.twowatch.model.Filme;
import br.twowatch.twowatch.model.SalaChat;
import br.twowatch.twowatch.service.SalaChatService;
import br.twowatch.twowatch.service.impl.SalaChatServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SalaChatServiceTests {

    @Autowired
    private SalaChatServiceImpl salaChatService;

    @Test
    @DisplayName("cadastra sala")
    public void testaCadastraSala() {
        SalaChat salvo = salaChatService.save(new SalaChat("Sala um"));
        assertNotNull(salvo);

        Filme filme = new Filme("Duro de matar", "");
        SalaChat salaComFilme = new SalaChat(2L, "Sala Com filme", filme);
        SalaChat salvoComFilme = salaChatService.save(salaComFilme);
        assertNotNull(salvoComFilme);
    }
}
