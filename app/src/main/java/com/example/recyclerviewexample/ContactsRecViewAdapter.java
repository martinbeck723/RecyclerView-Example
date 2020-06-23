package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsRecViewAdapter extends RecyclerView.Adapter<ContactsRecViewAdapter.ViewHolder>{
    private ArrayList<Contact> contacts=new ArrayList<>();
    private Context context;
    //constructor
    public ContactsRecViewAdapter(Context context) {
        this.context=context;
    }

    //three mandatory menthod onCreateViewHolder, onBindViewHolder, and getItemCount

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //most important method
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.txtName.setText(contacts.get(position).getName());
        //inside here we can set up UI onClick method
        holder.parent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(context,contacts.get(position).getName() + " Selected",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        //notify changed so we will refresh
        notifyDataSetChanged();
    }

    //convention to have a ViewHolder inner class
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtName;
        //for UI onClick
        private RelativeLayout parent;
        //inner class constructor
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            //for UI onClick
            parent=itemView.findViewById(R.id.parent);
        }
    }
}
