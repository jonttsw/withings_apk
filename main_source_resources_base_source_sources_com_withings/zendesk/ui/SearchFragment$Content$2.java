package com.withings.zendesk.ui;

import ah.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SearchFragment$Content$2 extends w implements p<androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<Object> $results;
    final /* synthetic */ SearchFragment $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$Content$2(SearchFragment searchFragment, List<? extends Object> list, int i11) {
        super(2);
        this.$tmp0_rcvr = searchFragment;
        this.$results = list;
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(androidx.compose.runtime.a aVar, int i11) {
        this.$tmp0_rcvr.Content(this.$results, aVar, o.g(this.$$changed | 1));
    }
}
