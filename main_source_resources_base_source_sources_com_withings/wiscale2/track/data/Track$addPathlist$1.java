package com.withings.wiscale2.track.data;

import com.withings.amazon.model.Pathlist;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Track.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/withings/amazon/model/Pathlist;", "Lnm0/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Track$addPathlist$1 extends w implements l<List<Pathlist>, y> {
    final /* synthetic */ Pathlist $pathList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Track$addPathlist$1(Pathlist pathlist) {
        super(1);
        this.$pathList = pathlist;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(List<Pathlist> list) {
        invoke2(list);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Pathlist> mutableChanges) {
        u.j(mutableChanges, "$this$mutableChanges");
        mutableChanges.add(this.$pathList);
    }
}
