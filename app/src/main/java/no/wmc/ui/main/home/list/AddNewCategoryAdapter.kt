package no.wmc.ui.main.home.list

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.SectionIndexer
import androidx.recyclerview.widget.RecyclerView
import no.wmc.databinding.ItemViewAddNewCategoryBinding
import no.wmc.firebase.model.AllCategoryModel
import java.util.Locale


class AddNewCategoryAdapter(val context: Context, private var list: List<AllCategoryModel>, val listener: AddNewCategoryListener) : RecyclerView.Adapter<AddNewCategoryAdapter.ViewHolder>() ,
    SectionIndexer
{

    private var mSectionPositions: ArrayList<Int> = ArrayList()
    override fun getSectionForPosition(position: Int): Int
    {
        return 0
    }

    override fun getSections(): Array<String>
    {
        Log.d("TAG", "getSections: ")
        val sections: MutableList<String> = ArrayList(26)
        mSectionPositions = ArrayList(26)
        var i = 0
        val size: Int = list.size
        Log.d("TAG", "SIZE : "+size)
        while (i < size)
        {
            val section: String = java.lang.String.valueOf(list[i].description?.getOrNull(0)?:"")
                .uppercase(Locale.getDefault())
            if (!sections.contains(section))
            {
                sections.add(section)
                mSectionPositions.add(i)
            }
            i++
        }
        return sections.toTypedArray()
    }

    override fun getPositionForSection(sectionIndex: Int): Int
    {
        return mSectionPositions[sectionIndex]
    }
    class ViewHolder(val binding: ItemViewAddNewCategoryBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        return  ViewHolder(ItemViewAddNewCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.title.text = list[position].description

        holder.binding.root.setOnClickListener {
            listener.itemClick(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface AddNewCategoryListener{
        fun itemClick(data: AllCategoryModel)
    }
    fun notifyChanged()
    {
        list=list.sortedWith(compareBy { it.description?.firstOrNull()?.toUpperCase() })
        notifyDataSetChanged()
    }
    fun updateList(updateNew: List<AllCategoryModel>){
        list = updateNew
        list=list.sortedWith(compareBy { it.description?.firstOrNull()?.toUpperCase() })
        notifyDataSetChanged()
    }

}