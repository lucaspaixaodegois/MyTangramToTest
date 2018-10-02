package to.lucaspg.mytangramtotest;


import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import to.lucaspg.mytangramtotest.figurasGeometricas.Paralelogramo;
import to.lucaspg.mytangramtotest.figurasGeometricas.Quadrado;
import to.lucaspg.mytangramtotest.figurasGeometricas.Triangulo;


//classe que ira implementar a logica do desenho implementa  as duas interfaces
public class Renderizador implements GLSurfaceView.Renderer {

    private Triangulo triangulo1, triangulo2, triangulo3, triangulo4, triangulo5;
    private Quadrado quadrado1;
    private Paralelogramo paralelogramo1;
    private float altura, x, y, largura;

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) { //chamado quando a superficie de desenho é criada

        gl.glClearColor(1, 1, 1, 1);//configura a cor de limpeza no formato RGBA
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) { //chamado quando a superficie de desenho sofre  alguma alteração

        altura = height;
        largura = width;
        gl.glViewport(0, 0, width, height); //mapeia a cena inteira
        gl.glMatrixMode(GL10.GL_PROJECTION); //configurando a area de coordenadas do plano cartesiano
        gl.glLoadIdentity();//substitui a matriz atual pela matriz de identidade.
        gl.glOrthof(0, width, 0, height, -1, 1);//definem os limites da projeção. no  2D, define a área visível da tela em unidades OpenGL.
        gl.glMatrixMode(GL10.GL_MODELVIEW);//Especifica o destino das operações das matriz subsequentes.
        gl.glLoadIdentity();//substitui a matriz atual pela matriz de identidade.


//chifreEsquerdo
        triangulo1 = new Triangulo(gl, 150);
        triangulo1.setTranslate(650, 800);
        triangulo1.setCor(0, 0, 0, 1);
        triangulo1.setRotation(90);

//cabeca
        quadrado1 = new Quadrado(gl, 120);
        quadrado1.setTranslate(775, 665);
        quadrado1.setCor(1, 0, 0, 1);
        quadrado1.setRotation(0);

//chifreDireito
        triangulo2 = new Triangulo(gl, 150);
        triangulo2.setTranslate(900, 800);
        triangulo2.setCor(0, 1, 0, 1);
        triangulo2.setRotation(-180);

//patasFrente
        triangulo3 = new Triangulo(gl, 250);
        triangulo3.setTranslate(610, 480);
        triangulo3.setCor(0.5f, 0, 0.5f, 1);
        triangulo3.setRotation(-90);

//barriga
        triangulo4 = new Triangulo(gl, 150);
        triangulo4.setTranslate(490, 500);
        triangulo4.setCor(1, 1, 0, 0);
        triangulo4.setRotation(-45);

//patasTras
        triangulo5 = new Triangulo(gl, 250);
        triangulo5.setTranslate(370, 480);
        triangulo5.setCor(0, 0, 1, 1);
        triangulo5.setRotation(-360);

//rabo
        paralelogramo1 = new Paralelogramo(gl, 130);
        paralelogramo1.setTranslate(185, 540);
        paralelogramo1.setCor(0, 1, 1, 1);
        paralelogramo1.setRotation(1);


    }

    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        triangulo1.desenha();
        triangulo2.desenha();
        triangulo3.desenha();
        triangulo4.desenha();
        triangulo4.desenha();
        triangulo5.desenha();
        quadrado1.desenha();
        paralelogramo1.desenha();

    }

}
