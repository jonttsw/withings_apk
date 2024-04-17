package com.withings.learnmore.ui;

import com.withings.learnmore.adapter.LearnMoreEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.a;
import ym0.l;
/* compiled from: LearnMoreSimpleList.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class LearnMoreSimpleListKt$LearnMoreSimpleList$1$1$1$1 extends w implements a<y> {
    final /* synthetic */ LearnMoreEntry $item;
    final /* synthetic */ l<LearnMoreEntry, y> $onItemClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LearnMoreSimpleListKt$LearnMoreSimpleList$1$1$1$1(l<? super LearnMoreEntry, y> lVar, LearnMoreEntry learnMoreEntry) {
        super(0);
        this.$onItemClicked = lVar;
        this.$item = learnMoreEntry;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemClicked.invoke(this.$item);
    }
}
