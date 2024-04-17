package com.withings.wiscale2.device.common.feature;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.widget.l0;
import kotlin.jvm.internal.w;
/* compiled from: DeviceFeatureFlowPrefs.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f50876a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f50877b;

    /* compiled from: DeviceFeatureFlowPrefs.kt */
    /* renamed from: com.withings.wiscale2.device.common.feature.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0687a extends w implements ym0.a<SharedPreferences> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f50878a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0687a(Context context) {
            super(0);
            this.f50878a = context;
        }

        @Override // ym0.a
        public final SharedPreferences invoke() {
            return this.f50878a.getSharedPreferences("feature_flow_prefs", 0);
        }
    }

    public a(Context context, long j5) {
        kotlin.jvm.internal.u.j(context, "context");
        this.f50876a = j5;
        this.f50877b = nm0.h.b(new C0687a(context));
    }

    public final boolean a(int i11) {
        Object value = this.f50877b.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        StringBuilder b10 = l0.b("featureFlow_", i11, "_deviceId_");
        b10.append(this.f50876a);
        return ((SharedPreferences) value).getBoolean(b10.toString(), false);
    }
}
