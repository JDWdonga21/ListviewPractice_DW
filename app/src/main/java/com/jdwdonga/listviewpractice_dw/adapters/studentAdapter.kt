package com.jdwdonga.listviewpractice_dw.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.jdwdonga.listviewpractice_dw.R
import com.jdwdonga.listviewpractice_dw.datas.Student

// 상속받아서 사용
class studentAdapter(
    val mContext : Context,
    val resId : Int,
    val mlist : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mlist) {

    val inf = LayoutInflater.from(mContext)

//    getview를 오버라이딩
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        return super.getView(position, convertView, parent)
        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!

        return row
    }

}