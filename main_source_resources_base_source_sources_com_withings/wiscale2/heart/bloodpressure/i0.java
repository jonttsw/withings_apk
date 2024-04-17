package com.withings.wiscale2.heart.bloodpressure;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.User;
import com.withings.wiscale2.heart.bloodpressure.d0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0.c f57387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(d0.c cVar) {
        super(0);
        this.f57387a = cVar;
    }

    @Override // ym0.a
    public final User invoke() {
        d0.c cVar = this.f57387a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = cVar.f57359b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", q0.b(User.class), " is not supported"));
    }
}
