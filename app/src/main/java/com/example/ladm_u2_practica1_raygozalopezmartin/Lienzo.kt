package com.example.ladm_u2_practica1_raygozalopezmartin

import android.graphics.*
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    var puntero = p
    var punteroCopos : FiguraGeometrica? = null
    var copos : Array<FiguraGeometrica> = Array(100, { FiguraGeometrica(-10, 1400, 10) })


    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var paint = Paint()

        c.drawColor(Color.rgb(37,40,80))

        paint.color = Color.rgb(190, 190, 190)
        c.drawRect(0f,1100f,1080f, 1920f,paint)

        //Casa
        paint.color = Color.LTGRAY
        c.drawRect(450f,850f,1000f,1200f,paint)


        //Ventana
        paint.color = Color.rgb(150,150,150)
        paint.style = Paint.Style.FILL
        c.drawCircle(600f, 1000f, 50f, paint)
        paint.color = Color.WHITE
        paint.strokeWidth = 5f
        c.drawLine(600f, 950f, 600f, 1050f, paint)
        c.drawLine(550f, 1000f, 650f, 1000f, paint)
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        c.drawCircle(600f, 1000f, 50f, paint)

        //Puerta
        paint.color = Color.rgb(150,150,150)
        paint.style = Paint.Style.FILL
        c.drawRect(750f,1000f,850f,1200f,paint)
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        c.drawRect(750f,1000f,850f,1200f,paint)

        //Triangulo de la casa
        var path = Path();
        path.moveTo(400f, 850f);
        path.lineTo(1050f, 850f);
        path.lineTo(725f, 650f);
        paint.setStyle(Paint.Style.FILL);
        paint.color = Color.rgb(64, 181, 244)
        c.drawPath(path, paint);
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 7f
        paint.color = Color.BLACK
        c.drawPath(path, paint);

        //Contorno de la casa
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 7f
        paint.color = Color.BLACK
        c.drawRect(450f,850f,1000f,1200f,paint)

        //Tronco del arbol
        paint.color = Color.rgb(128,64,0)
        paint.style = Paint.Style.FILL
        c.drawRect(200f,1000f,250f,1300f,paint)

        //Hojas del arbol
        paint.color = Color.rgb(140, 233, 19)
        paint.style = Paint.Style.FILL
        c.drawCircle(225f, 1050f, 80f, paint)
        c.drawCircle(225f, 950f, 60f, paint)
        c.drawCircle(225f, 870f, 40f, paint)
        c.drawCircle(225f, 820f, 20f, paint)

        //Luna
        paint.color = Color.rgb(225,225,225)
        paint.style = Paint.Style.FILL
        c.drawCircle(800f, 200f, 150f, paint)
        paint.color = Color.rgb(37,40,80)
        paint.style = Paint.Style.FILL
        c.drawCircle(900f, 200f, 150f, paint)


        //Nube izquierda
        paint.color = Color.rgb(225,225,225)
        paint.style = Paint.Style.FILL
        c.drawCircle(400f, 250f, 30f, paint)
        c.drawCircle(380f, 230f, 30f, paint)
        c.drawCircle(340f, 230f, 30f, paint)
        c.drawCircle(300f, 220f, 35f, paint)
        c.drawCircle(280f, 250f, 30f, paint)
        c.drawCircle(300f, 270f, 30f, paint)
        c.drawCircle(335f, 280f, 30f, paint)
        c.drawCircle(373f, 278f, 20f, paint)
        c.drawCircle(353f, 270f, 20f, paint)

        c.drawCircle(900f, 450f, 30f, paint)
        c.drawCircle(880f, 430f, 30f, paint)
        c.drawCircle(840f, 430f, 30f, paint)
        c.drawCircle(800f, 420f, 35f, paint)
        c.drawCircle(780f, 450f, 30f, paint)
        c.drawCircle(800f, 470f, 30f, paint)
        c.drawCircle(835f, 480f, 30f, paint)
        c.drawCircle(873f, 478f, 20f, paint)
        c.drawCircle(853f, 470f, 20f, paint)

        c.drawCircle(300f, 550f, 30f, paint)
        c.drawCircle(280f, 530f, 30f, paint)
        c.drawCircle(240f, 530f, 30f, paint)
        c.drawCircle(200f, 520f, 35f, paint)
        c.drawCircle(180f, 550f, 30f, paint)
        c.drawCircle(200f, 570f, 30f, paint)
        c.drawCircle(235f, 580f, 30f, paint)
        c.drawCircle(273f, 578f, 20f, paint)
        c.drawCircle(253f, 570f, 20f, paint)

        //Luces navideñas
        paint.color = Color.RED
        paint.style = Paint.Style.FILL
        c.drawCircle(160f, 1000f, 10f, paint)
        c.drawCircle(200f, 900f, 10f, paint)
        c.drawCircle(250f, 1100f, 10f, paint)
        c.drawCircle(250f, 950f, 10f, paint)
        c.drawCircle(230f, 850f, 10f, paint)
        paint.color = Color.YELLOW
        c.drawCircle(230f, 970f, 10f, paint)
        c.drawCircle(220f, 1050f, 10f, paint)
        c.drawCircle(300f, 1050f, 10f, paint)
        paint.color = Color.rgb(255,80,0)
        c.drawCircle(160f, 1100f, 10f, paint)
        c.drawCircle(225f, 1000f, 10f, paint)

        //Copos de nieve
        paint.color = Color.WHITE
        paint.style = Paint.Style.FILL
        (0..99).forEach {
            copos[it].pintar(c,paint)
        }
    }

    fun animarCopo() {
        (0..99).forEach {
            copos[it].caidaCopos()
        }
        invalidate()
    }
}