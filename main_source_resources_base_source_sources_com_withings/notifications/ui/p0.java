package com.withings.notifications.ui;

import com.withings.common.compose.component.card.stack.CardTextSize;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c10.c<?> f43089a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43090b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<c10.c<?>, nm0.y> f43091c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p0(c10.c<?> cVar, ym0.l<? super c10.c<?>, nm0.y> lVar, ym0.l<? super c10.c<?>, nm0.y> lVar2) {
        super(3);
        this.f43089a = cVar;
        this.f43090b = lVar;
        this.f43091c = lVar2;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        CardTextSize cardTextSize = CardTextSize.f33628a;
        ym0.l<c10.c<?>, nm0.y> lVar = this.f43091c;
        h.c(this.f43089a, this.f43090b, lVar, null, cardTextSize, aVar, 24584, 8);
        return nm0.y.f85009a;
    }
}
