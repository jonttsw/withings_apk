package com.withings.wiscale2.legacyprograms;

import com.withings.views.view.SectionView;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lnm0/y;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramDetailsActivity$initViewModel$2$3 extends w implements l<String, y> {
    final /* synthetic */ WellnessProgramDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailsActivity$initViewModel$2$3(WellnessProgramDetailsActivity wellnessProgramDetailsActivity) {
        super(1);
        this.this$0 = wellnessProgramDetailsActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(String str) {
        invoke2(str);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        SectionView deviceSectionTitleView;
        u.j(it, "it");
        deviceSectionTitleView = this.this$0.getDeviceSectionTitleView();
        deviceSectionTitleView.setTitle(it);
    }
}
