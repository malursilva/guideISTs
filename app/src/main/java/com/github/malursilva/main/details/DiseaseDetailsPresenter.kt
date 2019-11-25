package com.github.malursilva.main.details

import com.github.malursilva.model.Disease

class DiseaseDetailsPresenter {

    fun getDetailsText(disease: Disease): String{
        var text: String = "${disease.summary}\n\n"

        if(disease.waysOfContraction != null) {
            text += "Assim se pega: "
            disease.waysOfContraction!!.forEach {
                text += "\n     - ${it}"
            }
            text += "\n\n"
        }
        if(disease.nonWaysOfContraction != null) {
            text += "Assim não se pega: "
            disease.nonWaysOfContraction!!.forEach {
                text += "\n     - ${it}"
            }
            text += "\n\n"
        }
        text += "Sintomas: ${disease.symptoms}\n\n"
        if(disease.reference != null) {
            text += "Fonte: ${disease.reference}"
        }
        return text
    }

}