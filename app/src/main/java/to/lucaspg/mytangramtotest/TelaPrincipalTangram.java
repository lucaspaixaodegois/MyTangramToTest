package to.lucaspg.mytangramtotest;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//Classe principal do APP//implements SensorEventListener
public class TelaPrincipalTangram extends AppCompatActivity{


    private GLSurfaceView superficieDesenho = null;//Declara uma referenci para a superfice de desenho.
    private Renderizador render = null; //inicia um objeto render do tipo renderizador
    //testando outros desenhos
    private RenderFigura7 render1 = null;//inicia um objeto RenderFigura7 do tipo renderizador
    private RenderFigura17 render2 = null;//inicia um objeto RenderFigura7 do tipo renderizador

   /* SensorManager sensorManager;
    Sensor acelerometro;
    public float sensorX, sensorY, sensorZ;*/


    protected void onCreate(Bundle savedInstanceState) {//metodo chamado quando o app é inicializado.

        super.onCreate(savedInstanceState);//2- Instancia um objeto da superficie de desenho.
        this.superficieDesenho = new GLSurfaceView(this); //publica a superficie de desenho na tela.

        this.render = new Renderizador();//publica,instancia render.

        //testando outros desenhos
        this.render1 = new RenderFigura7();// para rodar  outro desenho na mesma superficie
        this.render2 = new RenderFigura17(); // para rodar outro desenho na mesma superficie

        this.superficieDesenho.setRenderer(this.render);//Configura o objeto que será desenhado na superficie desenho.
        this.superficieDesenho.setOnTouchListener(this.render); //espera como parametro uma classe q implementa o onthouchlistener
        setContentView(this.superficieDesenho);//publica  a superficie desenho.

        /*  sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        acelerometro = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, acelerometro, SensorManager.SENSOR_DELAY_NORMAL);*/

    }
/*
    public void onSensorChanged(SensorEvent event) {

        sensorX = event.values[0];
        sensorY = event.values[1];
        sensorZ = event.values[2];
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }*/
}