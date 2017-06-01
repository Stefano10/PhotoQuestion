package br.ufrn.imd.fragmentsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class LoginFragment extends Fragment {


    String url = "http://159.203.75.66/pat/login";
    Button logarBtn;
    EditText login;
    EditText senha;
    TextView cadastroLink;




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_login, container, false);

        logarBtn = (Button) v.findViewById(R.id.logarBtn);
        login = (EditText) v.findViewById(R.id.loginID);
        senha = (EditText) v.findViewById(R.id.senhaID);
        cadastroLink = (TextView) v.findViewById(R.id.linkCadastro);

        logarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String login1 = login.getText().toString();
                String senha1 = senha.getText().toString();

                if (verificar(login1, senha1)) {

                    FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.content_main, new FeedFragment());
                    ft.addToBackStack(null);
                    ft.commit();
                }

            }
        });


        cadastroLink.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content_main, new Cadastro());
                ft.addToBackStack(null);
                ft.commit();
            }
        });



        return v;
    }

    public boolean verificar(String login, String senha){
        //TODO Fazer validação do login
        return true;
    }




}
