package com.jpapa.listview_practice.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.jpapa.listview_practice.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext,resID,mList) {
}