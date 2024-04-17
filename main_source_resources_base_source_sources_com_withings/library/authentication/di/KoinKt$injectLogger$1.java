package com.withings.library.authentication.di;

import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.w;
import ym0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Koin.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lvq0/a;", "invoke", "()Lvq0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class KoinKt$injectLogger$1 extends w implements a<vq0.a> {
    final /* synthetic */ String $tag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinKt$injectLogger$1(String str) {
        super(0);
        this.$tag = str;
    }

    @Override // ym0.a
    public final vq0.a invoke() {
        return new vq0.a(l.e0(new Object[]{this.$tag}), 2);
    }
}
