package com.withings.zendesk.ui;

import android.content.Intent;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: HelpCenterActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class HelpCenterActivity$productInfo$2 extends w implements ym0.a<ProductHelpCenter> {
    final /* synthetic */ HelpCenterActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterActivity$productInfo$2(HelpCenterActivity helpCenterActivity) {
        super(0);
        this.this$0 = helpCenterActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ProductHelpCenter invoke() {
        Object parcelableExtra;
        Intent intent = this.this$0.getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT < 33) {
            parcelableExtra = intent.getParcelableExtra("product_info");
        } else {
            parcelableExtra = intent.getParcelableExtra("product_info", ProductHelpCenter.class);
        }
        return (ProductHelpCenter) parcelableExtra;
    }
}
