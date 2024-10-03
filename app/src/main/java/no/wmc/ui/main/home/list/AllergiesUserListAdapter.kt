package no.wmc.ui.main.home.list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import no.wmc.databinding.HomeListItemNewBinding
import no.wmc.firebase.model.AllCategoryModel

class AllergiesUserListAdapter(val context: Context, private var list: ArrayList<AllCategoryModel>) : RecyclerView.Adapter<AllergiesUserListAdapter.ViewHolder>() {

    class ViewHolder(val binding: HomeListItemNewBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        return  ViewHolder(HomeListItemNewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//                holder.binding.title.text = "Dummydata"

        holder.binding.textView.text = list[position].description
    }

    override fun getItemCount(): Int {
        return list.size
    }

}