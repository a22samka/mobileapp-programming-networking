package com.example.networking;

    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;


public class BergAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Mountain> berg;
    public BergAdapter(List<Mountain> berg) {
        this.berg = berg;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_holder, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(berg.get(position).getName());
        holder.size.setText(String.valueOf(berg.get(position).getSize()));
    }

    @Override
    public int getItemCount() {
        return berg.size();
    }
}