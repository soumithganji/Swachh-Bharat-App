package com.example.swachhbharat;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ContactHolder> {
//    private final ArrayList<item> contactsList;
    // List to store all the contact details
//    public  ArrayList<item> contactsList;
    public ArrayList<item> contactsList = new ArrayList<>();
    public Context mContext;
    // Counstructor for the Class
    public MyAdapter(ArrayList<item> contactsList, Context context) {
        this.contactsList =contactsList;
        this.mContext = context;
    }
    // This method creates views for the RecyclerView by inflating the layout
    // Into the viewHolders which helps to display the items in the RecyclerView
    @Override
    public ContactHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the layout view you have created for the list rows here
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new ContactHolder(view);
    }
    @Override
    public int getItemCount() {
        return contactsList == null? 0: contactsList.size();
    }
    // This method is called when binding the data to the views being created in RecyclerView
    @Override
    public void onBindViewHolder(@NonNull ContactHolder holder, final int position) {
        final item contact = contactsList.get(position);

        // Set the data to the views here
        holder.setDate(contact.getDate());
        holder.setTime(contact.getTime());
        holder.setAddress(contact.getAddress());
        holder.setImage(contact.getUserPhoto());
        // You can set click listners to indvidual items in the viewholder here
        // make sure you pass down the listner or make the Data members of the viewHolder public

    }
    // This is your ViewHolder class that helps to populate data to the view
    public class ContactHolder extends RecyclerView.ViewHolder {
        private TextView date;
        private TextView time;
        private TextView address;
        ImageView img_user;

        public ContactHolder(View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time);
            address = itemView.findViewById(R.id.address);
            img_user = itemView.findViewById(R.id.imageView);
        }

        public void setDate(String name) {
            date.setText(name);
        }
        public void setTime(String number) {
            time.setText(number);
        }
        public void setAddress(String number) {
            address.setText(number);
        }
        public void setImage(Bitmap number) {
            img_user.setImageBitmap(number);
        }
    }
}