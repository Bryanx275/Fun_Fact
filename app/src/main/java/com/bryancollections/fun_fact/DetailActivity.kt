package com.bryancollections.fun_fact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bryancollections.fun_fact.databinding.ActivityDetailBinding
import com.bryancollections.fun_fact.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    private var logo = 0
    private var name: String? = null
    private var detail: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs,0 )
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAs)
        setUpFactDetail()
    }

    private fun setUpFactDetail(){
        binding?.detailTv?.text = detail
        binding?.logoIv?.setImageResource(logo)
        title = name



    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}