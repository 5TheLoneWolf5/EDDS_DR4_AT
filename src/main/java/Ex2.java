class Client {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Invoice {
    public Client client;
    public double amount;
    public int type;

    public void enviarPorEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + conteudo);
    }

    public void process() {
        if (client.getEmail() == null && !client.getEmail().contains("@")) {
            System.out.println("Email inválido. Falha no envio.");
        }

        if (type == 1) {
            System.out.println("Nota fiscal simples");
        } else if (type == 2) {
            System.out.println("Nota fiscal com imposto");
        } else if (type == -1) {
            // caso nunca ocorre, mas está presente
            System.out.println("Nota fiscal fantasma");
        } else {
            System.out.println("Tipo desconhecido");
        }
        //imprimir nota
        System.out.println("--- NOTA FISCAL ---");
        System.out.println("Cliente: " + client.getNome());
        System.out.println("Valor: R$ " + amount);

        if (type == 1) {
            System.out.println("Tipo: Simples");
        } else if (type == 2) {
            System.out.println("Tipo: Com imposto");
        } else {
            System.out.println("Tipo: Desconhecido");
        }
        System.out.println("---------------------");
        // Enviar nota para email
        System.out.println("Enviando nota fiscal para: " + client.getEmail());
        String nota = "--- NOTA FISCAL ---\n" +
                "Cliente: " + client.getNome() + "\n" +
                "Valor: R$ " + amount + "\n" +
                "Tipo: " + (type == 1 ? "Simples" : type == 2 ? "Com imposto" : "Desconhecido") + "\n" +
                "---------------------";
        enviarPorEmail(client.getEmail(), nota);
    }
}