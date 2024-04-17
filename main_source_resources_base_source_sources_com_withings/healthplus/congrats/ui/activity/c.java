package com.withings.healthplus.congrats.ui.activity;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: CompletionActivity.kt */
/* loaded from: classes3.dex */
final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CompletionActivity f40092a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CompletionActivity completionActivity) {
        super(2);
        this.f40092a = completionActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            CompletionActivity completionActivity = this.f40092a;
            du.a.a(CompletionActivity.A3(completionActivity), new b(completionActivity), aVar2, 0);
        }
        return y.f85009a;
    }
}
