package com.withings.zendesk.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import s0.i0;
import ym0.l;
/* compiled from: SearchFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls0/i0;", "Lnm0/y;", "invoke", "(Ls0/i0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class SearchFragment$Content$1 extends w implements l<i0, y> {
    final /* synthetic */ List<Object> $results;
    final /* synthetic */ SearchFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$Content$1(List<? extends Object> list, SearchFragment searchFragment) {
        super(1);
        this.$results = list;
        this.this$0 = searchFragment;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(i0 LazyColumn) {
        u.j(LazyColumn, "$this$LazyColumn");
        List<Object> list = this.$results;
        SearchFragment searchFragment = this.this$0;
        LazyColumn.c(list.size(), null, new SearchFragment$Content$1$invoke$$inlined$items$default$3(SearchFragment$Content$1$invoke$$inlined$items$default$1.INSTANCE, list), new s1.a(true, -632812321, new SearchFragment$Content$1$invoke$$inlined$items$default$4(list, searchFragment)));
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(i0 i0Var) {
        invoke2(i0Var);
        return y.f85009a;
    }
}
