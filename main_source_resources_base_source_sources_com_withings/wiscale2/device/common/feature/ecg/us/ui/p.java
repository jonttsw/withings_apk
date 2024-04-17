package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.ecg.webservices.EcgReviewRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.common.feature.ecg.us.ui.o;
import java.io.Serializable;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
public final class p extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final r70.c f52041a;

    /* renamed from: b  reason: collision with root package name */
    private final rq.f f52042b;

    /* renamed from: c  reason: collision with root package name */
    private final EcgReviewRemoteRepository f52043c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<o> f52044d;

    /* compiled from: EcgReviewActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.ui.EcgReviewViewModel$uiState$1", f = "EcgReviewActivity.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT, ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT, ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY, ConstantsWs.MEASURE_TYPE_SNORING_INTENSITY, ConstantsWs.MEASURE_TYPE_CYCLE_DURATION, 186, ConstantsWs.MEASURE_TYPE_R6_25KHZ_SEGMENT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super o>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Serializable f52045a;

        /* renamed from: b  reason: collision with root package name */
        Object f52046b;

        /* renamed from: c  reason: collision with root package name */
        int f52047c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f52048d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f52050f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ EcgReviewRemoteRepository f52051g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f52052h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5, EcgReviewRemoteRepository ecgReviewRemoteRepository, long j11, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f52050f = j5;
            this.f52051g = ecgReviewRemoteRepository;
            this.f52052h = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f52050f, this.f52051g, this.f52052h, dVar);
            aVar.f52048d = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(FlowCollector<? super o> flowCollector, qm0.d<? super y> dVar) {
            return ((a) create(flowCollector, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.us.ui.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p(r70.c userRepository, rq.f fVar, long j5, long j11, EcgReviewRemoteRepository ecgReviewRemoteRepository) {
        u.j(userRepository, "userRepository");
        u.j(ecgReviewRemoteRepository, "ecgReviewRemoteRepository");
        this.f52041a = userRepository;
        this.f52042b = fVar;
        this.f52043c = ecgReviewRemoteRepository.withSyncContext("ecg_review_view");
        this.f52044d = FlowKt.stateIn(FlowKt.flowOn(FlowKt.flow(new a(j5, ecgReviewRemoteRepository, j11, null)), Dispatchers.getIO()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), o.c.f52040a);
    }

    public final StateFlow<o> i0() {
        return this.f52044d;
    }
}
