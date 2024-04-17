package com.withings.paywall.subscription;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SubscriptionScreen.kt */
/* loaded from: classes4.dex */
final class d extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f43682a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Intent f43683b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, Intent intent) {
        super(0);
        this.f43682a = context;
        this.f43683b = intent;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f43682a.startActivity(this.f43683b);
        return y.f85009a;
    }
}
