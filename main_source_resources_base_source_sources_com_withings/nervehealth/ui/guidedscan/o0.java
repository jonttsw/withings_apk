package com.withings.nervehealth.ui.guidedscan;

import android.os.CountDownTimer;
import androidx.lifecycle.h1;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: NerveHealthGuidedScanViewModel.kt */
/* loaded from: classes4.dex */
public final class o0 extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanViewModel f42647a;

    /* compiled from: NerveHealthGuidedScanViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanViewModel$timer$2$1$onFinish$1", f = "NerveHealthGuidedScanViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NerveHealthGuidedScanViewModel f42648a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f42648a = nerveHealthGuidedScanViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f42648a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            MutableStateFlow mutableStateFlow2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel = this.f42648a;
            mutableStateFlow = nerveHealthGuidedScanViewModel.f42540k;
            mutableStateFlow2 = nerveHealthGuidedScanViewModel.f42540k;
            mutableStateFlow.setValue(p0.a((p0) mutableStateFlow2.getValue(), null));
            NerveHealthGuidedScanViewModel.B0(nerveHealthGuidedScanViewModel);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel) {
        super(DeviceSession.DEVICE_SESSION_TTL, 1000L);
        this.f42647a = nerveHealthGuidedScanViewModel;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel = this.f42647a;
        BuildersKt__Builders_commonKt.launch$default(h1.a(nerveHealthGuidedScanViewModel), null, null, new a(nerveHealthGuidedScanViewModel, null), 3, null);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j5) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        e0 e0Var;
        NerveHealthGuidedScanViewModel nerveHealthGuidedScanViewModel = this.f42647a;
        mutableStateFlow = nerveHealthGuidedScanViewModel.f42540k;
        mutableStateFlow2 = nerveHealthGuidedScanViewModel.f42540k;
        e0Var = nerveHealthGuidedScanViewModel.f42531b;
        mutableStateFlow.setValue(p0.a((p0) mutableStateFlow2.getValue(), e0Var.a(j5)));
    }
}
