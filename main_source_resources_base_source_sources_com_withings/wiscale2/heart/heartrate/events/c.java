package com.withings.wiscale2.heart.heartrate.events;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.heart.heartrate.events.HeartRateEventsActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class c extends w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateEventsActivity.c f57640a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HeartRateEventsActivity.c cVar) {
        super(0);
        this.f57640a = cVar;
    }

    @Override // ym0.a
    public final User invoke() {
        HeartRateEventsActivity.c cVar = this.f57640a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Activity activity = cVar.f57632b;
        if (isAssignableFrom) {
            return (User) b0.F(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) b0.H(activity, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(g.a("extra user of class ", q0.b(User.class), " is not supported"));
    }
}
