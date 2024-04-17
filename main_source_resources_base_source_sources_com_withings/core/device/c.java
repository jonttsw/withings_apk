package com.withings.core.device;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.core.device.FullScreenVideoActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class c extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FullScreenVideoActivity.d f35350a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FullScreenVideoActivity.d dVar) {
        super(0);
        this.f35350a = dVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        FullScreenVideoActivity.d dVar = this.f35350a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = dVar.f35326b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, " canSkip");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, " canSkip");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra  canSkip of class ", q0.b(Boolean.class), " is not supported"));
    }
}
