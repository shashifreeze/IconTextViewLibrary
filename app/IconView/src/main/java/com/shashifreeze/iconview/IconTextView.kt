package com.shashifreeze.iconview

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import info.androidhive.fontawesome.FontTextView


/**
@Author: Shashi
@Date: 14-04-2021 at 16:53
@Description: Custom text view that contains
 */

class IconTextView(mContext: Context, attrs: AttributeSet) : LinearLayout(mContext, attrs) {

    /**
     * Define attributes as members
     */
    private var startTextView: TextView
    private var endTextView: TextView
    private var fontView: FontTextView

    //Expose variables
    val startText get() = startTextView
    val endText get() = endTextView
    val font get() = fontView

    init {
        //inflating layout
        inflate(context, R.layout.icon_text_view, this)
        // init start text view
        startTextView = findViewById<TextView>(R.id.startTextView)
        // init start text view
        endTextView = findViewById<TextView>(R.id.endTextView)
        //init fontview
        fontView = findViewById<FontTextView>(R.id.fontTextView)
        //getting attributes
        val attributes = context.obtainStyledAttributes(attrs, R.styleable.IconTextView)
        //Setting text to fontView
        fontView.text = attributes.getString(R.styleable.IconTextView_icon_text)
        //setting text to start textView
        startTextView.text = attributes.getString(R.styleable.IconTextView_start_text)
        //setting text to end textView
        endTextView.text = attributes.getString(R.styleable.IconTextView_end_text)
        //add attributes
        attributes.recycle()
    }

}