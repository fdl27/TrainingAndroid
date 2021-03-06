package id.fdl.learnandroid;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;
import id.fdl.learnandroid.R;
import id.fdl.learnandroid.dialog.Day4DialogFragment;
import id.fdl.learnandroid.recycleview.RecyclerViewFragment;
import id.fdl.learnandroid.tabhost.Day4TabHostFragment;

public class Day4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_every_day);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container_every_day, Day4MainFragment.newInstance())
                    .commitNow();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_show_snackbar:
                showSnackBar();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        Fragment f = getSupportFragmentManager().findFragmentById(R.id.container_every_day);
        if (f instanceof Day4MainFragment)
            super.onBackPressed();
        else{
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container_every_day, Day4MainFragment.newInstance())
                    .commitNow();
        }
    }

    public void recyclerView(View view){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_every_day, RecyclerViewFragment.newInstance())
                .commitNow();
    }

    public void webView(View view){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_every_day, Day4WebViewFragment.newInstance())
                .commitNow();
    }

    public void searchView(View view){
        Toast.makeText(this, "Please check SearchView implementation at RecyclerView Section!", Toast.LENGTH_SHORT).show();
    }

    public void tabHost(View view){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_every_day, Day4TabHostFragment.newInstance())
                .commitNow();
    }

    public void nestedScrollView(View view){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_every_day, Day4NestedScrollViewFragment.newInstance())
                .commitNow();
    }

    public void cardView(View view){
        final Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content).getRootView()
                , "Please check CardView implementation at RecyclerView section!", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }

    public void dialog(View view){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_every_day, Day4DialogFragment.newInstance())
                .commitNow();
    }

    public void actionBar(View view){
        Toast.makeText(this, "ActionBar implemented via toolbar and menu inside this activity!", Toast.LENGTH_SHORT).show();
    }

    public void snackBar(View view){
       showSnackBar();
    }

    private void showSnackBar(){
        Fragment f = getSupportFragmentManager().findFragmentById(R.id.container_every_day);
        if (f instanceof Day4MainFragment){
            final Snackbar snackbar = Snackbar.make(f.getView(), "Hello I am SnackBar", Snackbar.LENGTH_INDEFINITE);
            snackbar.setAction("OK", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    snackbar.dismiss();
                }
            });
            snackbar.show();
        }
    }
}
