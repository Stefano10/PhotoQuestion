package br.ufrn.imd.fragmentsexample;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;




public class Cadastro extends Fragment {
    String url = "http://159.203.75.66/pat/objeto";
    Button cadastrarBtn;
    EditText tombo;
    EditText serial;
    EditText situacao;
    EditText local;
    EditText descricao;

    //TODO ARRUMAR VARIÁVEIS

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_cadastro, container, false);

        cadastrarBtn = (Button) v.findViewById(R.id.cadastrarBT);
        tombo = (EditText) v.findViewById(R.id.tomboCad);
        serial = (EditText) v.findViewById(R.id.serialCad);
        local = (EditText) v.findViewById(R.id.localCad);
        descricao = (EditText) v.findViewById(R.id.descricaoCad);
        situacao = (EditText) v.findViewById(R.id.situacaoCad);

        cadastrarBtn.setOnClickListener(new View.OnClickListener() {
            //TODO CADASTRAR PESSOA NO BANCO

            @Override
            public void onClick(View view) {
                    //TODO CADASTRAR NO BANCO
                        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.content_main, new LoginFragment());
                        ft.addToBackStack(null);
                        ft.commit();
            }
        });



        return v;
    }
}
