package local;

import java.util.ArrayList;
import pokemons.Pokemons;

// @author a120104
public class LocalizarPokemon {

    public Cordenadas plano;
    public Faculdade facu;
    public ArrayList<Pokemons> achados;
    private Pokemons pokemon;

    public LocalizarPokemon() {
        this.pokemon = new Pokemons();
        this.plano = new Cordenadas();
        this.facu = new Faculdade();
        this.achados = new ArrayList<Pokemons>();
    }

    public boolean procurar() {
        pokemon.abrir();
        plano.funcaoX();
        plano.funcaoY();
        if(pokemon.voador()){
            plano.funcaoZ();
        }
        else{
            do{
                plano.funcaoZ();
            }while(this.plano.getZ() != 0);
        }
        return true;
    }
    
    public boolean verificar(){
        procurar();
        this.pokemon.setCordenada(plano);
        if (this.achados.size() == 0) {
            this.achados.add(pokemon);
            this.pokemon = new Pokemons();
            this.plano = new Cordenadas();
            return true;
        }
        else if (distancia()) {
            this.achados.add(pokemon);
            this.pokemon = new Pokemons();
            this.plano = new Cordenadas();
            return true;
        }
        this.pokemon = new Pokemons();
        this.plano = new Cordenadas();
        return false;
    }
    
    public boolean verificarP() {
        boolean retfacu = false;
        boolean retpoke = false;
        procurar();
        if (this.plano.getX() <= this.facu.getxFinal() && this.plano.getX() >= this.facu.getxInicial()) {
            if (this.plano.getY() <= this.facu.getyFinal() && this.plano.getY() >= this.facu.getyInicial()) {
                if (this.plano.getZ() <= this.facu.getzFinal() && this.plano.getZ() >= this.facu.getzInicial()) {
                    retfacu = true;
                            this.pokemon.setCordenada(plano);

                }
            }
        }
        if (this.achados.size() == 0) {
            this.achados.add(pokemon);
            retpoke = true;

        } else if (distancia()) {
            this.achados.add(pokemon);
            retpoke = true;
        } else {
            retpoke = false;
        }
        if (retfacu && retpoke) {
            this.pokemon = new Pokemons();
            this.plano = new Cordenadas();
            return true;
        }
        this.pokemon = new Pokemons();
        this.plano = new Cordenadas();
        return false;
    }

    public boolean distancia() {
        boolean ret = false;
        double disx = 0;
        double disy = 0;
        double disz = 0;
        double dis = 0;
        for (int i = 0; i < this.achados.size(); i++) {
            disx = Math.pow(pokemon.getCordenada().getX() - this.achados.get(i).getCordenada().getX(), 2);            
            disy = Math.pow(pokemon.getCordenada().getY() - this.achados.get(i).getCordenada().getY(), 2);
            disz = Math.pow(pokemon.getCordenada().getZ() - this.achados.get(i).getCordenada().getZ(), 2);
            dis = Math.sqrt(disx + disy + disz);
            if (dis > 5) {
                ret = true;
            } else {
                return false;
            }
        }
        return ret;
    }
}
