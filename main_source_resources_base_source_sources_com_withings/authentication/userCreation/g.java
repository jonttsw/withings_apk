package com.withings.authentication.userCreation;

import androidx.compose.material.c5;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32507a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BottomSheetType f32508b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f32509c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m70.f f32510d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f32511e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CoroutineScope coroutineScope, BottomSheetType bottomSheetType, c5 c5Var, m70.f fVar, int i11) {
        super(2);
        this.f32507a = coroutineScope;
        this.f32508b = bottomSheetType;
        this.f32509c = c5Var;
        this.f32510d = fVar;
        this.f32511e = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f32511e | 1);
        c5 c5Var = this.f32509c;
        m70.f fVar = this.f32510d;
        h.c(this.f32507a, this.f32508b, c5Var, fVar, aVar, g11);
        return y.f85009a;
    }
}
