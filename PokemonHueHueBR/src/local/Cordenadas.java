package local;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.util.Date;
import java.util.Random;

// @author a120104
public class Cordenadas {
    private int x;
    private int y;
    private int z;
    private long seed; // time(null);
    
    public Cordenadas(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.seed = 0;
    }
    
    public Cordenadas(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.seed = 0;
    }
    
    public void funcaoX(){
        int ret = gerarX();
        ret = ret - 100;
        this.x = ret;
    }
    
    public int gerarX(){
        int ret = 0;
        long lDateTime = new Date().getTime();
        this.setSeed(lDateTime);
        Random gerador = new Random();
        gerador.setSeed(this.getSeed());
        ret = gerador.nextInt(163) + 100;
        return ret;
    }
    
    public void funcaoY(){
        int ret = gerarY();
        ret = ret - 50;
        this.y = ret;
    }
    
    public int gerarY(){
        int ret = 0;
        long lDateTime = new Date().getTime();
        this.setSeed(lDateTime* 2);
        Random gerador = new Random();
        gerador.setSeed(this.getSeed());
        ret = gerador.nextInt(163) + 50;
        return ret;
    }
    
    public void funcaoZ(){
        this.z = gerarZ();
    }
    
    public int gerarZ(){
        int ret = 0;
        long lDateTime = new Date().getTime();
        this.setSeed(lDateTime);
        Random gerador = new Random();
        gerador.setSeed(this.getSeed());
        ret = gerador.nextInt(11);

        return ret;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * @return the seed
     */
    public long getSeed() {
        return seed;
    }

    /**
     * @param seed the seed to set
     */
    public void setSeed(long seed) {
        this.seed = seed;
    }
}
