package com.jdwdonga.listviewpractice_dw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jdwdonga.listviewpractice_dw.datas.Student

class MainActivity : AppCompatActivity() {

//    맴버변수로 선언
    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("정동욱", 1989) )
        mStudentList.add( Student("문슬아", 1990) )
        mStudentList.add( Student("곽도영", 1985) )
        mStudentList.add( Student("윤자명", 1977) )
    }
}