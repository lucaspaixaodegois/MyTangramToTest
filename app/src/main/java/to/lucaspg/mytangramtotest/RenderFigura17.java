package to.lucaspg.mytangramtotest;


import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import to.lucaspg.mytangramtotest.figurasGeometricas.Paralelogramo;
import to.lucaspg.mytangramtotest.figurasGeometricas.Quadrado;
import to.lucaspg.mytangramtotest.figurasGeometricas.Triangulo;

public class RenderFigura17 implements GLSurfaceView.Renderer {


    private Triangulo triangulo1;
    private Triangulo triangulo2;
    private Triangulo triangulo3;
    private Triangulo triangulo4;
    private Triangulo triangulo5;
    private Quadrado quadrado;
    private Paralelogramo paralelogramo;

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        gl.glClearColor(1, 1, 1, 1);


    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        gl.glViewport(0, 0, width, height);

        gl.glMatrixMode(GL10.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrthof(0, width, 0, height, -1, 1);
        gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();

        triangulo1 = new Triangulo(gl, 160);
        triangulo1.setTranslate(580, 800);
        triangulo1.setCor(0, 1, 0.5f, 1);
        triangulo1.setRotation(-45);

        quadrado = new Quadrado(gl, 100);
        quadrado.setTranslate(640, 750);
        quadrado.setCor(0.5f, 0.0f, 0.5f, 1);
        quadrado.setRotation(0);

        paralelogramo = new Paralelogramo(gl, 200);
        paralelogramo.setTranslate(590, 600);
        paralelogramo.setCor(1, 0.5f, 0.5f, 1);
        paralelogramo.setRotation(1);

        triangulo2 = new Triangulo(gl, 200);
        triangulo2.setTranslate(628, 500);
        triangulo2.setCor(0.3f, 0.3f, 0.5f, 1);
        triangulo2.setRotation(135);

        triangulo3 = new Triangulo(gl, 200);
        triangulo3.setTranslate(770, 360);
        triangulo3.setCor(0.1f, 0.6f, 0.5f, 1);
        triangulo3.setRotation(-45);

        triangulo4 = new Triangulo(gl, 120);
        triangulo4.setTranslate(570, 300);
        triangulo4.setCor(1, 0, 0.0f, 1);
        triangulo4.setRotation(-180);


        triangulo5 = new Triangulo(gl, 120);
        triangulo5.setTranslate(835, 310);
        triangulo5.setCor(0, 0, 1, 1);
        triangulo5.setRotation(98);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        triangulo1.desenha();
        quadrado.desenha();
        paralelogramo.desenha();
        triangulo2.desenha();
        triangulo3.desenha();
        triangulo4.desenha();
        triangulo5.desenha();

    }
}