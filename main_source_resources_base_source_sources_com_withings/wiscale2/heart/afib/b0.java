package com.withings.wiscale2.heart.afib;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.User;
import com.withings.wiscale2.heart.afib.y;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y.j f57128a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y.j jVar) {
        super(0);
        this.f57128a = jVar;
    }

    @Override // ym0.a
    public final User invoke() {
        y.j jVar = this.f57128a;
        jVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = jVar.f57294b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "extra_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "extra_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
