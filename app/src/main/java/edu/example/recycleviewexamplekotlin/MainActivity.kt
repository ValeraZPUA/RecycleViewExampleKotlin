package edu.example.recycleviewexamplekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userList : ArrayList<UserModel> = ArrayList()
        userList.add(UserModel(1, "one"))
        userList.add(UserModel(2, "two"))
        userList.add(UserModel(3, "three"))
        userList.add(UserModel(4, "four"))
        userList.add(UserModel(5, "five"))
        userList.add(UserModel(6, "six"))
        userList.add(UserModel(7, "seven"))
        userList.add(UserModel(8, "eight"))
        userList.add(UserModel(9, "nine"))
        userList.add(UserModel(10, "ten"))
        userList.add(UserModel(11, "eleven"))
        userList.add(UserModel(12, "twelve"))
        userList.add(UserModel(13, "threaten"))
        userList.add(UserModel(14, "fourteen"))
        userList.add(UserModel(15, "fifteen"))
        userList.add(UserModel(16, "sixteen"))
        userList.add(UserModel(17, "seventeen"))
        userList.add(UserModel(18, "eighteen"))
        userList.add(UserModel(1, "one"))
        userList.add(UserModel(2, "two"))
        userList.add(UserModel(3, "three"))
        userList.add(UserModel(4, "four"))
        userList.add(UserModel(5, "five"))
        userList.add(UserModel(6, "six"))
        userList.add(UserModel(7, "seven"))
        userList.add(UserModel(8, "eight"))
        userList.add(UserModel(9, "nine"))
        userList.add(UserModel(10, "ten"))
        userList.add(UserModel(11, "eleven"))
        userList.add(UserModel(12, "twelve"))
        userList.add(UserModel(13, "threaten"))
        userList.add(UserModel(14, "fourteen"))
        userList.add(UserModel(15, "fifteen"))
        userList.add(UserModel(16, "sixteen"))
        userList.add(UserModel(17, "seventeen"))
        userList.add(UserModel(18, "eighteen"))

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter : Adapter = Adapter(userList)
        recyclerView.adapter = adapter

    }
}
