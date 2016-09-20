/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a120104
 */
public class LocalizarPokemonTest {
    
    public LocalizarPokemonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLocalizar() {
        LocalizarPokemon loc = new LocalizarPokemon();
        for(int i = 0; i < 100; i++){
            loc.verificar();
        }
        for(int i = 0; i < loc.achados.size(); i++){
            System.out.println(loc.achados.get(i).toString() + "\n" + "indice: " + i + "\n");
        }
    }
    
}
