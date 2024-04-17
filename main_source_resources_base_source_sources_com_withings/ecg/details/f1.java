package com.withings.ecg.details;

import com.withings.user.core.models.User;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgInReviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgInReviewViewModel$ecgReviewStatusFromBackend$1", f = "EcgInReviewViewModel.kt", l = {89, 95, 98, 107}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super rq.b>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    User f38190a;

    /* renamed from: b  reason: collision with root package name */
    Object f38191b;

    /* renamed from: c  reason: collision with root package name */
    int f38192c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f38193d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ EcgInReviewViewModel f38194e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(EcgInReviewViewModel ecgInReviewViewModel, qm0.d<? super f1> dVar) {
        super(2, dVar);
        this.f38194e = ecgInReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        f1 f1Var = new f1(this.f38194e, dVar);
        f1Var.f38193d = obj;
        return f1Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super rq.b> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((f1) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.details.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
