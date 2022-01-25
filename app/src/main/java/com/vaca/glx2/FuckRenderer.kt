package com.vaca.glx2

import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10
import android.opengl.GLES20




class FuckRenderer:GLSurfaceView.Renderer {
    var redValue = 1.0
    private val DURATION_OF_FLASH = 1000.0 // 1 second

    override fun onSurfaceCreated(p0: GL10?, p1: EGLConfig?) {
        GLES20.glClearColor(redValue.toFloat(), 0.0f, 0.0f, 1.0f)
    }

    override fun onSurfaceChanged(p0: GL10?, p1: Int, p2: Int) {

    }

    override fun onDrawFrame(p0: GL10?) {
        GLES20.glClearColor(redValue.toFloat(), 0.0f, 0.0f, 1.0f)
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT)

        redValue =
            Math.sin(System.currentTimeMillis() * 2 * Math.PI / DURATION_OF_FLASH) * 0.5 + 0.5
    }
}