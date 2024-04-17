package com.withings.wiscale2.device.wam02.ui;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.device.wam02.ui.Wam02PolarizationActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import u70.i;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d extends w implements ym0.a<i> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wam02PolarizationActivity.c f54907a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Wam02PolarizationActivity.c cVar) {
        super(0);
        this.f54907a = cVar;
    }

    @Override // ym0.a
    public final i invoke() {
        Wam02PolarizationActivity.c cVar = this.f54907a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(i.class);
        Activity activity = cVar.f54898b;
        if (isAssignableFrom) {
            return (i) b0.F(activity, "macAddress");
        }
        if (Serializable.class.isAssignableFrom(i.class)) {
            return (i) b0.H(activity, "macAddress");
        }
        throw new IllegalArgumentException(g.a("extra macAddress of class ", q0.b(i.class), " is not supported"));
    }
}
