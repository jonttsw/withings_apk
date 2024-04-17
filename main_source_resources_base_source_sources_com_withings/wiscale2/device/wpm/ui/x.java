package com.withings.wiscale2.device.wpm.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.a<u70.i> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity.g f55793a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Wpm0203Activity.g gVar) {
        super(0);
        this.f55793a = gVar;
    }

    @Override // ym0.a
    public final u70.i invoke() {
        Wpm0203Activity.g gVar = this.f55793a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(u70.i.class);
        Activity activity = gVar.f55674b;
        if (isAssignableFrom) {
            return (u70.i) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "macAddress");
        }
        if (Serializable.class.isAssignableFrom(u70.i.class)) {
            return (u70.i) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "macAddress");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra macAddress of class ", q0.b(u70.i.class), " is not supported"));
    }
}
