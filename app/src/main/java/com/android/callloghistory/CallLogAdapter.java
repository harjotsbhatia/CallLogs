package com.android.callloghistory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CallLogAdapter extends RecyclerView.Adapter<CallLogAdapter.ViewHolder> {

    private List<CallLogItem> callLogItems;

    public CallLogAdapter(List<CallLogItem> callLogItems) {
        this.callLogItems = callLogItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_call_log, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CallLogItem item = callLogItems.get(position);
        holder.name.setText(item.getName());
        holder.number.setText(item.getNumber());
        holder.date.setText(item.getDate());
        holder.duration.setText(item.getDuration());
    }

    @Override
    public int getItemCount() {
        return callLogItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, number, date, duration;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            number = itemView.findViewById(R.id.tv_number);
            date = itemView.findViewById(R.id.tv_date);
            duration = itemView.findViewById(R.id.tv_duration);
        }
    }
}