package com.github.malursilva.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.malursilva.R
import com.github.malursilva.main.details.DiseaseDetailsActivity
import com.github.malursilva.model.Disease
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val DISEASE = "disease"
    }

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        setUpView()
    }

    override fun onResume() {
        super.onResume()
        main_recycler_view.adapter?.notifyDataSetChanged()
    }

    private fun setUpView() {
        main_recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this.context).apply {
                orientation = LinearLayoutManager.VERTICAL
            }
            adapter = MainRecyclerViewAdapter(
                presenter.createData(),
                onItemClick = { disease -> showDiseaseDetails(disease) }
            )
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

    }

    private fun showDiseaseDetails(disease: Disease) {
        val intent = Intent(this, DiseaseDetailsActivity::class.java)
        intent.putExtra(DISEASE, disease)
        startActivity(intent)
    }

}