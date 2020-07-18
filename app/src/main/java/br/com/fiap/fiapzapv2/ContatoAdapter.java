package br.com.fiap.fiapzapv2;

import android.content.Context;
import android.media.Image;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by logonrm on 29/03/2017.
 */

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder> {

    private Context context;
    private List<Contato> contato;

    public ContatoAdapter (Context context, List<Contato> contato){
        this.context = context;
        this.contato = contato;
    }

    @Override
    public ContatoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_contato, parent, false);
        ContatoViewHolder contatoViewHolder = new ContatoViewHolder(v);
        return contatoViewHolder;
    }

    @Override
    public void onBindViewHolder(ContatoViewHolder holder, int position) {

        final Contato contato = this.contato.get(position);
        holder.imgContato.setImageResource(contato.getImagem());
        holder.txtNome.setText(contato.getNome());
        holder.txtStatus.setText(contato.getStatus());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicou em " + contato.getNome(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.contato.size();
    }

    public static class ContatoViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imgContato;
        TextView txtNome;
        TextView txtStatus;

        public ContatoViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView;
            imgContato = (ImageView)itemView.findViewById(R.id.imgContato);
            txtNome = (TextView)itemView.findViewById(R.id.txtNome);
            txtStatus = (TextView)itemView.findViewById(R.id.txtStatus);
        }
    }
}
