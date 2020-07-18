package br.com.fiap.fiapzapv2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 29/03/2017.
 */

public class GeraContato {

    public static List<Contato> listaContatos() {
        List<Contato>contatos = new ArrayList<>();
        contatos.add(new Contato("Joao", "11 1111-1111","Olá", R.drawable.person1));
        contatos.add(new Contato("Maria", "11 2222-2222","Olá", R.drawable.person2));

        return contatos;
    }
}
