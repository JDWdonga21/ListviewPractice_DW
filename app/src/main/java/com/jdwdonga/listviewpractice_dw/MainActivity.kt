package com.jdwdonga.listviewpractice_dw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jdwdonga.listviewpractice_dw.adapters.studentAdapter
import com.jdwdonga.listviewpractice_dw.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    맴버변수로 선언
    val mStudentList = ArrayList<Student>()

//    나중에 초기화 한다.
    lateinit var mAdapter: studentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("가길동", 1989, "010-1111-1111") )
        mStudentList.add( Student("나길동", 1990, "010-2222-2222") )
        mStudentList.add( Student("다길동", 1985, "010-3333-3333") )
        mStudentList.add( Student("라길동", 1977, "010-4444-4444") )
        mStudentList.add( Student("마길동", 1994, "010-5555-5555") )
        mStudentList.add( Student("바길동", 1989, "010-6666-6666") )
        mStudentList.add( Student("사길동", 1990, "010-7777-7777") )
        mStudentList.add( Student("아길동", 1985, "010-8888-8888") )
        mStudentList.add( Student("자길동", 1994, "010-9999-9999") )


        mAdapter = studentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter
    }
}