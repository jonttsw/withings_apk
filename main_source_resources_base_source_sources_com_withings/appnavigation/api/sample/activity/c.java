package com.withings.appnavigation.api.sample.activity;

import com.withings.appnavigation.api.sample.activity.SampleNavigationActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class c extends w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SampleNavigationActivity.b f31290a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SampleNavigationActivity.b bVar) {
        super(0);
        this.f31290a = bVar;
    }

    @Override // ym0.a
    public final String invoke() {
        return b0.I(this.f31290a.f31285b, "title");
    }
}
