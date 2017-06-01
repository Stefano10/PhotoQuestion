package br.ufrn.imd.fragmentsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.w3c.dom.Text;


public class BuscaFragment extends Fragment {

    Button buscarBTN;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_busca, container, false);

        buscarBTN = (Button) v.findViewById(R.id.buscarBt);

        buscarBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Buscar no banco
            }
        });
        return v;
    }


}
