package com.shogonir.hatebukurou

import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by shogo on 6/7/17.
 */

// public static class ViewHolder extends RecyclerView.ViewHolder {


class MyAdapter(myDataset: Array<String>): RecyclerView.Adapter<MyAdapter.ViewHolder>()  {

    val mDataset: Array<String> = myDataset

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var mTextView: TextView? = itemView.findViewById(R.id.info_text) as? TextView

        companion object Factory {
            fun create(v: TextView): ViewHolder = ViewHolder(v)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent?.context)
                .inflate(R.layout.my_text_view, parent, false)
        val vh: ViewHolder = ViewHolder(v)
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.mTextView?.text = mDataset[position]
    }

    override fun getItemCount(): Int = mDataset.size
}
