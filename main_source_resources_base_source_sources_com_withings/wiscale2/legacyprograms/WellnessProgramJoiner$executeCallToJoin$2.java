package com.withings.wiscale2.legacyprograms;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/k;", "Ltu/b;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lnm0/k;"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$2", f = "WellnessProgramJoiner.kt", l = {ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX, ConstantsWs.MEASURE_TYPE_ABORTED_WEIGHT, 135, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MIN, ConstantsWs.MEASURE_TYPE_SPECIFIC_GRAVITY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class WellnessProgramJoiner$executeCallToJoin$2 extends i implements p<CoroutineScope, qm0.d<? super k<? extends tu.b>>, Object> {
    final /* synthetic */ int $programId;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WellnessProgramJoiner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramJoiner$executeCallToJoin$2(WellnessProgramJoiner wellnessProgramJoiner, int i11, qm0.d<? super WellnessProgramJoiner$executeCallToJoin$2> dVar) {
        super(2, dVar);
        this.this$0 = wellnessProgramJoiner;
        this.$programId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WellnessProgramJoiner$executeCallToJoin$2(this.this$0, this.$programId, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, qm0.d<? super k<? extends tu.b>> dVar) {
        return invoke2(coroutineScope, (qm0.d<? super k<tu.b>>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, qm0.d<? super k<tu.b>> dVar) {
        return ((WellnessProgramJoiner$executeCallToJoin$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
