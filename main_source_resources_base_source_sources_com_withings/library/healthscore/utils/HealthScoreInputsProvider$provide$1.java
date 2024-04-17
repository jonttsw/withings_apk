package com.withings.library.healthscore.utils;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthScoreInputsProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.healthscore.utils.HealthScoreInputsProvider", f = "HealthScoreInputsProvider.kt", l = {33, 36, 43, 50, 57, 63, 69, 72, 79, 86, 99, 106, 113, ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX}, m = "provide")
/* loaded from: classes4.dex */
public final class HealthScoreInputsProvider$provide$1 extends c {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthScoreInputsProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthScoreInputsProvider$provide$1(HealthScoreInputsProvider healthScoreInputsProvider, d<? super HealthScoreInputsProvider$provide$1> dVar) {
        super(dVar);
        this.this$0 = healthScoreInputsProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.provide(0L, null, 0, 0, this);
    }
}
