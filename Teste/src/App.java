public class App {
    public static void main(String[] args) throws Exception {

        String nome = "Fellipe";
        int XP = 88000;
        String nivel;

        if (XP < 1000) {
            nivel = "Ferro";
        } else if (XP >= 1001 && XP <= 2000) {
            nivel = "Bronze";
        } else if (XP >= 2001 && XP <= 5000) {
            nivel = "Prata";
        } else if (XP >= 6001 && XP <= 7000) {
            nivel = "Ouro";
        } else if (XP >= 7001 && XP <= 8000) {
            nivel = "Platina";
        } else if (XP >= 8001 && XP <= 9000) {
            nivel = "Ascendente";
        } else if (XP >= 9001 && XP <= 10000) {
            nivel = "Imortal";
        } else if (XP >= 10001) {
            nivel = "Radiante";
        } else {
            nivel = "Nível de habilidade não encontrado";
        }

        System.out.println("O Heroi de nome " + nome + " está no nível de " + nivel);
    }
}
