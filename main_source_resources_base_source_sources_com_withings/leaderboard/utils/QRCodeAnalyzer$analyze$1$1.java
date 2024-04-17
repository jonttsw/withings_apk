package com.withings.leaderboard.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: QRCodeAnalyzer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lae/a;", "kotlin.jvm.PlatformType", "", "it", "Lnm0/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class QRCodeAnalyzer$analyze$1$1 extends w implements l<List<ae.a>, y> {
    final /* synthetic */ QRCodeAnalyzer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRCodeAnalyzer$analyze$1$1(QRCodeAnalyzer qRCodeAnalyzer) {
        super(1);
        this.this$0 = qRCodeAnalyzer;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(List<ae.a> list) {
        invoke2(list);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ae.a> list) {
        QRCodeAnalyzer qRCodeAnalyzer = this.this$0;
        u.g(list);
        qRCodeAnalyzer.onQRCodesFound(list);
    }
}
