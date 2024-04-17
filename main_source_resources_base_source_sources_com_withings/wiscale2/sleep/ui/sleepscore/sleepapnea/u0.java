package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.o0;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0.g f61469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(o0.g gVar) {
        super(0);
        this.f61469a = gVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        o0.g gVar = this.f61469a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = gVar.f61425b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "key_is_sleep_apnea");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "key_is_sleep_apnea");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra key_is_sleep_apnea of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
