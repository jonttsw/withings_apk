package com.withings.zendesk.ui;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", FirebaseAnalytics.Param.INDEX, "", "invoke", "(I)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchFragment$Content$1$invoke$$inlined$items$default$3 extends w implements l<Integer, Object> {
    final /* synthetic */ l $contentType;
    final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$Content$1$invoke$$inlined$items$default$3(l lVar, List list) {
        super(1);
        this.$contentType = lVar;
        this.$items = list;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i11) {
        return this.$contentType.invoke(this.$items.get(i11));
    }
}
