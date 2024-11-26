package com.example.colortilesgame

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.AsyncTask
//import android.util.Log
import android.view.MotionEvent
import android.view.View
import kotlin.random.Random

data class ColorTile(var x: Int, var y: Int, val size: Int, val color: Int)
//lateinit var even: Array<ColorTile>
//lateinit var odd: Array<ColorTile>
val paint = Paint()
var h = 1000; var w = 1000

open class ColorTiles(ctx: Context) : View(ctx) {
    fun alterColor() {



    }


}
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.rgb(10, 18, 41))

        for (s in lala) {
            paint.color = s.color
            canvas.drawRect(s.size, paint)
        }

    }

    @SuppressLint("DrawAllocation")
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        h = bottom - top; w = right - left
        // TODO заполнить массив снежинками со случайными координатами, радиусами и скоростями
        val r = Random(0)
        r.nextFloat() // генерирует число от 0 до 1
        val red = Random(1)
        red.nextFloat()
        val green = Random(2)
        green.nextFloat()
        val blue = Random(3)
        blue.nextFloat()
        val size = 20
        var even: Array<ColorTile> = Array(4) {
            ColorTile(
                x = 0,
                y = 0 + size,
                size,
                Color.rgb((red.nextFloat() * 256), green.nextFloat() * 256, blue.nextFloat() * 256),
            )
        }
        var odd: Array<ColorTile> = Array(4) {
            ColorTile(
                x = 0 + size,
                y = size,
                size,
                Color.rgb((red.nextFloat() * 256), green.nextFloat() * 256, blue.nextFloat() * 256),
            )

        val lala: Array<Array<ColorTile>> = arrayOf(even, odd)

//        Log.d("mytag", "snow: " + snow.contentToString())
    }

//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        moveSnowflakes()
//        invalidate() // перерисовать View
//        moveTask = MoveTask(this)
//        moveTask.execute(100)
//        return false // защита от множественных срабатываний
//
//    }

}