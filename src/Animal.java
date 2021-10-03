public class Animal {

    private String color;
    private int size;
    private int numPatas;

    public void comer(){
        System.out.println("Busca comida");
        System.out.println("Atrapa comida");
        System.out.println("Engulle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
}
