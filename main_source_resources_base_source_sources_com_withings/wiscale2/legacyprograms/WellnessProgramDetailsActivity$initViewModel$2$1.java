package com.withings.wiscale2.legacyprograms;

import com.withings.programs.model.program.ProgramDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "program", "Lnm0/y;", "invoke", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramDetailsActivity$initViewModel$2$1 extends w implements l<ProgramDomain.LegacyDomain, y> {
    final /* synthetic */ WellnessProgramDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailsActivity$initViewModel$2$1(WellnessProgramDetailsActivity wellnessProgramDetailsActivity) {
        super(1);
        this.this$0 = wellnessProgramDetailsActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(ProgramDomain.LegacyDomain legacyDomain) {
        invoke2(legacyDomain);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ProgramDomain.LegacyDomain legacyDomain) {
        if (legacyDomain != null) {
            this.this$0.showProgramDetails(legacyDomain);
        }
    }
}
