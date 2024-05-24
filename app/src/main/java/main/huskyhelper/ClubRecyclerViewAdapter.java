package main.huskyhelper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import main.huskyhelper.databinding.FragmentClubBinding;

public class ClubRecyclerViewAdapter extends
        RecyclerView.Adapter<ClubRecyclerViewAdapter.ViewHolder>{

    private final List<Club> mValues;

    public ClubRecyclerViewAdapter(List<Club> clubList) {
        mValues = clubList;
    }

    @NonNull
    @Override
    public ClubRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_club, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClubRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.setItem(mValues.get(position));
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public FragmentClubBinding binding;
        public Club mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            binding = FragmentClubBinding.bind(view);
        }

        public void setItem(final Club item) {
            mItem = item;
            binding.username.setText(item.getmName());
            binding.clubName.setText(item.getmClub());
        }
    }
}
