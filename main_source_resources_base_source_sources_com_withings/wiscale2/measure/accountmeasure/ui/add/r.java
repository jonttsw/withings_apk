package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddHeartRateCameraFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateCameraFragment$showMeasureProblem$1", f = "AddHeartRateCameraFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class r extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f58272a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, qm0.d<? super r> dVar) {
        super(2, dVar);
        this.f58272a = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r(this.f58272a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TextView R1;
        TextView S1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m mVar = this.f58272a;
        R1 = mVar.R1();
        if (R1 != null) {
            R1.setText(C1987R.string.glyph_warning);
        }
        S1 = mVar.S1();
        if (S1 != null) {
            S1.setText(mVar.getString(C1987R.string._HR_DO_NOT_MOVE_));
        }
        return nm0.y.f85009a;
    }
}
