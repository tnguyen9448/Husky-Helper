package main.huskyhelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int VIEW_TYPE_ITEM = 0;
    private static final int VIEW_TYPE_FOOTER = 1;

    private final OnFooterButtonClickListener footerButtonClickListener;
    Context context;
    List<ClubItem> clubs;

    public MyAdapter(Context context, List<ClubItem> clubs, OnFooterButtonClickListener footerButtonClickListener) {
        this.context = context;
        this.clubs = clubs;
        this.footerButtonClickListener = footerButtonClickListener;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == clubs.size()) {
            return VIEW_TYPE_FOOTER;
        } else {
            return VIEW_TYPE_ITEM;
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM) {
            View view = LayoutInflater.from(context).inflate(R.layout.clubitem_view, parent, false);
            return new MyViewHolder(view);
        } else {
            View view = LayoutInflater.from(context).inflate(R.layout.footer_buttons, parent, false);
            return new FooterViewHolder(view);
        }
    }

    //@Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == VIEW_TYPE_ITEM) {
            MyViewHolder itemHolder = (MyViewHolder) holder;
            ClubItem club = clubs.get(position);
            itemHolder.nameView.setText(club.getName());
            itemHolder.descriptionView.setText(club.getDescription());
            itemHolder.imgView.setImageResource(club.getImage());
        } else {
            FooterViewHolder footerHolder = (FooterViewHolder) holder;
            footerHolder.button1.setOnClickListener(v -> footerButtonClickListener.onFooterButton1Click());
            footerHolder.button2.setOnClickListener(v -> footerButtonClickListener.onFooterButton2Click());
            footerHolder.button3.setOnClickListener(v -> footerButtonClickListener.onFooterButton3Click());
        }
    }

    @Override
    public int getItemCount() {
        return clubs.size() + 1;
    }

    public interface OnFooterButtonClickListener {
        void onFooterButton1Click();
        void onFooterButton2Click();
        void onFooterButton3Click();
    }

    static class FooterViewHolder extends RecyclerView.ViewHolder {

        Button button1;
        Button button2;

        Button button3;

        public FooterViewHolder(@NonNull View itemView) {
            super(itemView);
            button1 = itemView.findViewById(R.id.intertested_button);
            button2 = itemView.findViewById(R.id.addList);
            button3 = itemView.findViewById(R.id.join_button);
        }
    }
}
