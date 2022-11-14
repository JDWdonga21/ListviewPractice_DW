package com.jdwdonga.listviewpractice_dw.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.jdwdonga.listviewpractice_dw.datas.Student

// 상속받아서 사용
class studentAdapter(
    val mContext : Context,
    val resId : Int,
    val mlist : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mlist) {
}