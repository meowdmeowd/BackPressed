package academy_sdk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class EntryActivity extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        showAuth();
    }

    private void showAuth() {
        AuthFragment fragment = new AuthFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.entry_container, fragment)
                .addToBackStack(null)
                .commit();
    }

    private void showMain() {
        // TODO(“show main fragment”)
    }

    public static class AuthFragment extends Fragment {

        public final void onAuthSuccess() {
            // TODO(“show main fragment”)
        }
    }

    public static class MainFragment extends Fragment { }
    
    @Override
    public void onBackPressed() {
        // just do nothing 
    }  
}