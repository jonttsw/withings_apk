package com.withings.wiscale2.push;

import androidx.core.app.r;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: HMFirebaseMessagingService.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HMFirebaseMessagingService f59566a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f59567b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HMFirebaseMessagingService hMFirebaseMessagingService, r rVar) {
        super(0);
        this.f59566a = hMFirebaseMessagingService;
        this.f59567b = rVar;
    }

    @Override // ym0.a
    public final y invoke() {
        androidx.core.app.y.c(this.f59566a).e(null, 0, this.f59567b.c());
        return y.f85009a;
    }
}
