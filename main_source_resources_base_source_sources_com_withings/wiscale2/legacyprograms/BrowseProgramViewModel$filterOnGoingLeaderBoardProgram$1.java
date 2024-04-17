package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BrowseProgramActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.BrowseProgramViewModel", f = "BrowseProgramActivity.kt", l = {203}, m = "filterOnGoingLeaderBoardProgram")
/* loaded from: classes5.dex */
public final class BrowseProgramViewModel$filterOnGoingLeaderBoardProgram$1 extends kotlin.coroutines.jvm.internal.c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BrowseProgramViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseProgramViewModel$filterOnGoingLeaderBoardProgram$1(BrowseProgramViewModel browseProgramViewModel, qm0.d<? super BrowseProgramViewModel$filterOnGoingLeaderBoardProgram$1> dVar) {
        super(dVar);
        this.this$0 = browseProgramViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object filterOnGoingLeaderBoardProgram;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        filterOnGoingLeaderBoardProgram = this.this$0.filterOnGoingLeaderBoardProgram(null, this);
        return filterOnGoingLeaderBoardProgram;
    }
}
