package com.withings.healthplus.explore.ui.activity;

import com.withings.contentproviders.eightfit.model.ContentCategory;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.p<String, ContentCategory, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40308a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ExploreTabActivity exploreTabActivity) {
        super(2);
        this.f40308a = exploreTabActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(String str, ContentCategory contentCategory) {
        String contentId = str;
        ContentCategory taskType = contentCategory;
        kotlin.jvm.internal.u.j(contentId, "contentId");
        kotlin.jvm.internal.u.j(taskType, "taskType");
        ExploreTabActivity.E3(this.f40308a).p0(contentId, taskType.getWsValue());
        return nm0.y.f85009a;
    }
}
