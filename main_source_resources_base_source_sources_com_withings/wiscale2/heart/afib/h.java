package com.withings.wiscale2.heart.afib;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.library.measure.Measure;
import com.withings.wiscale2.heart.afib.e;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.w implements ym0.a<Measure> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e.d f57159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e.d dVar) {
        super(0);
        this.f57159a = dVar;
    }

    @Override // ym0.a
    public final Measure invoke() {
        e.d dVar = this.f57159a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Measure.class);
        Fragment fragment = dVar.f57143b;
        if (isAssignableFrom) {
            return (Measure) yq.b.d(fragment, "measure");
        }
        if (Serializable.class.isAssignableFrom(Measure.class)) {
            return (Measure) yq.b.e(fragment, "measure");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra measure of class ", kotlin.jvm.internal.q0.b(Measure.class), " is not supported"));
    }
}
