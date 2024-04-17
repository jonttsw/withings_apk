package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.ui.sleepscore.y3;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class i4 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y3.e f61021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(y3.e eVar) {
        super(0);
        this.f61021a = eVar;
    }

    @Override // ym0.a
    public final User invoke() {
        y3.e eVar = this.f61021a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = eVar.f61576b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "EXTRA_USER");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "EXTRA_USER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_USER of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
