package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.s;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s.g f61291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(s.g gVar) {
        super(0);
        this.f61291a = gVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        s.g gVar = this.f61291a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = gVar.f61464b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "arg_is_sleep_apnea");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "arg_is_sleep_apnea");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra arg_is_sleep_apnea of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
