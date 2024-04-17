package com.withings.library.authentication.di;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: Koin.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lvq0/a;", "invoke", "()Lvq0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class KoinKt$getWith$1 extends w implements a<vq0.a> {
    final /* synthetic */ Object[] $params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinKt$getWith$1(Object[] objArr) {
        super(0);
        this.$params = objArr;
    }

    @Override // ym0.a
    public final vq0.a invoke() {
        Object[] objArr = this.$params;
        Object[] parameters = Arrays.copyOf(objArr, objArr.length);
        u.j(parameters, "parameters");
        return new vq0.a(l.e0(parameters), 2);
    }
}
