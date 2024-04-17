package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.sleep.ui.sleepscore.f1;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class h1 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1.h f60984a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f1.h hVar) {
        super(0);
        this.f60984a = hVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        f1.h hVar = this.f60984a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = hVar.f60966b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "EXTRA_FIRST_TRACK_EVER");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "EXTRA_FIRST_TRACK_EVER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_FIRST_TRACK_EVER of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
