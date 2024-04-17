package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.sleep.ui.sleepscore.k4;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class m4 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4.h f61154a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(k4.h hVar) {
        super(0);
        this.f61154a = hVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        k4.h hVar = this.f61154a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = hVar.f61136b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, "EXTRA_FIRST_TRACK_EVER");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, "EXTRA_FIRST_TRACK_EVER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_FIRST_TRACK_EVER of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
