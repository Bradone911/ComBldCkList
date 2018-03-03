package com.bignerdranch.android.combldcklist;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    final String itemStr = list.get(position).ItemStrings;
//    viewHolder.text.setText(itemStr);
//
//    viewHolder.checkBox.setTag(position);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    viewHolder.checkBox.setOnClickListener(new View.OnClickListener()   {
//        @Override
//        public void onClick(View view)  {
//            boolean newState = !list.get(position).isChecked();
//            list.get(position).checked = newState;
//            Toast.makeText(getApplicationContext(),
//                    itemStr + "setOnClickListener\nchecked: " + newState,
//                    Toast.LENGTH_LONG.show();
//        }
//    });
//
//            viewHolder.checkBox.setChecked(isChecked(position));
//
//        return rowView;
}
