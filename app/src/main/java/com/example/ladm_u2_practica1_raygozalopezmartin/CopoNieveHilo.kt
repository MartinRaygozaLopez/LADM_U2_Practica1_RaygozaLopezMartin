package com.example.ladm_u2_practica1_raygozalopezmartin

class CopoNieveHilo (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(50)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCopo()
            }
        }
    }
}