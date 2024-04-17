package com.withings.coach.chatbot;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
/* compiled from: RoundedRightCornerTransformation.kt */
/* loaded from: classes3.dex */
public final class k1 implements ja.c {

    /* renamed from: a  reason: collision with root package name */
    private final float f33018a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33019b;

    public k1() {
        String cacheKey = k1.class + "-72.0";
        kotlin.jvm.internal.u.j(cacheKey, "cacheKey");
        this.f33018a = 72.0f;
        this.f33019b = cacheKey;
    }

    @Override // ja.c
    public final String getCacheKey() {
        return this.f33019b;
    }

    @Override // ja.c
    public final Object transform(Bitmap bitmap, ha.e eVar, qm0.d<? super Bitmap> dVar) {
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        kotlin.jvm.internal.u.i(config, "getConfig(...)");
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        float width2 = createBitmap.getWidth();
        float height2 = createBitmap.getHeight();
        float f11 = this.f33018a;
        float f12 = 2 * f11;
        canvas.drawRoundRect(new RectF(width2 - f12, 0.0f, width2, f12 + 0), f11, f11, paint);
        float f13 = width2 - f11;
        canvas.drawRect(new RectF(0.0f, 0.0f, f13, height2), paint);
        canvas.drawRect(new RectF(f13, f11, width2, height2), paint);
        return createBitmap;
    }
}
