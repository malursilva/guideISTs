package com.github.malursilva.main.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.malursilva.R
import com.github.malursilva.model.Disease
import kotlinx.android.synthetic.main.activity_details.*

class DiseaseDetailsActivity : AppCompatActivity() {
    private val presenter: DiseaseDetailsPresenter = DiseaseDetailsPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val disExtra = (intent.getSerializableExtra("disease") as Disease)
        setUp(disExtra)
    }

    private fun setUp(disease: Disease) {
        details_title.text = disease.name
        details_text.text = presenter.getDetailsText(disease)
    }

}