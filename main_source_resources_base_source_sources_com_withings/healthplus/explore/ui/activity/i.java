package com.withings.healthplus.explore.ui.activity;

import com.google.gson.Gson;
import com.withings.contentproviders.eightfit.model.ContentCategory;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class i extends kotlin.jvm.internal.w implements ym0.r<ContentCategory, String, String, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.r<ContentCategory, String, String, Integer, nm0.y> f40315a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f40316b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f40317c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(ym0.r<? super ContentCategory, ? super String, ? super String, ? super Integer, nm0.y> rVar, long j5, int i11) {
        super(4);
        this.f40315a = rVar;
        this.f40316b = j5;
        this.f40317c = i11;
    }

    @Override // ym0.r
    public final nm0.y invoke(ContentCategory contentCategory, String str, String str2, Integer num) {
        String programTaskId = str2;
        kotlin.jvm.internal.u.j(programTaskId, "programTaskId");
        String json = new Gson().toJson(new NavigationArguments.ProgramInformation(this.f40316b, this.f40317c, programTaskId));
        kotlin.jvm.internal.u.i(json, "toJson(...)");
        this.f40315a.invoke(contentCategory, str, json, num);
        return nm0.y.f85009a;
    }
}
