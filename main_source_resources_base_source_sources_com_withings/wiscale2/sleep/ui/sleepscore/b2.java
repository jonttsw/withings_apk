package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.sleep.ui.sleepscore.t1;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class b2 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t1.f f60892a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(t1.f fVar) {
        super(0);
        this.f60892a = fVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        t1.f fVar = this.f60892a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = fVar.f61522b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "key_isSleepApnea");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "key_isSleepApnea");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra key_isSleepApnea of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
