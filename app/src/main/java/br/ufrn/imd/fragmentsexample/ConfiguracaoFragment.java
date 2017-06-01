package br.ufrn.imd.fragmentsexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ConfiguracaoFragment extends Fragment {

    Button salvarBTN;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_config, container, false);

        salvarBTN = (Button) v.findViewById(R.id.salvarbtn);

        salvarBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO SALVAR NO BANCO AS CONFIGURAÇÕES
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content_main, new FeedFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


        return v;
    }

  
}
