package com.example.juank.foods_online_pedidos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void IrPedidos(View g){

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.new_game:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
                break;
            case R.id.help:
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
