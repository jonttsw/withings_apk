package com.withings.wiscale2.heart.bloodpressure;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.heart.bloodpressure.k;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k.e f57444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k.e eVar) {
        super(0);
        this.f57444a = eVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        k.e eVar = this.f57444a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = eVar.f57423b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "extra_date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "extra_date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_date of class ", q0.b(DateTime.class), " is not supported"));
    }
}
