package com.jdwdonga.listviewpractice_dw.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

        val studentData = mlist[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthYear = row.findViewById<TextView>(R.id.birthYear)
        // 년도 가져오는 알고리즘 구해서 적용하기
        val korAge = 2022 - studentData.birthYear + 1

        val phoneNum = row.findViewById<TextView>(R.id.phoneNumbers)

        nameTxt.text = studentData.name
        birthYear.text = "(${studentData.birthYear}년생), 나이 : ${korAge} 세"
        phoneNum.text =  "전화번호 : ${studentData.phoneNum}"



        return row
    }

}