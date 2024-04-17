package com.withings.wiscale2.device.common.tutorial;

import android.content.Context;
import android.content.SharedPreferences;
import com.withings.wiscale2.vo2max.view.b2;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: Tutorial.kt */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f53576a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f53577b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f53578c;

    /* compiled from: Tutorial.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static g a(Context context, int i11, Long l5) {
            g cVar;
            u.j(context, "context");
            g gVar = null;
            switch (i11) {
                case 1:
                    gVar = new hi0.d(context);
                    break;
                case 2:
                    gVar = new b2(context);
                    break;
                case 3:
                    if (l5 != null) {
                        cVar = new gi0.c(context, l5.longValue());
                        gVar = cVar;
                        break;
                    }
                    break;
                case 4:
                    if (l5 != null) {
                        cVar = new hi0.c(context, l5.longValue());
                        gVar = cVar;
                        break;
                    }
                    break;
                case 5:
                    gVar = new hi0.a(context);
                    break;
                case 6:
                    gVar = new hi0.e(context);
                    break;
            }
            if (gVar == null) {
                return new g(context, Integer.valueOf(i11));
            }
            return gVar;
        }
    }

    /* compiled from: Tutorial.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<SharedPreferences> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final SharedPreferences invoke() {
            return g.this.a().getSharedPreferences("tutorialPrefs", 0);
        }
    }

    public g(Context context, Integer num) {
        u.j(context, "context");
        this.f53576a = context;
        this.f53577b = num;
        this.f53578c = nm0.h.b(new b());
    }

    public final Context a() {
        return this.f53576a;
    }

    public SharedPreferences b() {
        Object value = this.f53578c.getValue();
        u.i(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public boolean c(Long l5) {
        SharedPreferences b10 = b();
        return b10.getBoolean("tutorialSeen_" + this.f53577b + "_forUserId_" + l5, false);
    }

    public void d(Long l5) {
        SharedPreferences.Editor edit = b().edit();
        edit.putBoolean("tutorialSeen_" + this.f53577b + "_forUserId_" + l5, true).apply();
    }
}
