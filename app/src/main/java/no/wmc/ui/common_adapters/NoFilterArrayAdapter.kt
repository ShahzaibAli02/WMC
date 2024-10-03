package no.wmc.ui.common_adapters

import android.content.Context
import android.widget.ArrayAdapter
import android.widget.Filter

class NoFilterArrayAdapter(context: Context, resource: Int, val objects: Array<String>) :
    ArrayAdapter<String>(context, resource, objects) {

    override fun getFilter(): Filter
    {
        // Override getFilter to return a filter that doesn't perform any filtering
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filterResults = FilterResults()
                filterResults.values = objects
                filterResults.count = objects.size
                return filterResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                notifyDataSetChanged()
            }
        }
    }
}
