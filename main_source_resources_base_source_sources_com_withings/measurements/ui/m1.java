package com.withings.measurements.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measurements.ui.HealthVerticalActivity;
import com.withings.user.core.models.User;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class m1 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity.d f42077a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(HealthVerticalActivity.d dVar) {
        super(0);
        this.f42077a = dVar;
    }

    @Override // ym0.a
    public final User invoke() {
        HealthVerticalActivity.d dVar = this.f42077a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = dVar.f41927b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
