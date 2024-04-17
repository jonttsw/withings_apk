package com.withings.wiscale2.heart.bloodpressure;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BloodPressureMeasureListActivity.f f57343a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(BloodPressureMeasureListActivity.f fVar) {
        super(0);
        this.f57343a = fVar;
    }

    @Override // ym0.a
    public final User invoke() {
        BloodPressureMeasureListActivity.f fVar = this.f57343a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = fVar.f57330b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", q0.b(User.class), " is not supported"));
    }
}
