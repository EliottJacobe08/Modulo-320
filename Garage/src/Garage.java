public class Garage {
    public String nome;
    public automobile[] posti = new automobile[5];

    public Garage(String nome) {
        this.nome = nome;
    }

    // Aggiunge un'auto nel primo posto libero
    public boolean aggiungiAuto(automobile a) {
        if (a == null) {
            System.out.println("Errore: automobile nulla.");
            return false;
        }

        // Controllo se è già presente
        if (cercaAuto(a.getTarga()) != -1) {
            System.out.println("L'auto con targa " + a.getTarga() + " è già presente nel garage.");
            return false;
        }

        for (int i = 0; i < posti.length; i++) {
            if (posti[i] == null) {
                posti[i] = a;
                System.out.println(a.entraGarage());
                System.out.println("Auto aggiunta nel posto " + (i + 1));
                return true;
            }
        }

        System.out.println("Garage pieno! Non è possibile aggiungere altre auto.");
        return false;
    }

    // Rimuove un'auto per targa
    public boolean rimuoviAuto(String targa) {
        int indice = cercaAuto(targa);
        if (indice == -1) {
            System.out.println("Auto con targa " + targa + " non trovata nel garage.");
            return false;
        }

        System.out.println(posti[indice].esciGarage());
        posti[indice] = null;
        System.out.println("Auto rimossa dal posto " + (indice + 1));
        return true;
    }

    // Cerca un'auto per targa e restituisce l'indice o -1 se non trovata
    public int cercaAuto(String targa) {
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] != null && posti[i].getTarga().equalsIgnoreCase(targa)) {
                return i;
            }
        }
        return -1;
    }

    // Mostra tutte le auto
    public void mostraAuto() {
        System.out.println("\n--- Elenco auto nel garage \"" + nome + "\" ---");
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] != null) {
                System.out.println(" Posto " + (i + 1) + ": " + posti[i]);
            } else {
                System.out.println(" Posto " + (i + 1) + ": [vuoto]");
            }
        }
    }

    // Conta quante auto elettriche ci sono
    public int contaElettriche() {
        int count = 0;
        for (automobile a : posti) {
            if (a != null && a.isElettrica()) {
                count++;
            }
        }
        return count;
    }

    // Mostra le auto storiche
    public void mostraStoriche() {
        System.out.println("\n--- Auto storiche nel garage ---");
        boolean trovata = false;
        for (automobile a : posti) {
            if (a != null && a.isStorica()) {
                System.out.println(a);
                trovata = true;
            }
        }
        if (!trovata) {
            System.out.println("Nessuna auto storica presente.");
        }
    }
}
