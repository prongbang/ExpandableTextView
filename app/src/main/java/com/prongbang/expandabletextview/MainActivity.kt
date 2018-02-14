package com.prongbang.expandabletextview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExpand.setOnClickListener {
            tvDescription.expandTextView()
        }

        btnCollapse.setOnClickListener {
            tvDescription.collapseTextView()
        }

        btnCycle.setOnClickListener {
            tvDescription.cycleTextViewExpansion()
        }

    }
}
