package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.ui.sleepscore.n2;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class p2 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n2.h f61187a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(n2.h hVar) {
        super(0);
        this.f61187a = hVar;
    }

    @Override // ym0.a
    public final User invoke() {
        n2.h hVar = this.f61187a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = hVar.f61176b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "EXTRA_USER");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "EXTRA_USER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_USER of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
