package com.example.dsmpokedex

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.card.MaterialCardView

class PokeCardView : MaterialCardView {

    constructor(context: Context?) : super(context) {
        initialization()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initialization()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initialization()
    }

    private fun initialization() {
        val pokeballImage = R.drawable.pokeball
        val imageView = ImageView(context)

        strokeColor = ContextCompat.getColor(context, R.color.white)
        strokeWidth = 2

        imageView.layoutParams.height = 30
        imageView.layoutParams.width = 30
        imageView.setImageDrawable(context.getDrawable(pokeballImage))

        val params = imageView.layoutParams as ConstraintLayout.LayoutParams
        params.leftToRight = this.id
        params.topToTop = ConstraintLayout.LayoutParams.UNSET
        params.bottomToBottom = this.id
        this.requestLayout()

    }
}
