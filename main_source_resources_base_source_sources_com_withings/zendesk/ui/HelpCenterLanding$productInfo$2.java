package com.withings.zendesk.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: HelpCenterLanding.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class HelpCenterLanding$productInfo$2 extends w implements ym0.a<ProductHelpCenter> {
    final /* synthetic */ HelpCenterLanding this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterLanding$productInfo$2(HelpCenterLanding helpCenterLanding) {
        super(0);
        this.this$0 = helpCenterLanding;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ProductHelpCenter invoke() {
        HelpCenterLandingArgs args;
        args = this.this$0.getArgs();
        return args.getProductInfo();
    }
}
