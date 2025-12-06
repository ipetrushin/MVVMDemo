package com.example.mvvmdemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val provider = ViewModelProvider(this)
        viewModel = provider.get(MainViewModel::class.java)
        // Инструкции в упражнении
        // https://www.innovationcampus.ru/lms/mod/book/view.php?id=918&chapterid=940
        observeViewModel()

        initView()
    }

    fun observeViewModel() {
        // TODO: сделать отображение изменённых данных
    }

    fun initView() {
    // TODO: добавить обработчик
    }
}