package dilshod.iskandarov.pizza_info;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> recyclerViews = new ArrayList<>();
        recyclerViews.add(new Item(R.drawable.one, Utils.Title_1, Utils.Desc_1, Utils.Method_1));
        recyclerViews.add(new Item(R.drawable.two, Utils.Title_2, Utils.Desc_2, Utils.Method_2));
        recyclerViews.add(new Item(R.drawable.three, Utils.Title_5, Utils.Desc_5, Utils.Method_5));
        recyclerViews.add(new Item(R.drawable.four, Utils.Title_4, Utils.Desc_4, Utils.Method_4));
        recyclerViews.add(new Item(R.drawable.five, Utils.Title_3, Utils.Desc_3, Utils.Method_3));
        recyclerViews.add(new Item(R.drawable.one, Utils.Title_1, Utils.Desc_1, Utils.Method_1));
        recyclerViews.add(new Item(R.drawable.two, Utils.Title_2, Utils.Desc_2, Utils.Method_2));
        recyclerViews.add(new Item(R.drawable.three, Utils.Title_5, Utils.Desc_5, Utils.Method_5));
        recyclerViews.add(new Item(R.drawable.four, Utils.Title_4, Utils.Desc_4, Utils.Method_4));
        recyclerViews.add(new Item(R.drawable.five, Utils.Title_3, Utils.Desc_3, Utils.Method_3));
        recyclerViews.add(new Item(R.drawable.one, Utils.Title_1, Utils.Desc_1, Utils.Method_1));
        recyclerViews.add(new Item(R.drawable.two, Utils.Title_2, Utils.Desc_2, Utils.Method_2));
        recyclerViews.add(new Item(R.drawable.three, Utils.Title_5, Utils.Desc_5, Utils.Method_5));
        recyclerViews.add(new Item(R.drawable.four, Utils.Title_4, Utils.Desc_4, Utils.Method_4));
        recyclerViews.add(new Item(R.drawable.five, Utils.Title_3, Utils.Desc_3, Utils.Method_3));
        recyclerViews.add(new Item(R.drawable.one, Utils.Title_1, Utils.Desc_1, Utils.Method_1));
        recyclerViews.add(new Item(R.drawable.two, Utils.Title_2, Utils.Desc_2, Utils.Method_2));
        recyclerViews.add(new Item(R.drawable.three, Utils.Title_5, Utils.Desc_5, Utils.Method_5));
        recyclerViews.add(new Item(R.drawable.four, Utils.Title_4, Utils.Desc_4, Utils.Method_4));
        recyclerViews.add(new Item(R.drawable.five, Utils.Title_3, Utils.Desc_3, Utils.Method_3));

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        adapter = new RecyclerView_Adapter(recyclerViews, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}