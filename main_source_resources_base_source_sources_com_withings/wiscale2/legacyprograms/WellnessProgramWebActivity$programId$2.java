package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: WellnessProgramWebActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WellnessProgramWebActivity$programId$2 extends w implements ym0.a<Integer> {
    final /* synthetic */ WellnessProgramWebActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramWebActivity$programId$2(WellnessProgramWebActivity wellnessProgramWebActivity) {
        super(0);
        this.this$0 = wellnessProgramWebActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(this.this$0.getIntent().getIntExtra("extra_program_id", 0));
    }
}
