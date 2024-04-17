package com.withings.wiscale2;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import java.util.List;
/* compiled from: ShareWithMyDoctor.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.ShareWithMyDoctorViewModel$exportText$1$1", f = "ShareWithMyDoctor.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX, ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class s2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<p2>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f59575a;

    /* renamed from: b  reason: collision with root package name */
    int f59576b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f59577c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<MeasuresGroup> f59578d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t2 f59579e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var, List list, qm0.d dVar) {
        super(2, dVar);
        this.f59578d = list;
        this.f59579e = t2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        s2 s2Var = new s2(this.f59579e, this.f59578d, dVar);
        s2Var.f59577c = obj;
        return s2Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<p2> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((s2) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.s2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
