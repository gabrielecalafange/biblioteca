import Model.Livro;
import Repository.LivroRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {
    static LivroRepository livros = new LivroRepository();

    @BeforeEach
    void setUp() {
        Livro livro = new Livro("biblia", "jesus", 0);
        Livro livro2 = new Livro("capitães da areia", "jorge amado", 10);
        livros.adicionaLivro(0, livro);
        livros.adicionaLivro(10, livro2);
    }

    @AfterAll
    static void tearDown() {
        livros.deletarTudo();
    }

    @Test
    public void testCriarLivro() {
        Livro livro = new Livro("teste", "fabio", 1);
        assertEquals("teste", livro.getTitulo());
        assertEquals("fabio", livro.getAutor());
        assertEquals(1, livro.getIdLivro());
    }

    @Test
    public void testAlugarDisponivel() {
        Livro livro = new Livro("outro teste", "bibi", 2);
        assertTrue(livro.getDisponibilidade());
    }

    @Test
    public void testAlugarIndisponivel() {
        Livro livro = new Livro("outro teste", "bibi", 3);
        livro.alugar();
        assertFalse(livro.getDisponibilidade());
    }

    @Test
    public void testAlugarDevolvido() {
        Livro livro = new Livro("mais teste", "giulia", 4);
        livro.alugar(); livro.redisponibilizar();
        assertTrue(livro.getDisponibilidade());
    }

    @Test
    public void testRepository() {
        assertEquals("título: biblia", livros.getLivro(0).toString());
        assertEquals("[biblia, capitães da areia]", livros.listarLivros());
    }

}
