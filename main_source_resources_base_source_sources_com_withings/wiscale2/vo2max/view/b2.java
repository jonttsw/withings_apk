package com.withings.wiscale2.vo2max.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
/* compiled from: Vo2maxActivity.kt */
/* loaded from: classes5.dex */
public final class b2 extends com.withings.wiscale2.device.common.tutorial.g {

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f62693d;

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<SharedPreferences> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f62694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f62694a = context;
        }

        @Override // ym0.a
        public final SharedPreferences invoke() {
            return PreferenceManager.getDefaultSharedPreferences(this.f62694a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(Context context) {
        super(context, 2);
        kotlin.jvm.internal.u.j(context, "context");
        this.f62693d = nm0.h.b(new a(context));
    }

    @Override // com.withings.wiscale2.device.common.tutorial.g
    public final SharedPreferences b() {
        Object value = this.f62693d.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // com.withings.wiscale2.device.common.tutorial.g
    public final boolean c(Long l5) {
        return b().getBoolean("vo2maxTutorial_hasDisplayedVo2MaxTutorial", false);
    }

    @Override // com.withings.wiscale2.device.common.tutorial.g
    public final void d(Long l5) {
        b().edit().putBoolean("vo2maxTutorial_hasDisplayedVo2MaxTutorial", true).apply();
    }
}
