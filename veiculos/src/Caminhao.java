public class Caminhao {

        public String cor;
        public String modelo;
        public int eixo;

        public Caminhao(String cor, String modelo, int eixo){
            this.cor = cor;
            this.modelo = modelo;
            this.eixo = eixo;
        }

        public Caminhao(String cor, String modelo) {
            this.cor = cor;
            this.modelo = modelo;
        }


        public String andar(){
            return "acelerando";
        }

        public String freiar(){
            return "parou";
        }

        @Override
        public String toString() {
            return "";
        }

}
