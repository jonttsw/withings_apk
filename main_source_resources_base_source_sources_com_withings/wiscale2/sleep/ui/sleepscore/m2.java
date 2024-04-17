package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.sleep.ui.sleepscore.h2;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class m2 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h2.f f61152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(h2.f fVar) {
        super(0);
        this.f61152a = fVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        h2.f fVar = this.f61152a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = fVar.f61010b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "extra_day");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "extra_day");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_day of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
