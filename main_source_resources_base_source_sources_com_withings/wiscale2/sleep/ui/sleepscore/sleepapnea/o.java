package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.app.Application;
import androidx.lifecycle.k1;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity;
import org.joda.time.DateTime;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class o implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepDisorderActivity f61404a;

    public o(SleepDisorderActivity sleepDisorderActivity) {
        this.f61404a = sleepDisorderActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        User J3;
        boolean L3;
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        SleepDisorderActivity sleepDisorderActivity = this.f61404a;
        Application application = sleepDisorderActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        J3 = sleepDisorderActivity.J3();
        DateTime D3 = SleepDisorderActivity.D3(sleepDisorderActivity);
        L3 = sleepDisorderActivity.L3();
        return new SleepDisorderActivity.b(application, J3, D3, L3);
    }
}
