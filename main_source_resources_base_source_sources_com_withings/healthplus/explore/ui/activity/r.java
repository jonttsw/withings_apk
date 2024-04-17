package com.withings.healthplus.explore.ui.activity;

import com.google.gson.Gson;
import com.withings.healthplus.explore.ui.activity.ExploreTabActivity;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.w implements ym0.p<Integer, Boolean, String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity.a.AbstractC0526a.C0527a f40335a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ExploreTabActivity.a.AbstractC0526a.C0527a c0527a) {
        super(2);
        this.f40335a = c0527a;
    }

    @Override // ym0.p
    public final String invoke(Integer num, Boolean bool) {
        return new Gson().toJson(new NavigationArguments.MissionInformation(num.intValue(), bool.booleanValue(), this.f40335a.f()));
    }
}
