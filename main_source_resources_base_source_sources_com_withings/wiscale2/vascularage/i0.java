package com.withings.wiscale2.vascularage;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.vascularage.y;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y.i f62325a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(y.i iVar) {
        super(0);
        this.f62325a = iVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        y.i iVar = this.f62325a;
        iVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = iVar.f62555b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "selectedDate");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "selectedDate");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra selectedDate of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
