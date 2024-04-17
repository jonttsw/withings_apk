package com.withings.measure.detail.paged;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.measure.detail.paged.d;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes4.dex */
public final class f extends w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d.g f41728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d.g gVar) {
        super(0);
        this.f41728a = gVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        d.g gVar = this.f41728a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = gVar.f41726b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "EXTRA_FIRST_DATE");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "EXTRA_FIRST_DATE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_FIRST_DATE of class ", q0.b(DateTime.class), " is not supported"));
    }
}
