package br.ufrn.imd.fragmentsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.zxing.integration.android.IntentIntegrator;

import android.widget.ProgressBar;
import android.widget.TextView;


public class PerguntaFragment extends Fragment {

    private Button buscarBtn;
    private ImageButton scan_btn;
    private EditText tombo;
    TextView descricaoV;
    ProgressBar barra;

    String URLBusca = "http://159.203.75.66/pat/objeto/tombo/";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.pergunta_fragment, container, false);

        buscarBtn = (Button) v.findViewById(R.id.buscarbt);

        scan_btn = (ImageButton) v.findViewById(R.id.cameraBuscar);
        tombo = (EditText) v.findViewById(R.id.tomboSerial);

        scan_btn.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view) {
                //TODO VER PARA PEGAR A FOTO

               IntentIntegrator integrator = new IntentIntegrator(getActivity());

               integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);

                integrator.setPrompt("Scan");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();

         }
         });


        buscarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CADASTRAR IMAGEN NO BANCO
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content_main, new FeedFragment());
                ft.addToBackStack(null);
                ft.commit();
            }

        });



        return v;
    }




}
