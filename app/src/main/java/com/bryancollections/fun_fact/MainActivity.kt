package com.bryancollections.fun_fact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.bryancollections.fun_fact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     var binding:ActivityMainBinding? = null
     var adapter:FactAdapter? = null

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
         setUpFact()
    }

    private fun setUpFact(){
        adapter = FactAdapter(this,DummyData.funFacts)
        binding?.factListView?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this," Hmmm i wish you work",Toast.LENGTH_LONG).show()
        }
    }
}
