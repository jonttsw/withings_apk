package com.withings.design.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
/* loaded from: classes3.dex */
public final class CanvasHelper {

    /* renamed from: a  reason: collision with root package name */
    static final Rect f36151a = new Rect();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class TextVertAlign {

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ TextVertAlign[] f36152a = {new Enum("TOP", 0), new Enum("MIDDLE", 1), new Enum("BASELINE", 2), new Enum("BOTTOM", 3)};
        /* JADX INFO: Fake field, exist only in values array */
        TextVertAlign EF5;

        private TextVertAlign() {
            throw null;
        }

        public static TextVertAlign valueOf(String str) {
            return (TextVertAlign) Enum.valueOf(TextVertAlign.class, str);
        }

        public static TextVertAlign[] values() {
            return (TextVertAlign[]) f36152a.clone();
        }
    }

    public static void a(Canvas canvas, float f11, float f12, String str, Paint paint) {
        int length = str.length();
        Rect rect = f36151a;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, f11, (f12 - rect.top) - (rect.height() / 2), paint);
    }
}
