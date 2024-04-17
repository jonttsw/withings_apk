package com.withings.ecg.details;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.ecg.details.EcgResultActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class l2 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgResultActivity.f f38262a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(EcgResultActivity.f fVar) {
        super(0);
        this.f38262a = fVar;
    }

    @Override // ym0.a
    public final User invoke() {
        EcgResultActivity.f fVar = this.f38262a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = fVar.f38039b;
        if (isAssignableFrom) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
