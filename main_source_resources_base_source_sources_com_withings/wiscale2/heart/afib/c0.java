package com.withings.wiscale2.heart.afib;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.heart.afib.y;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y.k f57129a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(y.k kVar) {
        super(0);
        this.f57129a = kVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        y.k kVar = this.f57129a;
        kVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = kVar.f57296b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "extra_day");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "extra_day");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_day of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
