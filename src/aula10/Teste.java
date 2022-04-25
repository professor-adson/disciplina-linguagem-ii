package aula10;

import java.io.Serializable;

public class Teste implements Serializable {
    String x;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Este objeto é {" + "x='" + x + '\'' + '}';
    }
}
