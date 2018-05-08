package id.ac.uty.myhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klikBooks (View view){
        Toast.makeText(this, "Books Clicked", Toast.LENGTH_SHORT).show();
    }

    public void klikTree (View view){
        Toast.makeText(this, "Tree Clicked", Toast.LENGTH_SHORT).show();
    }

    public void klikViews (View view){
        Toast.makeText(this, "Views Clicked", Toast.LENGTH_SHORT).show();
    }

    public void klikLike (View view){
        Toast.makeText(this, "Like Clicked", Toast.LENGTH_SHORT).show();
    }

    public void klikLocation (View view){
        Toast.makeText(this, "Location Clicked", Toast.LENGTH_SHORT).show();
    }

    public void klikShop (View view){
        Toast.makeText(this, "Shop Clicked", Toast.LENGTH_SHORT).show();
    }
}
