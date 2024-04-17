package com.withings.wiscale2.activity.workout.ui.detail;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.activity.workout.ui.detail.u6;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes4.dex */
public final class z6 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u6.d f49839a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(u6.d dVar) {
        super(0);
        this.f49839a = dVar;
    }

    @Override // ym0.a
    public final User invoke() {
        u6.d dVar = this.f49839a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = dVar.f49707b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
