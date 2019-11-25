package com.github.malursilva.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.github.malursilva.R
import com.github.malursilva.main.details.DiseaseDetailsActivity
import com.github.malursilva.model.Disease
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val DISEASE = "disease"
    }

    private val presenter: MainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUp()
    }

    private fun setUp() {
        supportActionBar?.setDisplayShowTitleEnabled(false)
        main_recycler_view.apply {
            adapter = MainRecyclerViewAdapter(
                presenter.getDataList(),
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