package th.ac.su.cp.speedrecords.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import th.ac.su.cp.speedrecords.R;
import th.ac.su.cp.speedrecords.model.User;

import org.w3c.dom.Text;

import th.ac.su.cp.speedrecords.R;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private Context mContext;
    private User[] mUsers;
    public UserAdapter(Context context, User[] users) {
        this.mContext = context;
        this.mUsers = users;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = mUsers[position];

        holder.resultTextView.setText(user.result+" KM/H");
        holder.distanceandtimeTextView.setText(user.distance+" METERS, "+user.time+" SECONDS");
        if(Double.parseDouble(user.result) > 80){
            holder.pig.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return mUsers.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView resultTextView;
        TextView distanceandtimeTextView;
        ImageView pig;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.resultTextView = itemView.findViewById(R.id.textView2;
            this.distanceandtimeTextView = itemView.findViewById(R.id.textView3);
            this.pig = itemView.findViewById(R.id.imageView3);
        }
    }
}
