package com.withings.zendesk.ui;

import com.withings.zendesk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: HelpCenterActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigation/e;", "invoke", "()Landroidx/navigation/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class HelpCenterActivity$navController$2 extends w implements ym0.a<androidx.navigation.e> {
    final /* synthetic */ HelpCenterActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterActivity$navController$2(HelpCenterActivity helpCenterActivity) {
        super(0);
        this.this$0 = helpCenterActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final androidx.navigation.e invoke() {
        return b50.b.d(this.this$0, R.id.nav_host_fragment);
    }
}
