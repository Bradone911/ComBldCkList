package com.bignerdranch.android.combldcklist;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener {

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)   {
//        return super.onCreateView(inflater, container, savedInstanceState);
            View view = inflater.inflate(R.layout.list_fragment,container,false);

            return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)  {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.build_list,android.R.layout.simple_list_item_1);
        setListAdapter(arrayAdapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String[] buildList = getActivity().getResources().getStringArray(R.array.build_list);

        Toast.makeText(getActivity(), "Add " + buildList[position], Toast.LENGTH_SHORT).show();
    }
}