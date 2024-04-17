package com.withings.wiscale2.vo2max.view;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.User;
import com.withings.wiscale2.vo2max.view.i1;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i1.d f62795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(i1.d dVar) {
        super(0);
        this.f62795a = dVar;
    }

    @Override // ym0.a
    public final User invoke() {
        i1.d dVar = this.f62795a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = dVar.f62773b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "key_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "key_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra key_user of class ", kotlin.jvm.internal.q0.b(User.class), " is not supported"));
    }
}
