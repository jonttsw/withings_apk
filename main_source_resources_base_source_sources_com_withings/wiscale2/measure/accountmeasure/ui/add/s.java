package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddHeartRateCameraFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateCameraFragment$showMeasureProblemNext$1", f = "AddHeartRateCameraFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class s extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f58274a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, qm0.d<? super s> dVar) {
        super(2, dVar);
        this.f58274a = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new s(this.f58274a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TextView S1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m mVar = this.f58274a;
        S1 = mVar.S1();
        if (S1 != null) {
            S1.setText(mVar.getString(C1987R.string._HR_DO_NOT_PRESS_TOO_HARD_));
        }
        return nm0.y.f85009a;
    }
}
