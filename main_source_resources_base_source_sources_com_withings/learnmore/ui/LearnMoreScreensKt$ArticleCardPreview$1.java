package com.withings.learnmore.ui;

import ah.o;
import androidx.compose.runtime.a;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LearnMoreScreens.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LearnMoreScreensKt$ArticleCardPreview$1 extends w implements p<a, Integer, y> {
    final /* synthetic */ int $$changed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreScreensKt$ArticleCardPreview$1(int i11) {
        super(2);
        this.$$changed = i11;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(a aVar, int i11) {
        LearnMoreScreensKt.ArticleCardPreview(aVar, o.g(this.$$changed | 1));
    }
}
