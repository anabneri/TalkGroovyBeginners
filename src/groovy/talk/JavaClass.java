package groovy.talk;

public class JavaClass {


    public static class HelloWorld {
        private String nome;
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String digaHello(){
            return "Hello " + nome + ".";
        }
        public static void main(String[] args) {
            HelloWorld hw = new HelloWorld();
            hw.setNome("Morty");
            System.out.println(hw.digaHello());
        }
    }
}
