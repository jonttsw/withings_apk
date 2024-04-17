package com.withings.ecg.live;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.ecg.live.LiveEcgActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.a<u70.i> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity.m f38659a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(LiveEcgActivity.m mVar) {
        super(0);
        this.f38659a = mVar;
    }

    @Override // ym0.a
    public final u70.i invoke() {
        LiveEcgActivity.m mVar = this.f38659a;
        mVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(u70.i.class);
        Activity activity = mVar.f38622b;
        if (isAssignableFrom) {
            return (u70.i) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "mac");
        }
        if (Serializable.class.isAssignableFrom(u70.i.class)) {
            return (u70.i) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "mac");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra mac of class ", q0.b(u70.i.class), " is not supported"));
    }
}
