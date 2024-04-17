package com.withings.weight.legacy;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.user.User;
import com.withings.weight.legacy.n;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Fragment.kt */
/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n.e f47085a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n.e eVar) {
        super(0);
        this.f47085a = eVar;
    }

    @Override // ym0.a
    public final User invoke() {
        n.e eVar = this.f47085a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = eVar.f47076b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "arg_user");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "arg_user");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra arg_user of class ", q0.b(User.class), " is not supported"));
    }
}
