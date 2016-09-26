package kr.hs.emirim.dahoe0304.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreator18 on 2016. 9. 26..
 */
public class MyImage extends View{
    MyImage(Context context) {
        super(context);    //view를 상속받음
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.dog);    //bitmap객체로 변환
        float cx=getWidth()/2.0f;   //뷰의 정중앙좌표
        float cy=getHeight()/2.0f;
        float x = (getWidth() - picture.getWidth()) / 2.0f;
        float y = (getHeight() - picture.getHeight()) / 2.0f;
        //   canvas.rotate(180,cx,cy); //이미지 회전
        //   canvas.translate(-150,200); //이미지 이동
        //   canvas.scale(2,2,cx,cy); //이미지 크기
        canvas.skew(0.4f,0.4f);  //이미지비틀기
        canvas.drawBitmap(picture, x, y, null);
    }
}
