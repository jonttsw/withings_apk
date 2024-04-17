package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WellnessProgramDetailsActivity$isLastIterationFinished$2 extends w implements ym0.a<Boolean> {
    final /* synthetic */ WellnessProgramDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailsActivity$isLastIterationFinished$2(WellnessProgramDetailsActivity wellnessProgramDetailsActivity) {
        super(0);
        this.this$0 = wellnessProgramDetailsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getIntent().getBooleanExtra("EXTRA_LAST_ITERATION_FINISHED", false));
    }
}
