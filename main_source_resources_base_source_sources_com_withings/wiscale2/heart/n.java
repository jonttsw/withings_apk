package com.withings.wiscale2.heart;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class n extends w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartHistoryActivity.m f57783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(HeartHistoryActivity.m mVar) {
        super(0);
        this.f57783a = mVar;
    }

    @Override // ym0.a
    public final User invoke() {
        HeartHistoryActivity.m mVar = this.f57783a;
        mVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = mVar.f57061b;
        if (isAssignableFrom) {
            return (User) b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", q0.b(User.class), " is not supported"));
    }
}
