package com.withings.healthplus.congrats.ui.activity;

import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import ym0.l;
/* compiled from: CompletionActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CompletionActivity f40091a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CompletionActivity completionActivity) {
        super(1);
        this.f40091a = completionActivity;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        CompletionActivity completionActivity = this.f40091a;
        cr.a.a(new j(CompletionActivity.B3(completionActivity), num), new a(completionActivity));
        completionActivity.finish();
        return y.f85009a;
    }
}
