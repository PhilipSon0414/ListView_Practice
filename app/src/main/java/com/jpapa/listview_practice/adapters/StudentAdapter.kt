package com.jpapa.listview_practice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.jpapa.listview_practice.R
import com.jpapa.listview_practice.datas.Student

// ArrayAdapter라는 기존에 있는 클래스를 상속받아서 StudentAdpater라는 Adapter를 만든다. 그래서 기존 ArrayAdapter의 일부 기능을 수정하여 StudentAdapter를 만든다.
class StudentAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext,resID,mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item, root: null)
        }
        val row = tempRow!!

        return row


    }
}