package ao.co.isptec.aplm.desafio;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editTask;
    private ListView listViewTasks;
    private ArrayList<String> taskList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTask = findViewById(R.id.editTask);
        listViewTasks = findViewById(R.id.listViewTasks);

        taskList = new ArrayList<>();

        taskList.add("Preparar o ambiente para o Lab 2 parte 2");
        taskList.add("Enviar memorando até às 23h59");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, taskList);
        listViewTasks.setAdapter(adapter);


        editTask.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_UP) && (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    String newTask = editTask.getText().toString().trim();

                    if (!newTask.isEmpty()) {
                        taskList.add(0, newTask);
                        adapter.notifyDataSetChanged();
                        editTask.setText("");
                    }
                    return true;
                }
                return false;
            }
        });
    }
}