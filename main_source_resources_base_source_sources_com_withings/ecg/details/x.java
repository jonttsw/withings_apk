package com.withings.ecg.details;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.ecg.details.g;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g.f f38353a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g.f fVar) {
        super(0);
        this.f38353a = fVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        g.f fVar = this.f38353a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = fVar.f38217b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
