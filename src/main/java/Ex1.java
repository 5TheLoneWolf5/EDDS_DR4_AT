class Classificacao {

    public static void classificar(int numero) {
        System.out.println(obterDescricao(numero));
    }

    public static String obterDescricao(int numero) {
        if (numero > 10) {
            return "ALTO";
        } else if (numero == 10) {
            return "MÉDIO";
        } else if (numero == -9999) {
            return "CASO RARO";
        }
        return "BAIXO";
    }
}