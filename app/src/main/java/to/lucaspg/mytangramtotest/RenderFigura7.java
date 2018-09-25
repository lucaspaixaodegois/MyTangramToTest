package to.lucaspg.mytangramtotest;


import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import to.lucaspg.mytangramtotest.figurasGeometricas.Paralelogramo;
import to.lucaspg.mytangramtotest.figurasGeometricas.Quadrado;
import to.lucaspg.mytangramtotest.figurasGeometricas.Triangulo;

public class RenderFigura7 implements GLSurfaceView.Renderer
{

    private Triangulo triangulo1, triangulo2, triangulo3, triangulo4, triangulo5;
    private Quadrado quadrado1;
    private Paralelogramo paralelogramo1;
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        gl.glClearColor(1,1,1,1);

    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        gl.glViewport(0, 0, width, height);

        gl.glMatrixMode(GL10.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrthof(0, width, 0, height, -1, 1);
        gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();

        triangulo1 = new Triangulo(gl, 80);
        triangulo1.setTranslate(600, 700);
        triangulo1.setCor(0,1,1,1);
        triangulo1.setRotation(-45);

        triangulo2 = new Triangulo(gl, 120);
        triangulo2.setTranslate(540, 640);
        triangulo2.setCor(1,0,1,1);
        triangulo2.setRotation(-90);

        triangulo3 = new Triangulo(gl, 240);
        triangulo3.setTranslate(510, 500);
        triangulo3.setCor(0,0,1,1);
        triangulo3.setRotation(-135);

        triangulo4 = new Triangulo(gl, 240);
        triangulo4.setTranslate(390, 450);
        triangulo4.setCor(1,0,1,1);
        triangulo4.setRotation(-180);

        quadrado1 = new Quadrado(gl, 80);
        quadrado1.setTranslate(468, 290);
        quadrado1.setCor(0, 1, 1, 1);
        quadrado1.setRotation(0);

        paralelogramo1 = new Paralelogramo(gl, 120);
        paralelogramo1.setTranslate(270, 270);
        paralelogramo1.setCor(1, 0, 0, 1);
        paralelogramo1.setRotation(1);

        triangulo5 = new Triangulo(gl, 120);
        triangulo5.setTranslate(212, 150);
        triangulo5.setCor(0,1,0,1);
        triangulo5.setRotation(0);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        triangulo1.desenha();
        triangulo2.desenha();
        triangulo3.desenha();
        triangulo4.desenha();
        triangulo5.desenha();
        quadrado1.desenha();
        paralelogramo1.desenha();
    }
}