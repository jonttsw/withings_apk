package com.withings.wiscale2.device.common.feature.highlowhr;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.user.User;
import com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRSettingsActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRSettingsActivity.d f52268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(HighLowHRSettingsActivity.d dVar) {
        super(0);
        this.f52268a = dVar;
    }

    @Override // ym0.a
    public final User invoke() {
        HighLowHRSettingsActivity.d dVar = this.f52268a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = dVar.f52206b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_USER");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_USER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_USER of class ", q0.b(User.class), " is not supported"));
    }
}
