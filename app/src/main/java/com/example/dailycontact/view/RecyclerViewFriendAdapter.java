package com.example.dailycontact.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailycontact.R;
import com.example.dailycontact.model.Friend;

import java.util.List;

public class RecyclerViewFriendAdapter extends RecyclerView.Adapter<RecyclerViewFriendAdapter.ViewHolder> {

    private Context context;
    private List<Friend> friendList;

    public RecyclerViewFriendAdapter(Context context, List<Friend> friendList) {
        this.context = context;
        this.friendList = friendList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_friend_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Friend friend = friendList.get(position);
        holder.txtName.setText(String.valueOf(friend.getName()));
        holder.txtPhone.setText(String.valueOf(friend.getPhoneNumber()));
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName, txtPhone;
        public ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
        }
    }

}
