package com.avp.example.daggervskoin.dagger

import com.avp.example.daggervskoin.dagger.example_dagger_module_provide_annotation.Boltons
import com.avp.example.daggervskoin.dagger.example_dagger_module_provide_annotation.Starks
import javax.inject.Inject

class War @Inject constructor(private val starks: Starks,
                              private val boltons: Boltons
) {
    fun prepare(){
        starks.prepareForWar()
        boltons.prepareForWar()
    }

    fun report(){
        starks.reportForWar()
        boltons.reportForWar()
    }
}