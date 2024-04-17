package com.withings.wiscale2.settings;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class q1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f60257a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60258b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(e.n<Intent, ActivityResult> nVar, SettingsActivity settingsActivity) {
        super(0);
        this.f60257a = nVar;
        this.f60258b = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f60257a.a(new Intent(this.f60258b, UnitsActivity.class));
        return nm0.y.f85009a;
    }
}
