public class Card {
    private String q;
    private String a;

    public Card(String q, String a) {
        this.q = q;
        this.a = a;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void print() {
        System.out.println("Q: " + q);
        System.out.println("A: " + a);
        System.out.println("---------------------------------");
    }

    public void swap() {
        String temp = a;
        a = q;
        q = temp;

    }


}
