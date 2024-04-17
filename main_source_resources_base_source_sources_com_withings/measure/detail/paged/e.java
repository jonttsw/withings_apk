package com.withings.measure.detail.paged;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.measure.detail.paged.d;
import com.withings.user.User;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes4.dex */
public final class e extends w implements ym0.a<User> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d.f f41727a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d.f fVar) {
        super(0);
        this.f41727a = fVar;
    }

    @Override // ym0.a
    public final User invoke() {
        d.f fVar = this.f41727a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(User.class);
        Fragment fragment = fVar.f41724b;
        if (isAssignableFrom) {
            return (User) yq.b.d(fragment, "EXTRA_USER");
        }
        if (Serializable.class.isAssignableFrom(User.class)) {
            return (User) yq.b.e(fragment, "EXTRA_USER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_USER of class ", q0.b(User.class), " is not supported"));
    }
}
