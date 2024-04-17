package com.withings.wiscale2.vo2max.view;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.vo2max.view.i1;
import java.io.Serializable;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.w implements ym0.a<MeasuresGroup> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i1.e f62798a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(i1.e eVar) {
        super(0);
        this.f62798a = eVar;
    }

    @Override // ym0.a
    public final MeasuresGroup invoke() {
        i1.e eVar = this.f62798a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MeasuresGroup.class);
        Fragment fragment = eVar.f62775b;
        if (isAssignableFrom) {
            return (MeasuresGroup) yq.b.d(fragment, "key_measure");
        }
        if (Serializable.class.isAssignableFrom(MeasuresGroup.class)) {
            return (MeasuresGroup) yq.b.e(fragment, "key_measure");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra key_measure of class ", kotlin.jvm.internal.q0.b(MeasuresGroup.class), " is not supported"));
    }
}
