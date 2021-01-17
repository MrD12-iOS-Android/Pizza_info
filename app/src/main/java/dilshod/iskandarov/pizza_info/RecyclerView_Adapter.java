package dilshod.iskandarov.pizza_info;

import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.RecyclerViewViewHolder> {

    private ArrayList<Item> arrayList_item;
    private Context context_0;

    public RecyclerView_Adapter(ArrayList<Item> arrayList_0, Context context){
        this.arrayList_item = arrayList_0;
        this.context_0 = context;
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
       return new RecyclerViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        Item item = arrayList_item.get(position);
        holder.img.setImageResource(item.getImage());
        holder.text_00.setText(item.getTxt_0());
        holder.text_11.setText(item.getTxt_1());
    }

    @Override
    public int getItemCount() {
        return arrayList_item.size();
    }

    public class RecyclerViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView img;
        private TextView text_00, text_11;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            img = itemView.findViewById(R.id.imageView);
            text_00 = itemView.findViewById(R.id.textView_0);
            text_11 = itemView.findViewById(R.id.textView_1);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Item item_item = arrayList_item .get(position);
            Intent intent = new Intent(context_0, Selected_Activity.class);
            intent.putExtra("img", item_item.getImage());
            intent.putExtra("title", item_item.getTxt_0());
            intent.putExtra("desc", item_item.getTxt_1() );
            intent.putExtra("method", item_item.getTxt_2());
            context_0.startActivity(intent);

        }
    }
}
