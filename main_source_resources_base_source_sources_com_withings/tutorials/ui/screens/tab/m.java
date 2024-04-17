package com.withings.tutorials.ui.screens.tab;

import com.withings.tutorials.ui.screens.tab.TabPresentationActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class m extends w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TabPresentationActivity.c f46286a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TabPresentationActivity.c cVar) {
        super(0);
        this.f46286a = cVar;
    }

    @Override // ym0.a
    public final String invoke() {
        return b0.I(this.f46286a.f46251b, "tab_type");
    }
}
