package br.com.igojeferson.firebase.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.com.igojeferson.firebase.R;

public class FormularioFragment extends Fragment{

    private TextInputLayout tilNome;
    private FloatingActionButton btCadastrar;

    private DatabaseReference mDatabase;

    public FormularioFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tarefa, container, false); // FIXME - fragment_formulario;

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        mDatabase = database.getReference("pessoas");


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
