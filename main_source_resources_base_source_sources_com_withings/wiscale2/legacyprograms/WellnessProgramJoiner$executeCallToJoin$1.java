package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner", f = "WellnessProgramJoiner.kt", l = {122}, m = "executeCallToJoin-gIAlu-s")
/* loaded from: classes5.dex */
public final class WellnessProgramJoiner$executeCallToJoin$1 extends kotlin.coroutines.jvm.internal.c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WellnessProgramJoiner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramJoiner$executeCallToJoin$1(WellnessProgramJoiner wellnessProgramJoiner, qm0.d<? super WellnessProgramJoiner$executeCallToJoin$1> dVar) {
        super(dVar);
        this.this$0 = wellnessProgramJoiner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object m45executeCallToJoingIAlus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m45executeCallToJoingIAlus = this.this$0.m45executeCallToJoingIAlus(0, this);
        if (m45executeCallToJoingIAlus == CoroutineSingletons.f76214a) {
            return m45executeCallToJoingIAlus;
        }
        return k.a(m45executeCallToJoingIAlus);
    }
}
