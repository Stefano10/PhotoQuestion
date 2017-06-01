package br.ufrn.imd.fragmentsexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stefano Loss on 01/06/2017.
 */

public class FeedFragment  extends Fragment implements ClickRecyclerView_Interface{

    Button perguntar;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
    RecyclerAdapter adapter;
    private List<Pergunta> perguntaListas = new ArrayList<>();
    private FloatingActionButton floatingActionButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.feed, container, false);
//        setaRecyclerView(v);
//        setaButtons(v);
//        listenersButtons();

        perguntar = (Button) v.findViewById(R.id.perguntarBTN);


        perguntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.content_main, new PerguntaFragment());
                    ft.addToBackStack(null);
                    ft.commit();
            }
        });
        return v;

    }

    public void setaRecyclerView(View v){

        //Aqui é instanciado o Recyclerview
        mRecyclerView = (RecyclerView) v.findViewById(R.id.feedRecycle);
        mRecyclerView.setLayoutManager(mLayoutManager);

        adapter = new RecyclerAdapter(getActivity(), perguntaListas, this);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onCustomClick(Object object) {
        //TODO TRATAR O CLIQUE EM UM ITEM DA LISTA AKI
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content_main, new DetalhesFragment());
        ft.addToBackStack(null);
        ft.commit();

    }

    public void setaButtons(View v){

        //floatingActionButton = (FloatingActionButton) v.findViewById(R.id.fab_fabteste);

    }

    public void listenersButtons() {

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Cria uma nova pessoa chamada Renan Teles
                Pergunta p1 = new Pergunta();
                p1.setTitulo("Titulo");
                p1.setCategotia("Categoria");
                p1.setTags("Tag1  Tag2");

                //Adiciona a pessoa1 e avisa o adapter que o conteúdo
                //da lista foi alterado
                perguntaListas.add(p1);
                adapter.notifyDataSetChanged();

            }
        });
    }





}
