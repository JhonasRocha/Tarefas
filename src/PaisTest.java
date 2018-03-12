
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais paises, copia;
	static int id = 0;

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		paises = new Pais(3, "Alemanha",55000000,1220000 );
		copia = new Pais(3, "Alemanha",55000000,1220000 );
		System.out.println(paises);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		Pais fixture = new Pais(1, "Brasil",200700000, 8516000.00);
		Pais novo = new Pais(1, null, -1, -1);
		novo.carregar();
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		paises.criar();
		id = paises.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", paises, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		paises.setPopulacao(210000000);
		copia.setPopulacao(210000000);		
		paises.atualizar();
		paises.carregar();
		assertEquals("testa atualizacao", paises, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(-1);
		copia.setArea(-1);
		paises.excluir();
		paises.carregar();
		assertEquals("testa exclusao", paises, copia);
	}
	
}