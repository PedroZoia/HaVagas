package com.example.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Toast;
import com.example.havagas.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity{
    private ActivityMainBinding amb;
    private Vagas vagas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(amb.getRoot());
        String[] lsFormacao = getResources().getStringArray(R.array.formacao);
        amb.formacao.setAdapter(new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lsFormacao));

        amb.limparBt.setOnClickListener((View view)-> {
            amb.nomeCompleto.setText("");
            amb.email.setText("");
            amb.cbEmail.setChecked(false);
            amb.telefone.setText("");
            amb.rbTelComercial.setChecked(false);
            amb.rbTelFixo.setChecked(false);
            amb.cbCelular.setChecked(false);
            amb.celular.setText("");
            amb.masculino.setChecked(false);
            amb.feminino.setChecked(false);
            amb.dataNasc.setText("");
            amb.anoFormatura.setText("");
            amb.anoConclusao.setText("");
            amb.instituicao.setText("");
            amb.titulo.setText("");
            amb.orientador.setText("");
            amb.vagaInteresse.setText("");
        });

        amb.salvarBt.setOnClickListener(view -> {
            String vaga  = vagas.toString();
            Toast.makeText(this, vaga, Toast.LENGTH_SHORT).show();
        });


        amb.cbCelular.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(amb.cbCelular.isChecked()){
                    amb.telefoneCell.setVisibility(View.VISIBLE);
                }else{
                    amb.telefoneCell.setVisibility(View.GONE);
                }
            }
        });

        amb.formacao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(amb.formacao.getItemAtPosition(i).toString().equals("Ensino Fundamental") || amb.formacao.getItemAtPosition(i).toString().equals("Ensino Médio")){
                    amb.anoFormatura.setVisibility(View.VISIBLE);
                    amb.anoConclusao.setVisibility(View.GONE);
                    amb.instituicao.setVisibility(View.GONE);
                    amb.titulo.setVisibility(View.GONE);
                    amb.orientador.setVisibility(View.GONE);
                }
                else if(amb.formacao.getItemAtPosition(i).toString().equals("Graduação") || amb.formacao.getItemAtPosition(i).toString().equals("Especialização")){
                    amb.anoConclusao.setVisibility(View.VISIBLE);
                    amb.instituicao.setVisibility(View.VISIBLE);
                    amb.anoFormatura.setVisibility(View.GONE);
                    amb.titulo.setVisibility(View.GONE);
                    amb.orientador.setVisibility(View.GONE);
                }
                else{
                    amb.anoFormatura.setVisibility(View.GONE);
                    amb.anoConclusao.setVisibility(View.VISIBLE);
                    amb.instituicao.setVisibility(View.VISIBLE);
                    amb.titulo.setVisibility(View.VISIBLE);
                    amb.orientador.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}


