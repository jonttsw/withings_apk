package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.sleep.ui.sleepscore.k0;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0.i f60878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k0.i iVar) {
        super(0);
        this.f60878a = iVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        k0.i iVar = this.f60878a;
        iVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = iVar.f61110b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "EXTRA_DAY");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "EXTRA_DAY");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_DAY of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
