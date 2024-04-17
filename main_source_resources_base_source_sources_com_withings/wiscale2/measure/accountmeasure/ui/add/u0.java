package com.withings.wiscale2.measure.accountmeasure.ui.add;

import androidx.fragment.app.Fragment;
import com.withings.wiscale2.measure.accountmeasure.ui.add.o0;
import java.util.Arrays;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.w implements ym0.a<Double> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0.c f58279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(o0.c cVar) {
        super(0);
        this.f58279a = cVar;
    }

    @Override // ym0.a
    public final Double invoke() {
        Fragment fragment = this.f58279a.f58260b;
        kotlin.jvm.internal.u.j(fragment, "<this>");
        if (yq.b.a(fragment).containsKey("EXTRA_INPUT_VALUE")) {
            return Double.valueOf(yq.b.a(fragment).getDouble("EXTRA_INPUT_VALUE", Double.NaN));
        }
        throw new NullPointerException(String.format("argument %s not expected to be null", Arrays.copyOf(new Object[]{"EXTRA_INPUT_VALUE"}, 1)));
    }
}
