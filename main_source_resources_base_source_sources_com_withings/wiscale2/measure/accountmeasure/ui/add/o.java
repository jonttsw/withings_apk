package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AddHeartRateCameraFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateCameraFragment$liveHrMeasure$1", f = "AddHeartRateCameraFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f58255a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f58256b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, double d11, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f58255a = mVar;
        this.f58256b = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f58255a, this.f58256b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        m mVar = this.f58255a;
        TextView E1 = m.E1(mVar);
        double d11 = this.f58256b;
        if (E1 != null) {
            E1.setText(String.format("%.0f", Arrays.copyOf(new Object[]{new Double(d11)}, 1)));
        }
        if (d11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            mVar.Q = 60.0f / d11;
            m.B1(mVar);
        }
        return nm0.y.f85009a;
    }
}
