package com.withings.wiscale2.legacyprograms;

import com.google.android.material.tabs.TabLayout;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: ProgramMenuActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/google/android/material/tabs/TabLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ProgramMenuActivity$tabLayout$2 extends w implements ym0.a<TabLayout> {
    final /* synthetic */ ProgramMenuActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgramMenuActivity$tabLayout$2(ProgramMenuActivity programMenuActivity) {
        super(0);
        this.this$0 = programMenuActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final TabLayout invoke() {
        return (TabLayout) this.this$0.findViewById(C1987R.id.tabLayout);
    }
}
