package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.content.Context;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AddHeartRateCameraFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateCameraFragment$captureSessionFail$1", f = "AddHeartRateCameraFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class n extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f58254a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, qm0.d<? super n> dVar) {
        super(2, dVar);
        this.f58254a = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new n(this.f58254a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m mVar = this.f58254a;
        Context context = mVar.getContext();
        if (context != null) {
            qc.b B = new qc.b(context).B(mVar.getString(C1987R.string._HEARTRATE_MEASURE_FAILED_SIGNAL_TOO_LOW_TITLE_));
            B.v(mVar.getString(C1987R.string._HEARTRATE_MEASURE_FAILED_SIGNAL_TOO_LOW_MESSAGE_));
            B.z(C1987R.string._OK_, new Object()).s();
        }
        return nm0.y.f85009a;
    }
}
