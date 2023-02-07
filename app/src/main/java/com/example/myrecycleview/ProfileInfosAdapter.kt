package com.example.myrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileInfosAdapter : RecyclerView.Adapter<ProfileInfosAdapter.ProfileInfosViewHolder>() {

    private val profileInfoList = listOf<ProfileInfos>(
        ProfileInfos("Camila", "22/07", "Bahia"),
        ProfileInfos("Jorge", "13/12", "Curitiba"),
        ProfileInfos("Maria", "04/02", "São Paulo"),
        ProfileInfos("Jennifer", "21/08", "Maranhão"),
        ProfileInfos("Leticia", "17/12", "Recife"),
        ProfileInfos("Camila", "22/07", "Bahia"),
        ProfileInfos("Jorge", "13/12", "Curitiba"),
        ProfileInfos("Maria", "04/02", "São Paulo"),
        ProfileInfos("Jennifer", "21/08", "Maranhão"),
        ProfileInfos("Leticias", "17/12", "Recife"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileInfosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_profile_infos, parent, false)
        return ProfileInfosViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileInfosViewHolder, position: Int) {
        holder.bind(profileInfoList[position])
    }

    override fun getItemCount(): Int = profileInfoList.size

    class ProfileInfosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txtName: TextView = itemView.findViewById(R.id.txt_name)
        val txtBirthday: TextView = itemView.findViewById(R.id.txt_birthday)
        val txtCity: TextView = itemView.findViewById(R.id.txt_city)

        fun bind(profileInfos: ProfileInfos) {
            txtName.text = profileInfos.name
            txtBirthday.text = profileInfos.birthday
            txtCity.text = profileInfos.city
        }
    }
}

