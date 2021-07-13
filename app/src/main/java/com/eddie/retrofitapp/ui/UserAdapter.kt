package com.eddie.retrofitapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eddie.retrofitapp.databinding.UserItemBinding
import com.eddie.retrofitapp.models.User

class UserAdapter (var users : List<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(private var binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindUser (user: User){

            binding.apply {
                nameTv.text = user.name
                EmailTv.text = user.email
                StreetTv.text = user.address.street
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context))
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindUser(users[position])
    }

    override fun getItemCount(): Int {
       return  users.size
    }


}