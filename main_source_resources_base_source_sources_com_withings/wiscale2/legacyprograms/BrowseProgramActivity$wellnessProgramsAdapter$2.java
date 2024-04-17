package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: BrowseProgramActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/legacyprograms/WellnessProgramsAdapter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class BrowseProgramActivity$wellnessProgramsAdapter$2 extends w implements ym0.a<WellnessProgramsAdapter> {
    final /* synthetic */ BrowseProgramActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseProgramActivity$wellnessProgramsAdapter$2(BrowseProgramActivity browseProgramActivity) {
        super(0);
        this.this$0 = browseProgramActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final WellnessProgramsAdapter invoke() {
        return new WellnessProgramsAdapter(this.this$0);
    }
}
