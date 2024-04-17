package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import java.util.Locale;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class m4 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51518a;

    public m4(EcgActivationActivity ecgActivationActivity) {
        this.f51518a = ecgActivationActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        EcgActivationActivity ecgActivationActivity = this.f51518a;
        e5 e5Var = ecgActivationActivity.f51066h;
        if (e5Var != null) {
            Device O3 = EcgActivationActivity.O3(ecgActivationActivity);
            Context applicationContext = ecgActivationActivity.getApplicationContext();
            kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
            com.withings.wiscale2.device.common.feature.d dVar = new com.withings.wiscale2.device.common.feature.d(applicationContext);
            Integer d11 = mw.a.d(EcgActivationActivity.O3(ecgActivationActivity));
            kotlin.jvm.internal.u.g(d11);
            String string = ecgActivationActivity.getString(d11.intValue());
            kotlin.jvm.internal.u.i(string, "getString(...)");
            Locale US = Locale.US;
            kotlin.jvm.internal.u.i(US, "US");
            return e5Var.a(O3, dVar, string, US);
        }
        kotlin.jvm.internal.u.s("ecgActivationViewModelFactory");
        throw null;
    }
}
