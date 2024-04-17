package com.withings.zendesk.ui;

import android.content.Intent;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: HelpCenterActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class HelpCenterActivity$articleId$2 extends w implements ym0.a<Long> {
    final /* synthetic */ HelpCenterActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterActivity$articleId$2(HelpCenterActivity helpCenterActivity) {
        super(0);
        this.this$0 = helpCenterActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final Long invoke() {
        Object obj;
        Intent intent = this.this$0.getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT < 33) {
            Object serializableExtra = intent.getSerializableExtra("article_id");
            if (!(serializableExtra instanceof Long)) {
                serializableExtra = null;
            }
            obj = (Long) serializableExtra;
        } else {
            obj = intent.getSerializableExtra("article_id", Long.class);
        }
        return (Long) obj;
    }
}
